// CORERemfactRevise
package com.uni.core.doe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DAOUpdateData {

    private final Connection conn;

    public DAOUpdateData(Connection conn) {
        this.conn = conn;
    }

    public void updateRemifactNRInBothTables(String remisionNum) {
        if (remisionNum.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de remisión no puede estar vacío.");
            return;
        }

        String remifactNR = "NR" + remisionNum;

        String checkQuery = "SELECT COUNT(*) FROM TRADE WHERE REMISION = ?";
        try {
            PreparedStatement checkStatement = conn.prepareStatement(checkQuery);
            checkStatement.setString(1, remisionNum);
            ResultSet resultSet = checkStatement.executeQuery();
            resultSet.next();
            int rowCount = resultSet.getInt(1);
            if (rowCount == 0) {
                JOptionPane.showMessageDialog(null, "El número de remisión especificado no existe en la tabla TRADE.");
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar el número de remisión en la tabla TRADE: " + ex.getMessage());
            ex.printStackTrace();
            return;
        }

        // Recuperar los NRODCTO de la tabla TRADE para la remisión dada
        String nroDctoQuery = "SELECT NRODCTO FROM TRADE WHERE ORIGEN = 'FAC' AND TIPODCTO = 'RE' AND REMISION = ?";
        try {
            PreparedStatement nroDctoStatement = conn.prepareStatement(nroDctoQuery);
            nroDctoStatement.setString(1, remisionNum);
            ResultSet nroDctoResultSet = nroDctoStatement.executeQuery();

            while (nroDctoResultSet.next()) {
                String nroDcto = nroDctoResultSet.getString("NRODCTO");

                if (nroDcto == null) {
                    JOptionPane.showMessageDialog(null, "No se pudo encontrar NRODCTO correspondiente en la tabla TRADE.");
                    continue;
                }

                // Actualizar REMIFACT en la tabla TRADE
                String updateQuery1 = "UPDATE TRADE SET REMIFACT = ? ,FACTURADO=1 WHERE ORIGEN = 'FAC' AND TIPODCTO = 'RE' AND REMISION = ?";
                try {
                    PreparedStatement statement1 = conn.prepareStatement(updateQuery1);
                    statement1.setString(1, remifactNR);
                    statement1.setString(2, remisionNum);
                    statement1.executeUpdate();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al actualizar el código en TRADE: " + ex.getMessage());
                    ex.printStackTrace();
                }

                // Actualizar REMIFACT en la tabla MVTRADE
                String updateQuery2 = "UPDATE MVTRADE SET REMIFACT = ? ,FACTURADO=1 WHERE ORIGEN = 'FAC' AND TIPODCTO = 'RE' AND NRODCTO = ?";
                try {
                    PreparedStatement statement2 = conn.prepareStatement(updateQuery2);
                    statement2.setString(1, remifactNR);
                    statement2.setString(2, nroDcto);
                    statement2.executeUpdate();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error al actualizar el código en MVTRADE: " + ex.getMessage());
                    ex.printStackTrace();
                }
            }

            JOptionPane.showMessageDialog(null, "Código actualizado correctamente en ambas tablas.");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al recuperar NRODCTO de la tabla TRADE: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void limpiarCampos(JTextField jTextField_REMI_IN, JTextArea jTextArea_ViewPrevAntiRemFac) {
        jTextField_REMI_IN.setText("");
        jTextArea_ViewPrevAntiRemFac.setText("");
    }

}
