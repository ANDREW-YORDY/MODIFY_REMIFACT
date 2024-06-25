// RemFacAntiDesign
package com.uni.gui;

import com.uni.persistence.DBAdminConn;


public class GUIAntiRemFactMain extends javax.swing.JFrame {


    public GUIAntiRemFactMain() {
        initComponents();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton_BACK_GOMENU.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton_BACK_GOMENU.setText(" Back");
        jButton_BACK_GOMENU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
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
        jLabel_TitleMain.setText("MODIFICACIÓN DE FACTURA REMI-FACT");

        jLabel_RE.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel_RE.setText("INGRESAR REMISION");

        jTextField_REMI_IN.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextField_REMI_IN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton_UPDTBTN_ANTIREMFACT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_UPDTBTN_ANTIREMFACT.setText("INGREZAR REMISION");
        jButton_UPDTBTN_ANTIREMFACT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
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
        jTextArea_ViewPrevAntiRemFac.setPreferredSize(new java.awt.Dimension(192, 74));
        jScrollPane1.setViewportView(jTextArea_ViewPrevAntiRemFac);

        jButton_SEARCHBTN_ANTIREMFACT.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_SEARCHBTN_ANTIREMFACT.setText("BUSCAR REMISION");
        jButton_SEARCHBTN_ANTIREMFACT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton_SEARCHBTN_ANTIREMFACT.setPreferredSize(new java.awt.Dimension(197, 28));
        jButton_SEARCHBTN_ANTIREMFACT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SEARCHBTN_ANTIREMFACTActionPerformed(evt);
            }
        });

        jLabel_FOOT_TEXT.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jLabel_FOOT_TEXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FOOT_TEXT.setText("Systemas UNIROCA Software");

        javax.swing.GroupLayout jPanel_CONTENTLayout = new javax.swing.GroupLayout(jPanel_CONTENT);
        jPanel_CONTENT.setLayout(jPanel_CONTENTLayout);
        jPanel_CONTENTLayout.setHorizontalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel_TitleMain, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 51, Short.MAX_VALUE))
            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_SEARCHBTN_ANTIREMFACT, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_UPDTBTN_ANTIREMFACT, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel_RE, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jTextField_REMI_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_FOOT_TEXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel_CONTENTLayout.setVerticalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_TitleMain, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_REMI_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_RE, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jButton_SEARCHBTN_ANTIREMFACT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_UPDTBTN_ANTIREMFACT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel_FOOT_TEXT)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel_CONTENT, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_BACK_GOMENU, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
        String remisionNum = jTextField_REMI_IN.getText().trim();

        // Llamar al método del controlador para actualizar las tablas
        //remfactRevise.updateRemifactNRInBothTables(remisionNum);
        //remfactRevise.limpiarCampos(jTextField_REMI_IN, jTextArea_ViewPrevAntiRemFac);
    }//GEN-LAST:event_jButton_UPDTBTN_ANTIREMFACTActionPerformed

    private void jButton_SEARCHBTN_ANTIREMFACTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SEARCHBTN_ANTIREMFACTActionPerformed
        //remfactObtain.testBTN();
        String NumRemi = jTextField_REMI_IN.getText();
        //remfactObtain.DisplayDataTables(NumRemi, jTextArea_ViewPrevAntiRemFac);
        //        String NumRemi = jTextField_REMI_IN.getText().trim();
        //        if (NumRemi.isEmpty()) {
            //            remfactObtain.DisplayDataTables("", jTextArea_ViewPrevAntiRemFac);
            //        } else {
            //            remfactObtain.DisplayDataTables(NumRemi, jTextArea_ViewPrevAntiRemFac);
            //        }
    }//GEN-LAST:event_jButton_SEARCHBTN_ANTIREMFACTActionPerformed

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
    private javax.swing.JLabel jLabel_FOOT_TEXT;
    private javax.swing.JLabel jLabel_RE;
    private javax.swing.JLabel jLabel_TitleMain;
    private javax.swing.JPanel jPanel_CONTENT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_ViewPrevAntiRemFac;
    private javax.swing.JTextField jTextField_REMI_IN;
    // End of variables declaration//GEN-END:variables
}
