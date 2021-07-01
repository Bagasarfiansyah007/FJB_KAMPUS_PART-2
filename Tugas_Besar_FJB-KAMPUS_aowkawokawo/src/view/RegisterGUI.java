/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.FakultasModel;
import control.RegistrasiControl;
import general.DialogMessage;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class RegisterGUI extends javax.swing.JFrame {

    // Atribut
    public static RegistrasiControl control;
    private String fakultasKode;


    // Constructor
    public RegisterGUI() {
        initComponents();
        control = new RegistrasiControl(this);
        setComboValueFakultas();
        setComboValueProdi(fakultasKode);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        guidePanel = new javax.swing.JPanel();
        registrasiTitle = new javax.swing.JLabel();
        dataGuidePanel = new javax.swing.JPanel();
        nimTxt = new javax.swing.JLabel();
        namaTxt = new javax.swing.JLabel();
        fakultasTxt = new javax.swing.JLabel();
        prodiTxt = new javax.swing.JLabel();
        mailTxt = new javax.swing.JLabel();
        telephoneTxt = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JLabel();
        saldoTxt = new javax.swing.JLabel();
        nimField = new javax.swing.JTextField();
        namaField = new javax.swing.JTextField();
        mailField = new javax.swing.JTextField();
        telephoneField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        saldoField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        fakultasComboBox = new javax.swing.JComboBox();
        prodiComboBox = new javax.swing.JComboBox();
        background = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guidePanel.setOpaque(false);

        registrasiTitle.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        registrasiTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrasiTitle.setText("REGISTRASI");

        javax.swing.GroupLayout guidePanelLayout = new javax.swing.GroupLayout(guidePanel);
        guidePanel.setLayout(guidePanelLayout);
        guidePanelLayout.setHorizontalGroup(
            guidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guidePanelLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(registrasiTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
        );
        guidePanelLayout.setVerticalGroup(
            guidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guidePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(registrasiTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        getContentPane().add(guidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, -1));

        dataGuidePanel.setOpaque(false);

        nimTxt.setText("NIM");

        namaTxt.setText("Nama");

        fakultasTxt.setText("Fakultas");

        prodiTxt.setText("Prodi");

        mailTxt.setText("Email");

        telephoneTxt.setText("Telephone");

        passwordTxt.setText("Password");

        saldoTxt.setText("Saldo");

        registerButton.setText("Register");
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        fakultasComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fakultasComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dataGuidePanelLayout = new javax.swing.GroupLayout(dataGuidePanel);
        dataGuidePanel.setLayout(dataGuidePanelLayout);
        dataGuidePanelLayout.setHorizontalGroup(
            dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataGuidePanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nimTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fakultasTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prodiTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telephoneTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saldoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataGuidePanelLayout.createSequentialGroup()
                        .addComponent(registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(242, Short.MAX_VALUE))
                    .addGroup(dataGuidePanelLayout.createSequentialGroup()
                        .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mailField)
                            .addComponent(telephoneField)
                            .addComponent(passwordField)
                            .addComponent(saldoField)
                            .addComponent(namaField)
                            .addComponent(nimField))
                        .addGap(57, 57, 57))
                    .addGroup(dataGuidePanelLayout.createSequentialGroup()
                        .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fakultasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(prodiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        dataGuidePanelLayout.setVerticalGroup(
            dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataGuidePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nimTxt)
                    .addComponent(nimField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fakultasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fakultasTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodiTxt)
                    .addComponent(prodiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mailTxt)
                    .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telephoneTxt)
                    .addComponent(telephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordTxt)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saldoTxt)
                    .addComponent(saldoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerButton)
                    .addComponent(cancelButton))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        getContentPane().add(dataGuidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/backg2.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Main procedure
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        try {
            control.isiData(this);
        } catch (Exception e) {
            DialogMessage.dialogFormWarning("Tipe data yang dimasukan Salah !", "warning");
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        LogInGUI loginGui = new LogInGUI();
        loginGui.show();
        dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void fakultasComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fakultasComboBoxActionPerformed
        prodiComboBox.removeAllItems();
        fakultasKode = control.fakultas.get(fakultasComboBox.getSelectedIndex()).getId_fakultas();
        setComboValueProdi (fakultasKode);
    }//GEN-LAST:event_fakultasComboBoxActionPerformed
    
    
    // Getter
    public String getComboFakultas() {
        return fakultasComboBox.getSelectedItem().toString();
    }

    public String getTxtNama() {
        return namaField.getText();
    }

    public String getTxtNim() {
        return nimField.getText();
    }

    public String getTxtPassword() {
        return passwordField.getText();
    }

    public String getComboProdi() {
        return prodiComboBox.getSelectedItem().toString();
    }
    
    public String getTxtEmail(){
        return mailField.getText();
    }
    
    public int getTxtSaldo() {
        return Integer.parseInt(saldoField.getText());
    }

    public String getTxtTelphone() {
        return telephoneField.getText();
    }

    
    // Setter
    public void setLabel(String label){
        registrasiTitle.setText(label);
    }
    
    public void setComboValueFakultas (){
        for (int i = 0 ; i < control.fakultas.size();i++) {
            fakultasComboBox.addItem(control.fakultas.get(i).getNama());
        }
    }
    
    public void setComboValueProdi (String fakultasKode){
        if (fakultasKode == null) {
            for (int i = 0 ; i < control.prodi.size();i++) {
                prodiComboBox.addItem(control.prodi.get(i).getNamaProdi());
            }
        } else {
            System.out.println(fakultasKode);
            for (int i = 0 ; i < control.prodi.size();i++) {
                if (fakultasKode.intern() == control.prodi.get(i).getKodeFakultas().intern()){
                    prodiComboBox.addItem(control.prodi.get(i).getNamaProdi());
                }
            }
        }
    }
    
    // Main
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
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton cancelButton;
    private javax.swing.JPanel dataGuidePanel;
    private javax.swing.JComboBox fakultasComboBox;
    private javax.swing.JLabel fakultasTxt;
    private javax.swing.JPanel guidePanel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JTextField mailField;
    private javax.swing.JLabel mailTxt;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaTxt;
    private javax.swing.JTextField nimField;
    private javax.swing.JLabel nimTxt;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordTxt;
    private javax.swing.JComboBox prodiComboBox;
    private javax.swing.JLabel prodiTxt;
    private javax.swing.JButton registerButton;
    private javax.swing.JLabel registrasiTitle;
    private javax.swing.JTextField saldoField;
    private javax.swing.JLabel saldoTxt;
    private javax.swing.JTextField telephoneField;
    private javax.swing.JLabel telephoneTxt;
    // End of variables declaration//GEN-END:variables
}
