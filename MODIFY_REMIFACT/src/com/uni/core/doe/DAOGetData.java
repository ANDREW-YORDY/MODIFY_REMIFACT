//CORERemfactObtain
package com.uni.core.doe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class DAOGetData {

    private final Connection conn;

    public DAOGetData(Connection conn) {
        this.conn = conn;
    }

    public void DisplayDataTables(String NumRemi, JTextArea textArea) {
        if (NumRemi == null || NumRemi.trim().isEmpty()) {
            countEmptyRemisionRecords(textArea);
        } else {
            displayDataWithRemision(NumRemi, textArea);
        }
    }

    private void displayDataWithRemision(String NumRemi, JTextArea textArea) {
        String query1 = "SELECT FACTURADO, REMIFACT, REMISION, NRODCTO FROM TRADE WHERE ORIGEN='FAC' AND TIPODCTO='RE' AND REMISION IN(?)";

        try {
            PreparedStatement statement1 = conn.prepareStatement(query1);
            statement1.setString(1, NumRemi);
            StringBuilder resultText = new StringBuilder();

            resultText.append("*DATA FACTURA*:\n\n");
            ResultSet resultSet1 = statement1.executeQuery();
            while (resultSet1.next()) {
                resultText.append("FACTURADO: ").append(resultSet1.getInt("FACTURADO")).append(", ")
                        .append("FACTURA: ").append(resultSet1.getString("REMIFACT")).append(", ")
                        .append("REMISION: ").append(resultSet1.getString("REMISION")).append(", ")
                        .append("NRODCTO: ").append(resultSet1.getString("NRODCTO")).append("\n");
            }

            textArea.setEditable(false);
            textArea.setText(resultText.toString());

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private void countEmptyRemisionRecords(JTextArea textArea) {
        String query = "SELECT COUNT(*) AS total FROM TRADE WHERE ORIGEN='FAC' AND TIPODCTO='RE' AND (REMISION IS NULL OR REMISION = '')";

        try {
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int total = resultSet.getInt("total");
                textArea.setEditable(false);
                textArea.setText("Total de registros con remisión vacía: " + total);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al contar los registros con remisión vacía: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}
