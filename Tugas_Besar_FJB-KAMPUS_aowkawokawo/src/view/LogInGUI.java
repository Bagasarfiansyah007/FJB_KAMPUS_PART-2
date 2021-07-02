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

        loginPanel = new javax.swing.JPanel();
        enterBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JButton();
        passwordTxr = new javax.swing.JPasswordField();
        usernameTxt = new javax.swing.JTextField();
        masukkanNimtitle = new javax.swing.JLabel();
        logInTitle = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel.setOpaque(false);

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(loginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 620, 250));

        enterBtn.setBackground(new java.awt.Color(255, 204, 153));
        enterBtn.setText("Login");
        enterBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        enterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });
        getContentPane().add(enterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 260, 40));

        registerBtn.setBackground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("Register");
        registerBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 116, 114)));
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(registerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 260, 40));
        getContentPane().add(passwordTxr, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 260, 40));

        usernameTxt.setName(""); // NOI18N
        getContentPane().add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 260, 40));

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
    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
       RegisterGUI formregister = new RegisterGUI();
       formregister.show();
       dispose();
    }//GEN-LAST:event_registerBtnActionPerformed

    private void enterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterBtnActionPerformed
        control.findDataUserLogin(this, getUsernameField(), getPasswordField());
    }//GEN-LAST:event_enterBtnActionPerformed

    // Getter
    public String getUsernameField(){
        return usernameTxt.getText();
    }
    
    public String getPasswordField(){
        return passwordTxr.getText();
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
    private javax.swing.JButton enterBtn;
    private javax.swing.JLabel logInTitle;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel masukkanNimtitle;
    private javax.swing.JPasswordField passwordTxr;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
