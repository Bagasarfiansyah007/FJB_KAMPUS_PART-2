/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.FacultyModel;
import control.RegistrasiControl;
import general.DialogMessage;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class RegisterGUI extends javax.swing.JFrame {

    // Atribut
    public static RegistrasiControl control;
    private String codeFaculty;


    // Constructor
    public RegisterGUI() {
        initComponents();
        control = new RegistrasiControl(this);
        setComboValueFaculty();
        setComboValueStudyProgram(codeFaculty);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        guidePanel = new javax.swing.JPanel();
        registrasiTitle = new javax.swing.JLabel();
        dataGuidePanel = new javax.swing.JPanel();
        nimLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        facultyLabel = new javax.swing.JLabel();
        studyProgramLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        telephoneLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        saldoLabel = new javax.swing.JLabel();
        nimTxt = new javax.swing.JTextField();
        namaTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        telephoneTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        saldoTxt = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        facultyCombo = new javax.swing.JComboBox();
        studyProgramCombo = new javax.swing.JComboBox();
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

        nimLabel.setText("NIM");

        nameLabel.setText("Nama");

        facultyLabel.setText("Fakultas");

        studyProgramLabel.setText("Prodi");

        emailLabel.setText("Email");

        telephoneLabel.setText("Telephone");

        passwordLabel.setText("Password");

        saldoLabel.setText("Saldo");

        registerBtn.setText("Register");
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        facultyCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dataGuidePanelLayout = new javax.swing.GroupLayout(dataGuidePanel);
        dataGuidePanel.setLayout(dataGuidePanelLayout);
        dataGuidePanelLayout.setHorizontalGroup(
            dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataGuidePanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nimLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(facultyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studyProgramLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telephoneLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saldoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dataGuidePanelLayout.createSequentialGroup()
                        .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(242, Short.MAX_VALUE))
                    .addGroup(dataGuidePanelLayout.createSequentialGroup()
                        .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailTxt)
                            .addComponent(telephoneTxt)
                            .addComponent(passwordTxt)
                            .addComponent(saldoTxt)
                            .addComponent(namaTxt)
                            .addComponent(nimTxt))
                        .addGap(57, 57, 57))
                    .addGroup(dataGuidePanelLayout.createSequentialGroup()
                        .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(facultyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studyProgramCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        dataGuidePanelLayout.setVerticalGroup(
            dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dataGuidePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nimLabel)
                    .addComponent(nimTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facultyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facultyLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studyProgramLabel)
                    .addComponent(studyProgramCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(telephoneLabel)
                    .addComponent(telephoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordLabel)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saldoLabel)
                    .addComponent(saldoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(dataGuidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registerBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        getContentPane().add(dataGuidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/backg2.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Main procedure
    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        try {
            control.isiData(this);
        } catch (Exception e) {
            DialogMessage.dialogFormWarning("Tipe data yang dimasukan Salah !", "warning");
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        LogInGUI loginGui = new LogInGUI();
        loginGui.show();
        dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void facultyComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyComboActionPerformed
        studyProgramCombo.removeAllItems();
        codeFaculty = control.fakultas.get(facultyCombo.getSelectedIndex()).getIdFaculty();
        setComboValueStudyProgram (codeFaculty);
    }//GEN-LAST:event_facultyComboActionPerformed
    
    
    // Getter
    public String getComboFaculty() {
        return facultyCombo.getSelectedItem().toString();
    }

    public String getTxtName() {
        return namaTxt.getText();
    }

    public String getTxtNim() {
        return nimTxt.getText();
    }

    public String getTxtPassword() {
        return passwordTxt.getText();
    }

    public String getComboStudyProgram() {
        return studyProgramCombo.getSelectedItem().toString();
    }
    
    public String getTxtEmail(){
        return emailTxt.getText();
    }
    
    public int getTxtSaldo() {
        return Integer.parseInt(saldoTxt.getText());
    }

    public String getTxtTelphone() {
        return telephoneTxt.getText();
    }

    
    // Setter
    public void setLabel(String label){
        registrasiTitle.setText(label);
    }
    
    public void setComboValueFaculty (){
        for (int i = 0 ; i < control.fakultas.size();i++) {
            facultyCombo.addItem(control.fakultas.get(i).getNameFaculty());
        }
    }
    
    public void setComboValueStudyProgram (String codeFaculty){
        if (codeFaculty == null) {
            for (int i = 0 ; i < control.prodi.size();i++) {
                studyProgramCombo.addItem(control.prodi.get(i).getStudyProgramName());
            }
        } else {
            System.out.println(codeFaculty);
            for (int i = 0 ; i < control.prodi.size();i++) {
                if (codeFaculty.intern() == control.prodi.get(i).getFacultyCode().intern()){
                    studyProgramCombo.addItem(control.prodi.get(i).getStudyProgramName());
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
    private javax.swing.JButton cancelBtn;
    private javax.swing.JPanel dataGuidePanel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JComboBox facultyCombo;
    private javax.swing.JLabel facultyLabel;
    private javax.swing.JPanel guidePanel;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JTextField namaTxt;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nimLabel;
    private javax.swing.JTextField nimTxt;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel registrasiTitle;
    private javax.swing.JLabel saldoLabel;
    private javax.swing.JTextField saldoTxt;
    private javax.swing.JComboBox studyProgramCombo;
    private javax.swing.JLabel studyProgramLabel;
    private javax.swing.JLabel telephoneLabel;
    private javax.swing.JTextField telephoneTxt;
    // End of variables declaration//GEN-END:variables
}
