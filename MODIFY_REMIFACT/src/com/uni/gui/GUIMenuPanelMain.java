// MENUPANELRemFacDesign
package com.uni.gui;

public class GUIMenuPanelMain extends javax.swing.JFrame {


    public GUIMenuPanelMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CONTENT = new javax.swing.JPanel();
        jButton_UPDATE_REMIFACTNRODCTO = new javax.swing.JButton();
        jButton_UPDATE_REMISION = new javax.swing.JButton();
        jLabel_TITLE = new javax.swing.JLabel();
        jPanel_LOGO_UNIRC = new javax.swing.JPanel();
        jLabel_FOOT_TEXT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_CONTENT.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_CONTENT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton_UPDATE_REMIFACTNRODCTO.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_UPDATE_REMIFACTNRODCTO.setText("ACTUALIZAR FACTURA CON NUM DE DOCUMENTO");
        jButton_UPDATE_REMIFACTNRODCTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton_UPDATE_REMIFACTNRODCTO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_UPDATE_REMIFACTNRODCTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATE_REMIFACTNRODCTOActionPerformed(evt);
            }
        });

        jButton_UPDATE_REMISION.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_UPDATE_REMISION.setText("ACTUALIZAR FACTURA CON NUM DE REMISION");
        jButton_UPDATE_REMISION.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton_UPDATE_REMISION.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_UPDATE_REMISION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATE_REMISIONActionPerformed(evt);
            }
        });

        jLabel_TITLE.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel_TITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TITLE.setText("MENU");

        javax.swing.GroupLayout jPanel_LOGO_UNIRCLayout = new javax.swing.GroupLayout(jPanel_LOGO_UNIRC);
        jPanel_LOGO_UNIRC.setLayout(jPanel_LOGO_UNIRCLayout);
        jPanel_LOGO_UNIRCLayout.setHorizontalGroup(
            jPanel_LOGO_UNIRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 483, Short.MAX_VALUE)
        );
        jPanel_LOGO_UNIRCLayout.setVerticalGroup(
            jPanel_LOGO_UNIRCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel_CONTENTLayout = new javax.swing.GroupLayout(jPanel_CONTENT);
        jPanel_CONTENT.setLayout(jPanel_CONTENTLayout);
        jPanel_CONTENTLayout.setHorizontalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONTENTLayout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jLabel_TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jPanel_LOGO_UNIRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                        .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_UPDATE_REMISION, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_UPDATE_REMIFACTNRODCTO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel_CONTENTLayout.setVerticalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jButton_UPDATE_REMIFACTNRODCTO, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_UPDATE_REMISION, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jPanel_LOGO_UNIRC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jLabel_FOOT_TEXT.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jLabel_FOOT_TEXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FOOT_TEXT.setText("Systemas UNIROCA Software");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel_CONTENT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_FOOT_TEXT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel_CONTENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_FOOT_TEXT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_UPDATE_REMIFACTNRODCTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATE_REMIFACTNRODCTOActionPerformed
        GUIRemFactMain design = new GUIRemFactMain();
        design.setResizable(true);
        design.setVisible(true);
        design.setLocationRelativeTo(null);
        dispose(); // Cierra la interfaz actual
    }//GEN-LAST:event_jButton_UPDATE_REMIFACTNRODCTOActionPerformed

    private void jButton_UPDATE_REMISIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATE_REMISIONActionPerformed
        GUIAntiRemFactMain antiDesign = new GUIAntiRemFactMain();
        antiDesign.setResizable(true);
        antiDesign.setVisible(true);
        antiDesign.setLocationRelativeTo(null);
        dispose(); // Cierra la interfaz actual
    }//GEN-LAST:event_jButton_UPDATE_REMISIONActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMenuPanelMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMenuPanelMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMenuPanelMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMenuPanelMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMenuPanelMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_UPDATE_REMIFACTNRODCTO;
    private javax.swing.JButton jButton_UPDATE_REMISION;
    private javax.swing.JLabel jLabel_FOOT_TEXT;
    private javax.swing.JLabel jLabel_TITLE;
    private javax.swing.JPanel jPanel_CONTENT;
    private javax.swing.JPanel jPanel_LOGO_UNIRC;
    // End of variables declaration//GEN-END:variables
}
