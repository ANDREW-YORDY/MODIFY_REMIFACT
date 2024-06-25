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

    public void updateRemifactNRInBothTables(String nrodcto, String nroremis) {
        if (nrodcto.isEmpty() || nroremis.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Los campos no pueden estar vacíos.");
            return;
        }

        String remifactNR = "NR" + nroremis;

        // Verificar si el número de documento existe en la tabla TRADE
        String checkQuery = "SELECT COUNT(*) FROM TRADE WHERE NRODCTO = ?";
        try {
            PreparedStatement checkStatement = conn.prepareStatement(checkQuery);
            checkStatement.setString(1, nrodcto);
            ResultSet resultSet = checkStatement.executeQuery();
            resultSet.next();
            int rowCount = resultSet.getInt(1);
            if (rowCount == 0) {
                JOptionPane.showMessageDialog(null, "El número de remisión ingresado no existe.");
                return;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al verificar la remisión ingresada: " + ex.getMessage());
            ex.printStackTrace();
            return;
        }
        
        // Mostrar panel de confirmación
        int confirm = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea actualizar la remisión?", "Confirmar actualización", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        // Actualizar REMIFACT en la tabla TRADE
        String updateQuery1 = "UPDATE TRADE SET REMIFACT = ?, FACTURADO = 1 WHERE ORIGEN = 'FAC' AND TIPODCTO = 'RE' AND NRODCTO = ?";
        try {
            PreparedStatement statement1 = conn.prepareStatement(updateQuery1);
            statement1.setString(1, remifactNR);
            statement1.setString(2, nrodcto);
            statement1.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar remisión en el ENCABEZADO: " + ex.getMessage());
            ex.printStackTrace();
        }

        // Actualizar REMIFACT en la tabla MVTRADE
        String updateQuery2 = "UPDATE MVTRADE SET REMIFACT = ?, FACTURADO = 1 WHERE ORIGEN = 'FAC' AND TIPODCTO = 'RE' AND NRODCTO = ?";
        try {
            PreparedStatement statement2 = conn.prepareStatement(updateQuery2);
            statement2.setString(1, remifactNR);
            statement2.setString(2, nrodcto);
            statement2.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar remisión en el MOVIMIENTO: " + ex.getMessage());
            ex.printStackTrace();
        }

        JOptionPane.showMessageDialog(null, "Remisión actualizada correctamente.");
    }

    public void limpiarCampos(JTextField jTextField_NRODCTO_IN, JTextArea jTextArea_ViewPrevAntiRemFac) {
        jTextField_NRODCTO_IN.setText("");
        jTextArea_ViewPrevAntiRemFac.setText("");
    }
}
