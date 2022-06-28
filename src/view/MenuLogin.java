
package view;

import control.LoginControl;

public class MenuLogin extends javax.swing.JFrame {

    // Atribut
    private static int addressLogin;
    public static LoginControl <MenuLogin> control;
    
    // Constuktor
    public MenuLogin(int index) {
        initComponents();
        addressLogin = index - 1;
        control = new LoginControl(this);
        setNameAccount(addressLogin);
        setNimAccount(addressLogin);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel1 = new javax.swing.JPanel();
        loginPanel2 = new javax.swing.JPanel();
        loginPanel3 = new javax.swing.JPanel();
        masukSebagaiLabel = new javax.swing.JLabel();
        buyyerBtn = new javax.swing.JButton();
        sellerBtn = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        nimLabel = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginPanel1.setOpaque(false);

        javax.swing.GroupLayout loginPanel1Layout = new javax.swing.GroupLayout(loginPanel1);
        loginPanel1.setLayout(loginPanel1Layout);
        loginPanel1Layout.setHorizontalGroup(
            loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        loginPanel1Layout.setVerticalGroup(
            loginPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(loginPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, -1));

        loginPanel2.setOpaque(false);

        javax.swing.GroupLayout loginPanel2Layout = new javax.swing.GroupLayout(loginPanel2);
        loginPanel2.setLayout(loginPanel2Layout);
        loginPanel2Layout.setHorizontalGroup(
            loginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );
        loginPanel2Layout.setVerticalGroup(
            loginPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(loginPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 470, 610, -1));

        loginPanel3.setOpaque(false);

        masukSebagaiLabel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        masukSebagaiLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        masukSebagaiLabel.setText("Masuk Sebagai");

        buyyerBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        buyyerBtn.setText("Pembeli");
        buyyerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyyerBtnActionPerformed(evt);
            }
        });

        sellerBtn.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        sellerBtn.setText("Penjual");
        sellerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellerBtnActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("jLabel2");

        nimLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nimLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nimLabel.setText("jLabel2");

        javax.swing.GroupLayout loginPanel3Layout = new javax.swing.GroupLayout(loginPanel3);
        loginPanel3.setLayout(loginPanel3Layout);
        loginPanel3Layout.setHorizontalGroup(
            loginPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanel3Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(loginPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sellerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buyyerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(loginPanel3Layout.createSequentialGroup()
                .addGroup(loginPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nimLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(masukSebagaiLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        loginPanel3Layout.setVerticalGroup(
            loginPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(masukSebagaiLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nimLabel)
                .addGap(29, 29, 29)
                .addComponent(buyyerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sellerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        getContentPane().add(loginPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 610, 370));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/backg2.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 607, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // Main Procedure
    private void buyyerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyyerBtnActionPerformed
        BuyerGUI formBuyer = new BuyerGUI(addressLogin,null);
        formBuyer.show();
        dispose();
    }//GEN-LAST:event_buyyerBtnActionPerformed

    private void sellerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellerBtnActionPerformed
        SellerGUI formSeler = new SellerGUI(addressLogin);
        formSeler.show();
        dispose();
    }//GEN-LAST:event_sellerBtnActionPerformed

    
    // Setter
    public void setNameAccount(int index) {
        nameLabel.setText(control.user.get(index).getName()+ "-" + control.user.get(index).getFaculty());
    }
    
    public void setNimAccount(int index) {
        nimLabel.setText("( "+control.user.get(index).getNim() + " )");
    }
    
    
    // Main
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuLogin(addressLogin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton buyyerBtn;
    private javax.swing.JPanel loginPanel1;
    private javax.swing.JPanel loginPanel2;
    private javax.swing.JPanel loginPanel3;
    private javax.swing.JLabel masukSebagaiLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nimLabel;
    private javax.swing.JButton sellerBtn;
    // End of variables declaration//GEN-END:variables
}
