// MENUPANELRemFacDesign
package com.uni.gui;

import javax.swing.ImageIcon;

public class GUIMenuPanelMain extends javax.swing.JFrame {


    public GUIMenuPanelMain() {
        initComponents();
        setResizable(false); // Inhabilitar el redimensionamiento
        setMaximizedBounds(null); // Inhabilitar la opción de maximizar
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/logo-uniroca.png"));
        jLabel_iMG_UNI_BACKG.setIcon(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CONTENT = new javax.swing.JPanel();
        jButton_UPDATE_REMIFACTNRODCTO = new javax.swing.JButton();
        jButton_UPDATE_REMISION = new javax.swing.JButton();
        jLabel_TITLE = new javax.swing.JLabel();
        jLabel_iMG_UNI_BACKG = new javax.swing.JLabel();
        jLabel_FOOT_TEXT = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MÓDULO DE REMISIÓN");
        setAlwaysOnTop(true);

        jPanel_CONTENT.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_CONTENT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton_UPDATE_REMIFACTNRODCTO.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_UPDATE_REMIFACTNRODCTO.setForeground(new java.awt.Color(51, 51, 51));
        jButton_UPDATE_REMIFACTNRODCTO.setText("REHACER FACTURACIÓN POR REMISIÓN");
        jButton_UPDATE_REMIFACTNRODCTO.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton_UPDATE_REMIFACTNRODCTO.setFocusPainted(false);
        jButton_UPDATE_REMIFACTNRODCTO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_UPDATE_REMIFACTNRODCTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATE_REMIFACTNRODCTOActionPerformed(evt);
            }
        });

        jButton_UPDATE_REMISION.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton_UPDATE_REMISION.setForeground(new java.awt.Color(51, 51, 51));
        jButton_UPDATE_REMISION.setText("INGRESAR NUEVA NR");
        jButton_UPDATE_REMISION.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton_UPDATE_REMISION.setFocusPainted(false);
        jButton_UPDATE_REMISION.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_UPDATE_REMISION.setPreferredSize(new java.awt.Dimension(453, 25));
        jButton_UPDATE_REMISION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATE_REMISIONActionPerformed(evt);
            }
        });

        jLabel_TITLE.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel_TITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TITLE.setText("MENÚ");

        jLabel_iMG_UNI_BACKG.setBackground(new java.awt.Color(51, 51, 51));
        jLabel_iMG_UNI_BACKG.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabel_iMG_UNI_BACKG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_iMG_UNI_BACKG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/logo-uniroca.png"))); // NOI18N
        jLabel_iMG_UNI_BACKG.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel_CONTENTLayout = new javax.swing.GroupLayout(jPanel_CONTENT);
        jPanel_CONTENT.setLayout(jPanel_CONTENTLayout);
        jPanel_CONTENTLayout.setHorizontalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_TITLE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONTENTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_iMG_UNI_BACKG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_UPDATE_REMISION, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
                    .addComponent(jButton_UPDATE_REMIFACTNRODCTO, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel_CONTENTLayout.setVerticalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jButton_UPDATE_REMIFACTNRODCTO, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jButton_UPDATE_REMISION, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jLabel_iMG_UNI_BACKG)
                .addContainerGap())
        );

        jLabel_FOOT_TEXT.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jLabel_FOOT_TEXT.setForeground(new java.awt.Color(153, 153, 153));
        jLabel_FOOT_TEXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FOOT_TEXT.setText("Systemas UNIROCA Software");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel_CONTENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_FOOT_TEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel_CONTENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_FOOT_TEXT)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_UPDATE_REMIFACTNRODCTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATE_REMIFACTNRODCTOActionPerformed
        GUIRemFactMain design = new GUIRemFactMain();
        design.setResizable(false);
        design.setMaximizedBounds(null);
        design.setVisible(true);
        design.setLocationRelativeTo(null);
        dispose(); // Cierra la interfaz actual
    }//GEN-LAST:event_jButton_UPDATE_REMIFACTNRODCTOActionPerformed

    private void jButton_UPDATE_REMISIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATE_REMISIONActionPerformed
        GUIAntiRemFactMain antiDesign = new GUIAntiRemFactMain();
        antiDesign.setResizable(false);
        antiDesign.setMaximizedBounds(null);
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
    private javax.swing.JLabel jLabel_iMG_UNI_BACKG;
    private javax.swing.JPanel jPanel_CONTENT;
    // End of variables declaration//GEN-END:variables

    
}
