package com.uni.main;

import com.uni.gui.GUIMenuPanelMain;

public class Modify_RemiFact {

    public static void main(String[] args) {
         
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
