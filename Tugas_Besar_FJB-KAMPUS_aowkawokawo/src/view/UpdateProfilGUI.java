
package view;

public class UpdateProfilGUI extends javax.swing.JFrame {

    public UpdateProfilGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUpdateData = new javax.swing.JPanel();
        namaTxt = new javax.swing.JLabel();
        nimTxt = new javax.swing.JLabel();
        mailTxt = new javax.swing.JLabel();
        noTelephoneTxt = new javax.swing.JLabel();
        passwordTxt = new javax.swing.JLabel();
        saldoTxt = new javax.swing.JLabel();
        fakultasTxt = new javax.swing.JLabel();
        prodiTxt = new javax.swing.JLabel();
        namaField = new javax.swing.JTextField();
        nimField = new javax.swing.JTextField();
        mailField = new javax.swing.JTextField();
        noTelephoneField = new javax.swing.JTextField();
        passwordField = new javax.swing.JTextField();
        saldoField = new javax.swing.JTextField();
        fakultasField = new javax.swing.JTextField();
        prodiField = new javax.swing.JTextField();
        simpanButton = new javax.swing.JButton();
        updateDataTitle = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelUpdateData.setOpaque(false);

        namaTxt.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        namaTxt.setText("Nama");

        nimTxt.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        nimTxt.setText("Nim");

        mailTxt.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        mailTxt.setText("E-Mail");

        noTelephoneTxt.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        noTelephoneTxt.setText("No Telephone");

        passwordTxt.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        passwordTxt.setText("Password");

        saldoTxt.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        saldoTxt.setText("Isi Saldo");

        fakultasTxt.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        fakultasTxt.setText("Fakultas");

        prodiTxt.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        prodiTxt.setText("Prodi");

        simpanButton.setText("Simpan");

        updateDataTitle.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        updateDataTitle.setText("Update Data");

        javax.swing.GroupLayout panelUpdateDataLayout = new javax.swing.GroupLayout(panelUpdateData);
        panelUpdateData.setLayout(panelUpdateDataLayout);
        panelUpdateDataLayout.setHorizontalGroup(
            panelUpdateDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUpdateDataLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelUpdateDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(prodiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fakultasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saldoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nimTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(noTelephoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUpdateDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelUpdateDataLayout.createSequentialGroup()
                        .addComponent(simpanButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(namaField)
                    .addComponent(nimField)
                    .addComponent(mailField)
                    .addComponent(noTelephoneField)
                    .addComponent(passwordField)
                    .addComponent(saldoField)
                    .addComponent(fakultasField)
                    .addComponent(prodiField))
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUpdateDataLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(updateDataTitle)
                .addGap(250, 250, 250))
        );
        panelUpdateDataLayout.setVerticalGroup(
            panelUpdateDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelUpdateDataLayout.createSequentialGroup()
                .addComponent(updateDataTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUpdateDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelUpdateDataLayout.createSequentialGroup()
                        .addGroup(panelUpdateDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelUpdateDataLayout.createSequentialGroup()
                                .addGroup(panelUpdateDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(panelUpdateDataLayout.createSequentialGroup()
                                        .addGroup(panelUpdateDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(namaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(namaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelUpdateDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(nimTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nimField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelUpdateDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(mailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(panelUpdateDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(noTelephoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(noTelephoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saldoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(saldoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fakultasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fakultasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelUpdateDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prodiField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(simpanButton))
        );

        getContentPane().add(panelUpdateData, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 620, 370));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/backg2.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateProfilGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JTextField fakultasField;
    private javax.swing.JLabel fakultasTxt;
    private javax.swing.JTextField mailField;
    private javax.swing.JLabel mailTxt;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaTxt;
    private javax.swing.JTextField nimField;
    private javax.swing.JLabel nimTxt;
    private javax.swing.JTextField noTelephoneField;
    private javax.swing.JLabel noTelephoneTxt;
    private javax.swing.JPanel panelUpdateData;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordTxt;
    private javax.swing.JTextField prodiField;
    private javax.swing.JLabel prodiTxt;
    private javax.swing.JTextField saldoField;
    private javax.swing.JLabel saldoTxt;
    private javax.swing.JButton simpanButton;
    private javax.swing.JLabel updateDataTitle;
    // End of variables declaration//GEN-END:variables
}
