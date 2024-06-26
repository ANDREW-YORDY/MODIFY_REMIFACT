// RemFacAntiDesign
package com.uni.gui;

import com.uni.core.doe.DAOGetData;
import com.uni.core.doe.DAOUpdateData;
import com.uni.persistence.DBAdminConn;
import java.sql.Connection;


public class GUIAntiRemFactMain extends javax.swing.JFrame {
    
    private final DAOGetData xDAOGetData;
    private final DAOUpdateData xDAOUpdateData;

    public GUIAntiRemFactMain() {
        initComponents();
        DBAdminConn dbConn = new DBAdminConn(); // Crear una única instancia de DBAdminConn
        Connection connection = dbConn.DBGoToConnection(); // Obtener la conexión
        xDAOGetData = new DAOGetData(connection); // Pasar la misma conexión a ambos controladores
        xDAOUpdateData = new DAOUpdateData(connection);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_BACK_GOMENU = new javax.swing.JButton();
        jPanel_CONTENT = new javax.swing.JPanel();
        jLabel_TitleMain = new javax.swing.JLabel();
        jLabel_RE = new javax.swing.JLabel();
        jTextField_REMI_IN = new javax.swing.JTextField();
        jButton_UPDTBTN_ANTIREMFACT = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_ViewPrevAntiRemFac = new javax.swing.JTextArea();
        jButton_SEARCHBTN_ANTIREMFACT = new javax.swing.JButton();
        jLabel_FOOT_TEXT = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_REMICREATE_IN = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_BACK_GOMENU.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jButton_BACK_GOMENU.setForeground(new java.awt.Color(51, 51, 51));
        jButton_BACK_GOMENU.setText("ATRÁS");
        jButton_BACK_GOMENU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton_BACK_GOMENU.setFocusPainted(false);
        jButton_BACK_GOMENU.setPreferredSize(new java.awt.Dimension(70, 22));
        jButton_BACK_GOMENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BACK_GOMENUActionPerformed(evt);
            }
        });

        jPanel_CONTENT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel_CONTENT.setPreferredSize(new java.awt.Dimension(490, 542));

        jLabel_TitleMain.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_TitleMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TitleMain.setText("MODIFICACIÓN DE FACTURA CON REMISIÓN");

        jLabel_RE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel_RE.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel_RE.setText("CONSULTAR REMISIÓN POR NRO DE  DOCUMENTO");

        jTextField_REMI_IN.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField_REMI_IN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_REMI_IN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextField_REMI_IN.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextField_REMI_IN.setName(""); // NOI18N

        jButton_UPDTBTN_ANTIREMFACT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_UPDTBTN_ANTIREMFACT.setForeground(new java.awt.Color(51, 51, 51));
        jButton_UPDTBTN_ANTIREMFACT.setText("INGRESAR NUEVA NR");
        jButton_UPDTBTN_ANTIREMFACT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton_UPDTBTN_ANTIREMFACT.setFocusable(false);
        jButton_UPDTBTN_ANTIREMFACT.setPreferredSize(new java.awt.Dimension(197, 28));
        jButton_UPDTBTN_ANTIREMFACT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDTBTN_ANTIREMFACTActionPerformed(evt);
            }
        });

        jTextArea_ViewPrevAntiRemFac.setEditable(false);
        jTextArea_ViewPrevAntiRemFac.setColumns(20);
        jTextArea_ViewPrevAntiRemFac.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea_ViewPrevAntiRemFac.setRows(5);
        jTextArea_ViewPrevAntiRemFac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jScrollPane1.setViewportView(jTextArea_ViewPrevAntiRemFac);

        jButton_SEARCHBTN_ANTIREMFACT.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton_SEARCHBTN_ANTIREMFACT.setForeground(new java.awt.Color(51, 51, 51));
        jButton_SEARCHBTN_ANTIREMFACT.setText("CONSULTAR");
        jButton_SEARCHBTN_ANTIREMFACT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton_SEARCHBTN_ANTIREMFACT.setFocusable(false);
        jButton_SEARCHBTN_ANTIREMFACT.setPreferredSize(new java.awt.Dimension(197, 28));
        jButton_SEARCHBTN_ANTIREMFACT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SEARCHBTN_ANTIREMFACTActionPerformed(evt);
            }
        });

        jLabel_FOOT_TEXT.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jLabel_FOOT_TEXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FOOT_TEXT.setText("Systemas UNIROCA Software");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESAR NUEVO NÚMERO DE REMISIÓN RELACIONADO CON EL NRODCTO");

        jTextField_REMICREATE_IN.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField_REMICREATE_IN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_REMICREATE_IN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jTextField_REMICREATE_IN.setPreferredSize(new java.awt.Dimension(2, 17));
        jTextField_REMICREATE_IN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_REMICREATE_INActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_CONTENTLayout = new javax.swing.GroupLayout(jPanel_CONTENT);
        jPanel_CONTENT.setLayout(jPanel_CONTENTLayout);
        jPanel_CONTENTLayout.setHorizontalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jTextField_REMICREATE_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(147, 147, 147))
                    .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                        .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_UPDTBTN_ANTIREMFACT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_FOOT_TEXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_TitleMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel_CONTENTLayout.createSequentialGroup()
                                        .addComponent(jTextField_REMI_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton_SEARCHBTN_ANTIREMFACT, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel_RE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel_CONTENTLayout.setVerticalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                .addComponent(jLabel_TitleMain, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel_RE, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_REMI_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SEARCHBTN_ANTIREMFACT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_REMICREATE_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton_UPDTBTN_ANTIREMFACT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(jLabel_FOOT_TEXT))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_BACK_GOMENU, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel_CONTENT, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_BACK_GOMENU, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_CONTENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_BACK_GOMENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BACK_GOMENUActionPerformed
        GUIMenuPanelMain menuPanel = new GUIMenuPanelMain();
        menuPanel.setResizable(true);
        menuPanel.setVisible(true);
        menuPanel.setLocationRelativeTo(null);
        dispose(); // Cierra la interfaz actual
    }//GEN-LAST:event_jButton_BACK_GOMENUActionPerformed

    private void jButton_UPDTBTN_ANTIREMFACTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDTBTN_ANTIREMFACTActionPerformed
        // Obtener el número de remisión del campo de texto
        String documentNum  = jTextField_REMI_IN.getText().trim();
        String remissionNum = jTextField_REMICREATE_IN.getText().trim();

        // Llamar al método del controlador para actualizar las tablas
        xDAOUpdateData.updateRemifactNRInBothTables(documentNum,remissionNum);
        xDAOUpdateData.limpiarCampos(jTextField_REMI_IN, jTextArea_ViewPrevAntiRemFac,jTextField_REMICREATE_IN);
    }//GEN-LAST:event_jButton_UPDTBTN_ANTIREMFACTActionPerformed

    private void jButton_SEARCHBTN_ANTIREMFACTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SEARCHBTN_ANTIREMFACTActionPerformed
        //remfactObtain.testBTN();
        String NumRemi = jTextField_REMI_IN.getText();
        xDAOGetData.displayDataTables(NumRemi, jTextArea_ViewPrevAntiRemFac);
    }//GEN-LAST:event_jButton_SEARCHBTN_ANTIREMFACTActionPerformed

    private void jTextField_REMICREATE_INActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_REMICREATE_INActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_REMICREATE_INActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIAntiRemFactMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIAntiRemFactMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIAntiRemFactMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIAntiRemFactMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIAntiRemFactMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_BACK_GOMENU;
    private javax.swing.JButton jButton_SEARCHBTN_ANTIREMFACT;
    private javax.swing.JButton jButton_UPDTBTN_ANTIREMFACT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_FOOT_TEXT;
    private javax.swing.JLabel jLabel_RE;
    private javax.swing.JLabel jLabel_TitleMain;
    private javax.swing.JPanel jPanel_CONTENT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_ViewPrevAntiRemFac;
    private javax.swing.JTextField jTextField_REMICREATE_IN;
    private javax.swing.JTextField jTextField_REMI_IN;
    // End of variables declaration//GEN-END:variables
}
