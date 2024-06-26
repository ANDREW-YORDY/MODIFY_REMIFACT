// RemFacController
package com.uni.gui;

import com.uni.core.CORERemiFact;
import com.uni.persistence.DBAdminConn;
import javax.swing.JOptionPane;

public class GUIRemFactMain extends javax.swing.JFrame {
    
    private final CORERemiFact xCORERemiFact;

    public GUIRemFactMain() {
        initComponents();
        xCORERemiFact = new CORERemiFact(new DBAdminConn().DBGoToConnection());
        jTextField_NEWNRODOC_IN.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_CONTENT = new javax.swing.JPanel();
        jButton_SEARCHBTN = new javax.swing.JButton();
        jTextField_NRODOC_IN = new javax.swing.JTextField();
        jLabel_NroDoc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_ViewPrevRemFac = new javax.swing.JTextArea();
        jLabel_TITLE = new javax.swing.JLabel();
        jLabel_FOOT_TEXT = new javax.swing.JLabel();
        jPanel_CONT_ACTUALNRODOC = new javax.swing.JPanel();
        jLabel_NEWNRODOC_IN = new javax.swing.JLabel();
        jTextField_NEWNRODOC_IN = new javax.swing.JTextField();
        jButton_UPDATEBTN_NRODOC = new javax.swing.JButton();
        jCheckBox_HabilitedUpdtNumDoc = new javax.swing.JCheckBox();
        jButton_UPDATEBTN_REMFAC = new javax.swing.JButton();
        jButton_BACK_GOMENU = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_CONTENT.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jButton_SEARCHBTN.setText("🔎");
        jButton_SEARCHBTN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton_SEARCHBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SEARCHBTNActionPerformed(evt);
            }
        });

        jTextField_NRODOC_IN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField_NRODOC_IN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_NRODOC_IN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel_NroDoc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel_NroDoc.setText("NRO DOCUMENTO");

        jTextArea_ViewPrevRemFac.setEditable(false);
        jTextArea_ViewPrevRemFac.setColumns(20);
        jTextArea_ViewPrevRemFac.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextArea_ViewPrevRemFac.setRows(5);
        jTextArea_ViewPrevRemFac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        jScrollPane1.setViewportView(jTextArea_ViewPrevRemFac);

        jLabel_TITLE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_TITLE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TITLE.setText("ACTUALIZADOR DE FACTURA CON NRODCTO");
        jLabel_TITLE.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel_FOOT_TEXT.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        jLabel_FOOT_TEXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_FOOT_TEXT.setText("Systemas UNIROCA Software");

        jPanel_CONT_ACTUALNRODOC.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ACTUALIZAR NRO DOCUMENTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jLabel_NEWNRODOC_IN.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jLabel_NEWNRODOC_IN.setText("INGRESE EL NUEVO NRODCTO");

        jTextField_NEWNRODOC_IN.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTextField_NEWNRODOC_IN.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_NEWNRODOC_IN.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton_UPDATEBTN_NRODOC.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton_UPDATEBTN_NRODOC.setText("ACTUALIZAR NRODCTO");
        jButton_UPDATEBTN_NRODOC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton_UPDATEBTN_NRODOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATEBTN_NRODOCActionPerformed(evt);
            }
        });

        jCheckBox_HabilitedUpdtNumDoc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jCheckBox_HabilitedUpdtNumDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_HabilitedUpdtNumDocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_CONT_ACTUALNRODOCLayout = new javax.swing.GroupLayout(jPanel_CONT_ACTUALNRODOC);
        jPanel_CONT_ACTUALNRODOC.setLayout(jPanel_CONT_ACTUALNRODOCLayout);
        jPanel_CONT_ACTUALNRODOCLayout.setHorizontalGroup(
            jPanel_CONT_ACTUALNRODOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONT_ACTUALNRODOCLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel_CONT_ACTUALNRODOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton_UPDATEBTN_NRODOC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel_CONT_ACTUALNRODOCLayout.createSequentialGroup()
                        .addComponent(jLabel_NEWNRODOC_IN, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_NEWNRODOC_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox_HabilitedUpdtNumDoc)))
                .addGap(43, 43, 43))
        );
        jPanel_CONT_ACTUALNRODOCLayout.setVerticalGroup(
            jPanel_CONT_ACTUALNRODOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONT_ACTUALNRODOCLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel_CONT_ACTUALNRODOCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_NEWNRODOC_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox_HabilitedUpdtNumDoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_NEWNRODOC_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_UPDATEBTN_NRODOC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jButton_UPDATEBTN_REMFAC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton_UPDATEBTN_REMFAC.setText("ACTUALIZAR REMISION");
        jButton_UPDATEBTN_REMFAC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton_UPDATEBTN_REMFAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UPDATEBTN_REMFACActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel_CONTENTLayout = new javax.swing.GroupLayout(jPanel_CONTENT);
        jPanel_CONTENT.setLayout(jPanel_CONTENTLayout);
        jPanel_CONTENTLayout.setHorizontalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_CONTENTLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONTENTLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel_NroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_NRODOC_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton_SEARCHBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONTENTLayout.createSequentialGroup()
                        .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_TITLE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel_CONT_ACTUALNRODOC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_UPDATEBTN_REMFAC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_FOOT_TEXT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel_CONTENTLayout.setVerticalGroup(
            jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_CONTENTLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_TITLE, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel_CONTENTLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_NRODOC_IN, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_SEARCHBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_NroDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel_CONT_ACTUALNRODOC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton_UPDATEBTN_REMFAC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLabel_FOOT_TEXT))
        );

        jButton_BACK_GOMENU.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton_BACK_GOMENU.setText("Back");
        jButton_BACK_GOMENU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton_BACK_GOMENU.setPreferredSize(new java.awt.Dimension(70, 22));
        jButton_BACK_GOMENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BACK_GOMENUActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_BACK_GOMENU, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(337, Short.MAX_VALUE))
            .addComponent(jPanel_CONTENT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_BACK_GOMENU, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_CONTENT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_SEARCHBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SEARCHBTNActionPerformed
        String NroDctoIn = jTextField_NRODOC_IN.getText();
        xCORERemiFact.displayDataFromBothTablesByNroDcto(NroDctoIn, jTextArea_ViewPrevRemFac);
        jTextField_NEWNRODOC_IN.setText(NroDctoIn);
        //remFacController.displayData(jTextArea_ViewPrevRemFac); //1ra PROCESO.
        //remFacController.displayDataByCode(NroDctoIn, jTextArea_ViewPrevRemFac); //2da PROCESO
        //remFacController.displayDataFromBothTables(jTextArea_ViewPrevRemFac); //3ra PROCESO
    }//GEN-LAST:event_jButton_SEARCHBTNActionPerformed

    private void jButton_UPDATEBTN_NRODOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATEBTN_NRODOCActionPerformed
        if (!xCORERemiFact.isFieldEnabled(jTextField_NEWNRODOC_IN)) {
            JOptionPane.showMessageDialog(null, "El proceso de actualización no es válido. Debe habilitar la opción de actualizar el número de documento seleccionando el checkbox.");
        } else {
            // Lógica para actualizar el número de documento
            String oldNro = jTextField_NRODOC_IN.getText();
            String newNro = jTextField_NEWNRODOC_IN.getText();
            xCORERemiFact.updateNroDctoInInBothTables(oldNro, newNro);
            xCORERemiFact.limpiarCampos(jTextField_NRODOC_IN, jTextField_NEWNRODOC_IN, jTextArea_ViewPrevRemFac);
        }
    }//GEN-LAST:event_jButton_UPDATEBTN_NRODOCActionPerformed

    private void jCheckBox_HabilitedUpdtNumDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_HabilitedUpdtNumDocActionPerformed
        boolean isSelected = jCheckBox_HabilitedUpdtNumDoc.isSelected();
        xCORERemiFact.handleCheckboxAction(isSelected, jTextField_NEWNRODOC_IN);
    }//GEN-LAST:event_jCheckBox_HabilitedUpdtNumDocActionPerformed

    private void jButton_UPDATEBTN_REMFACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UPDATEBTN_REMFACActionPerformed
        String nrodcto = jTextField_NRODOC_IN.getText();
        xCORERemiFact.updateFieldsInBothTables(nrodcto);
        xCORERemiFact.limpiarCampos(jTextField_NRODOC_IN, jTextField_NEWNRODOC_IN, jTextArea_ViewPrevRemFac);
    }//GEN-LAST:event_jButton_UPDATEBTN_REMFACActionPerformed

    private void jButton_BACK_GOMENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BACK_GOMENUActionPerformed
        GUIMenuPanelMain menuPanel = new GUIMenuPanelMain();
        menuPanel.setResizable(true);
        menuPanel.setVisible(true);
        menuPanel.setLocationRelativeTo(null);
        dispose(); // Cierra la interfaz actual
    }//GEN-LAST:event_jButton_BACK_GOMENUActionPerformed

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
            java.util.logging.Logger.getLogger(GUIRemFactMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIRemFactMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIRemFactMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIRemFactMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIRemFactMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_BACK_GOMENU;
    private javax.swing.JButton jButton_SEARCHBTN;
    private javax.swing.JButton jButton_UPDATEBTN_NRODOC;
    private javax.swing.JButton jButton_UPDATEBTN_REMFAC;
    private javax.swing.JCheckBox jCheckBox_HabilitedUpdtNumDoc;
    private javax.swing.JLabel jLabel_FOOT_TEXT;
    private javax.swing.JLabel jLabel_NEWNRODOC_IN;
    private javax.swing.JLabel jLabel_NroDoc;
    private javax.swing.JLabel jLabel_TITLE;
    private javax.swing.JPanel jPanel_CONTENT;
    private javax.swing.JPanel jPanel_CONT_ACTUALNRODOC;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_ViewPrevRemFac;
    private javax.swing.JTextField jTextField_NEWNRODOC_IN;
    private javax.swing.JTextField jTextField_NRODOC_IN;
    // End of variables declaration//GEN-END:variables
}
