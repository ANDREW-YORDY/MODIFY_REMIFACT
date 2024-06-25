package com.uni.main;

import com.uni.gui.GUIRemFactMain;
import com.uni.persistence.DBAdminConn;

public class Modify_RemiFact {

    public static void main(String[] args) {
        System.out.println("Saludo a ADR");
        
        DBAdminConn DBAConn = new DBAdminConn();
        DBAConn.DBGoToConnection();

        GUIRemFactMain guiRemFactMain = new GUIRemFactMain();
        guiRemFactMain.setResizable(true);
        guiRemFactMain.setVisible(true);
        guiRemFactMain.setLocationRelativeTo(null);



    }
;

}
