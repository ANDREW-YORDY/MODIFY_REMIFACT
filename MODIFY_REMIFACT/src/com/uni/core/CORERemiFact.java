package com.uni.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class CORERemiFact {

    private final Connection conn;

    public CORERemiFact(Connection conn) {
        this.conn = conn;
    }

    // Mostrar datos de ambas tablas por NRODCTO // NRODCTO TEST 50749
    public void displayDataFromBothTablesByNroDcto(String NroDcto, JTextArea textArea) {
        String query1 = "SELECT FACTURADO, REMIFACT, NRODCTO FROM TRADE WHERE ORIGEN='FAC' AND TIPODCTO='RE' AND NRODCTO IN(?)";
        String query2 = "SELECT FACTURADO, REMIFACT, NRODCTO, CANTREMIS FROM MVTRADE WHERE ORIGEN='FAC' AND TIPODCTO='RE' AND NRODCTO IN(?)";

        try {
            PreparedStatement statement1 = conn.prepareStatement(query1);
            PreparedStatement statement2 = conn.prepareStatement(query2);

            statement1.setString(1, NroDcto);
            statement2.setString(1, NroDcto);

            StringBuilder resultText = new StringBuilder();

            // Resultados de la tabla TRADE
            resultText.append("*DATA FACTURA*:\n\n");
            ResultSet resultSet1 = statement1.executeQuery();
            while (resultSet1.next()) {
                resultText.append("FACTURADO: ").append(resultSet1.getInt("FACTURADO")).append(",")
                        .append("FACTURA: ").append(resultSet1.getString("REMIFACT")).append(",")
                        .append("NRODCTO: ").append(resultSet1.getString("NRODCTO")).append("\n");
            }

            //resultText.append("- - - - - - - - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            // Resultados de la tabla MVTRADE
            resultText.append("\n*DATA MVTRADE*:\n");
            ResultSet resultSet2 = statement2.executeQuery();
            while (resultSet2.next()) {
                resultText.append("FACTURADO:").append(resultSet2.getInt("FACTURADO")).append(",")
                        .append("REMIFACT:").append(resultSet2.getString("REMIFACT")).append(",")
                        .append("NRODCTO:").append(resultSet2.getString("NRODCTO")).append(",")
                        .append("CANTREMIS:").append(resultSet2.getInt("CANTREMIS")).append("\n");
            }

            textArea.setEditable(false);
            textArea.setText(resultText.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    // Método para actualizar el NRODCTO en ambas tablas
    public void updateNroDctoInInBothTables(String oldCod, String newCod) {
        int confirm = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea actualizar la remisión?", "Confirmar actualización", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        String updateQuery1 = "UPDATE TRADE SET NRODCTO = ? WHERE NRODCTO = ?";
        String updateQuery2 = "UPDATE MVTRADE SET NRODCTO = ? WHERE NRODCTO = ?";

        try {
            PreparedStatement statement1 = conn.prepareStatement(updateQuery1);
            PreparedStatement statement2 = conn.prepareStatement(updateQuery2);

            statement1.setString(1, newCod);
            statement1.setString(2, oldCod);
            statement2.setString(1, newCod);
            statement2.setString(2, oldCod);

            int rowsUpdated1 = statement1.executeUpdate();
            int rowsUpdated2 = statement2.executeUpdate();

            if (rowsUpdated1 > 0 && rowsUpdated2 > 0) {
                //JOptionPane.showMessageDialog(null, "Remisión actualizado correctamente en ambas tablas.");
                JOptionPane.showMessageDialog(null, "Remisión actualizada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron registros con la remisión ingresada.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar la remisión: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

// Método para obtener el valor actual de REMIFACT
    private String getCurrentRemifact(String nrodcto) throws SQLException {
        String remifactValue = ""; // Variable para almacenar el valor de REMIFACT
        String query = "SELECT REMIFACT FROM TRADE WHERE ORIGEN='FAC' AND TIPODCTO='RE' AND NRODCTO = ?";
        try (PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, nrodcto);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    // Asignar el valor de REMIFACT a la variable
                    remifactValue = resultSet.getString("REMIFACT");
                }
            }
        }
        return remifactValue; // Retornar el valor de REMIFACT
    }

    // Método para actualizar campos en ambas tablas
    public void updateFieldsInBothTables(String nrodcto) {
        try {
            // Obtener el valor actual de REMIFACT
            String currentRemifact = getCurrentRemifact(nrodcto);

            // Guardar el valor actual de REMIFACT en la columna NOTA
            String updateNotaQuery = "UPDATE TRADE SET NOTA = ? WHERE ORIGEN = 'FAC' AND TIPODCTO = 'RE' AND NRODCTO = ?";
            try (PreparedStatement updateNotaStmt = conn.prepareStatement(updateNotaQuery)) {
                updateNotaStmt.setString(1, "FACTURA ANTERIOR: " + currentRemifact);
                updateNotaStmt.setString(2, nrodcto);
                updateNotaStmt.executeUpdate();
            }

            // Actualizar los campos en ambas tablas
            String updateQuery1 = "UPDATE TRADE SET REMIFACT = '', FACTURADO = 0.0000000 WHERE ORIGEN = 'FAC' AND TIPODCTO = 'RE' AND NRODCTO = ?";
            String updateQuery2 = "UPDATE MVTRADE SET REMIFACT = '', FACTURADO = 0.0000000, CANTREMIS = 0.0000000 WHERE ORIGEN = 'FAC' AND TIPODCTO = 'RE' AND NRODCTO = ?";

            try (PreparedStatement statement1 = conn.prepareStatement(updateQuery1); PreparedStatement statement2 = conn.prepareStatement(updateQuery2)) {

                statement1.setString(1, nrodcto);
                statement2.setString(1, nrodcto);

                int rowsUpdated1 = statement1.executeUpdate();
                int rowsUpdated2 = statement2.executeUpdate();

                if (rowsUpdated1 > 0 && rowsUpdated2 > 0) {
                    JOptionPane.showMessageDialog(null, "Campos actualizados correctamente en ambas tablas.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontraron registros con la remisión ingresada.");
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los campos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    // Método para manejar la acción del checkbox
    public void handleCheckboxAction(boolean isSelected, JTextField jTextField_NEWNRODOC_IN) {
        if (isSelected) {
            int response = JOptionPane.showConfirmDialog(null, "¿Desea habilitar la opción de actualizar el número de documento?", "Confirmación", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                jTextField_NEWNRODOC_IN.setEnabled(true);
            } else {
                jTextField_NEWNRODOC_IN.setEnabled(false);
            }
        } else {
            jTextField_NEWNRODOC_IN.setEnabled(false);
        }
    }

    // Método para verificar si el campo está habilitado
    public boolean isFieldEnabled(JTextField jTextField_NEWNRODOC_IN) {
        return jTextField_NEWNRODOC_IN.isEnabled();
    }

    // Método para limpiar campos del formulario
    public void limpiarCampos(JTextField jTextField_NRODOC_IN, JTextField jTextField_NEWNRODOC_IN, JTextArea jTextArea_ViewPrevRemFac) {
        jTextField_NRODOC_IN.setText("");
        jTextField_NEWNRODOC_IN.setText("");
        jTextArea_ViewPrevRemFac.setText("");
    }
}

//package com.remfac.remfaccontroller;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import javax.swing.JOptionPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//public class RemFacController {
//
//    private final Connection conn;
//
//    public RemFacController(Connection conn) {
//        this.conn = conn;
//    }
//
//    // Mostrar datos de ambas tablas por NRODCTO // NRODCTO TEST 50749
//    public void displayDataFromBothTablesByNroDcto(String NroDcto, JTextArea textArea) {
//        String query1 = "SELECT FACTURADO, REMIFACT, NRODCTO FROM TRADE WHERE ORIGEN='FAC' AND TIPODCTO='RE' AND NRODCTO IN(?)";
//        String query2 = "SELECT FACTURADO, REMIFACT, NRODCTO, CANTREMIS FROM MVTRADE WHERE ORIGEN='FAC' AND TIPODCTO='RE' AND NRODCTO IN(?)";
//
//        try {
//            PreparedStatement statement1 = conn.prepareStatement(query1);
//            PreparedStatement statement2 = conn.prepareStatement(query2);
//
//            statement1.setString(1, NroDcto);
//            statement2.setString(1, NroDcto);
//
//            StringBuilder resultText = new StringBuilder();
//
//            // Resultados de la tabla TRADE
//            resultText.append("*DATA FACTURA*:\n\n");
//            ResultSet resultSet1 = statement1.executeQuery();
//            while (resultSet1.next()) {
//                resultText.append("FACTURADO: ").append(resultSet1.getInt("FACTURADO")).append(",")
//                        .append("FACTURA: ").append(resultSet1.getString("REMIFACT")).append(",")
//                        .append("NRODCTO: ").append(resultSet1.getString("NRODCTO")).append("\n");
//            }
//
//            //resultText.append("- - - - - - - - - - - -  - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
//            // Resultados de la tabla MVTRADE
//            resultText.append("\n*DATA MVTRADE*:\n");
//            ResultSet resultSet2 = statement2.executeQuery();
//            while (resultSet2.next()) {
//                resultText.append("FACTURADO:").append(resultSet2.getInt("FACTURADO")).append(",")
//                        .append("REMIFACT:").append(resultSet2.getString("REMIFACT")).append(",")
//                        .append("NRODCTO:").append(resultSet2.getString("NRODCTO")).append(",")
//                        .append("CANTREMIS:").append(resultSet2.getInt("CANTREMIS")).append("\n");
//            }
//
//            textArea.setEditable(false);
//            textArea.setText(resultText.toString());
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al obtener los datos: " + ex.getMessage());
//            ex.printStackTrace();
//        }
//    }
//
//    // Método para actualizar el NRODCTO en ambas tablas
//    public void updateNroDctoInInBothTables(String oldCod, String newCod) {
//        String updateQuery1 = "UPDATE TRADE SET NRODCTO = ? WHERE NRODCTO = ?";
//        String updateQuery2 = "UPDATE MVTRADE SET NRODCTO = ? WHERE NRODCTO = ?";
//
//        try {
//            PreparedStatement statement1 = conn.prepareStatement(updateQuery1);
//            PreparedStatement statement2 = conn.prepareStatement(updateQuery2);
//
//            statement1.setString(1, newCod);
//            statement1.setString(2, oldCod);
//            statement2.setString(1, newCod);
//            statement2.setString(2, oldCod);
//
//            int rowsUpdated1 = statement1.executeUpdate();
//            int rowsUpdated2 = statement2.executeUpdate();
//
//            if (rowsUpdated1 > 0 && rowsUpdated2 > 0) {
//                JOptionPane.showMessageDialog(null, "Código actualizado correctamente en ambas tablas.");
//            } else {
//                JOptionPane.showMessageDialog(null, "No se encontraron registros con el código especificado.");
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al actualizar el código: " + ex.getMessage());
//            ex.printStackTrace();
//        }
//    }
//
//// Método para obtener el valor actual de REMIFACT
//    private String getCurrentRemifact(String nrodcto) throws SQLException {
//        String remifactValue = ""; // Variable para almacenar el valor de REMIFACT
//        String query = "SELECT REMIFACT FROM TRADE WHERE ORIGEN='FAC' AND TIPODCTO='RE' AND NRODCTO = ?";
//        try (PreparedStatement statement = conn.prepareStatement(query)) {
//            statement.setString(1, nrodcto);
//            try (ResultSet resultSet = statement.executeQuery()) {
//                if (resultSet.next()) {
//                    // Asignar el valor de REMIFACT a la variable
//                    remifactValue = resultSet.getString("REMIFACT");
//                }
//            }
//        }
//        return remifactValue; // Retornar el valor de REMIFACT
//    }
//
//    // Método para actualizar campos en ambas tablas
//    public void updateFieldsInBothTables(String nrodcto) {
//        try {
//            // Obtener el valor actual de REMIFACT
//            String currentRemifact = getCurrentRemifact(nrodcto);
//
//            // Guardar el valor de REMIFACT en la columna NOTA, incluso si actualmente es nulo
//            String updateNotaQuery = "UPDATE TRADE SET NOTA = 'FACTURA ANTERIOR: ' + ? WHERE ORIGEN = 'FAC' AND TIPODCTO = 'RE' AND NRODCTO = ?";
//            try (PreparedStatement updateNotaStmt = conn.prepareStatement(updateNotaQuery)) {
//                updateNotaStmt.setString(1, currentRemifact);
//                updateNotaStmt.setString(2, nrodcto);
//                updateNotaStmt.executeUpdate();
//            }
//
//            // Actualizar los campos en ambas tablas
//            String updateQuery1 = "UPDATE TRADE SET REMIFACT = '', FACTURADO = 0.0000000 WHERE ORIGEN = 'FAC' AND TIPODCTO = 'RE' AND NRODCTO = ?";
//            String updateQuery2 = "UPDATE MVTRADE SET REMIFACT = '', FACTURADO = 0.0000000, CANTREMIS = 0.0000000 WHERE ORIGEN = 'FAC' AND TIPODCTO = 'RE' AND NRODCTO = ?";
//
//            try (PreparedStatement statement1 = conn.prepareStatement(updateQuery1); PreparedStatement statement2 = conn.prepareStatement(updateQuery2)) {
//
//                statement1.setString(1, nrodcto);
//                statement2.setString(1, nrodcto);
//
//                int rowsUpdated1 = statement1.executeUpdate();
//                int rowsUpdated2 = statement2.executeUpdate();
//
//                if (rowsUpdated1 > 0 && rowsUpdated2 > 0) {
//                    JOptionPane.showMessageDialog(null, "Campos actualizados correctamente en ambas tablas.");
//                } else {
//                    JOptionPane.showMessageDialog(null, "No se encontraron registros con el código especificado.");
//                }
//            }
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al actualizar los campos: " + ex.getMessage());
//            ex.printStackTrace();
//        }
//    }
//
//    // Método para manejar la acción del checkbox
//    public void handleCheckboxAction(boolean isSelected, JTextField jTextField_NEWNRODOC_IN) {
//        if (isSelected) {
//            int response = JOptionPane.showConfirmDialog(null, "¿Desea habilitar la opción de actualizar el número de documento?", "Confirmación", JOptionPane.YES_NO_OPTION);
//            if (response == JOptionPane.YES_OPTION) {
//                jTextField_NEWNRODOC_IN.setEnabled(true);
//            } else {
//                jTextField_NEWNRODOC_IN.setEnabled(false);
//            }
//        } else {
//            jTextField_NEWNRODOC_IN.setEnabled(false);
//        }
//    }
//
//    // Método para verificar si el campo está habilitado
//    public boolean isFieldEnabled(JTextField jTextField_NEWNRODOC_IN) {
//        return jTextField_NEWNRODOC_IN.isEnabled();
//    }
//
//    // Método para limpiar campos del formulario
//    public void limpiarCampos(JTextField jTextField_NRODOC_IN, JTextField jTextField_NEWNRODOC_IN, JTextArea jTextArea_ViewPrevRemFac) {
//        jTextField_NRODOC_IN.setText("");
//        jTextField_NEWNRODOC_IN.setText("");
//        jTextArea_ViewPrevRemFac.setText("");
//    }
//}

