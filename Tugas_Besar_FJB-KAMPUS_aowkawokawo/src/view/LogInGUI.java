/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.LoginControl;
import Database.DBconnUser;

public class LogInGUI extends javax.swing.JFrame {

    // Atribute
    public static LoginControl <LogInGUI> control;

    // Constructor
    public LogInGUI() {
        initComponents();
        control = new LoginControl(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        masukBitton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        usernameField = new javax.swing.JTextField();
        masukkanNimtitle = new javax.swing.JLabel();
        logInTitle = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 620, 250));

        masukBitton.setBackground(new java.awt.Color(255, 204, 153));
        masukBitton.setText("Login");
        masukBitton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        masukBitton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masukBittonActionPerformed(evt);
            }
        });
        getContentPane().add(masukBitton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 260, 40));

        registerButton.setBackground(new java.awt.Color(255, 255, 255));
        registerButton.setText("Register");
        registerButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 116, 114)));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 260, 40));
        getContentPane().add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 260, 40));

        usernameField.setName(""); // NOI18N
        getContentPane().add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 260, 40));

        masukkanNimtitle.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        masukkanNimtitle.setForeground(new java.awt.Color(255, 85, 85));
        masukkanNimtitle.setText("Masukkan Nim dan Password");
        getContentPane().add(masukkanNimtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 210, 30));

        logInTitle.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        logInTitle.setForeground(new java.awt.Color(255, 85, 85));
        logInTitle.setText("LOG-IN");
        getContentPane().add(logInTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 50, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/backg2.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Main Procedure
    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
       RegisterGUI formregister = new RegisterGUI();
       formregister.show();
       dispose();
    }//GEN-LAST:event_registerButtonActionPerformed

    private void masukBittonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masukBittonActionPerformed
        control.cekDataUserLogin(this, getUsernameField(), getPasswordField());
    }//GEN-LAST:event_masukBittonActionPerformed

    // Getter
    public String getUsernameField(){
        return usernameField.getText();
    }
    
    public String getPasswordField(){
        return passwordField.getText();
    }
    
   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogInGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logInTitle;
    private javax.swing.JButton masukBitton;
    private javax.swing.JLabel masukkanNimtitle;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton registerButton;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
