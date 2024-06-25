package com.uni.main;

import com.uni.gui.GUIMenuPanelMain;

public class Modify_RemiFact {

    public static void main(String[] args) {
//        System.out.println("Saludo a ADR");
//        
//        DBAdminConn DBAConn = new DBAdminConn();
//        DBAConn.DBGoToConnection();
//
//        GUIRemFactMain guiRemFactMain = new GUIRemFactMain();
//        guiRemFactMain.setResizable(true);
//        guiRemFactMain.setVisible(true);
//        guiRemFactMain.setLocationRelativeTo(null);
         
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                GUIMenuPanelMain menuPanel = new GUIMenuPanelMain();
                menuPanel.setVisible(true);
                menuPanel.setLocationRelativeTo(null);
            }
        });
        

    }
;

}
