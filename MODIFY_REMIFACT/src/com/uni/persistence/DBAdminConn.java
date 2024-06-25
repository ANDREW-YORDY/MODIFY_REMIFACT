package com.uni.persistence;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DBAdminConn {

    String user = "rootDB";
    String passw = "1611propio";
    String DB = "DBTESTcanvas";
    String pto = "1433";
    String ip = "localhost";
//    String user = "sa";
//    String passw = "**lamisma2017**";
//    String DB = "PRUEBASSISTEMASS";
//    String pto = "1433";
//    String ip = "192.168.45.9";

    Connection conn = null;

    public Connection DBGoToConnection() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            String StrDB = "jdbc:sqlserver://" + ip + ":" + pto + ";" + "databaseName=" + DB + ";" + "encrypt=true;trustServerCertificate=true";
            conn = DriverManager.getConnection(StrDB, user, passw);

            JOptionPane.showMessageDialog(null, "SUCCESSFUL CONNECTION SERVER");

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "!FAILED CONNECTION SERVER");
        }
        return conn;
    }
}
