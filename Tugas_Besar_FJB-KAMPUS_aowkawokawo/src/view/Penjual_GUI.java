
package view;

import java.awt.event.MouseEvent;
import static view.LogInAkun_GUI.control;

public class Penjual_GUI extends javax.swing.JFrame {
    
    private static int alamatLogin;
    
    public Penjual_GUI(int index) {
        initComponents();
        alamatLogin = index;
        setNamaAkun(alamatLogin);
        setNimAkun(alamatLogin);
        System.out.println(alamatLogin);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelMenu = new javax.swing.JLabel();
        labelNamaApp = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        buttonUpdateAkun = new javax.swing.JButton();
        buttonLogout = new javax.swing.JButton();
        labelNamaKlmpk = new javax.swing.JLabel();
        buttonDaftarBarang = new javax.swing.JButton();
        buttonJual = new javax.swing.JButton();
        namaTxt = new javax.swing.JLabel();
        nimTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        labelMenu.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        labelMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelMenu.setText("MENU PENJUAL");

        labelNamaApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNamaApp.setText("FJB Kampus");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelNamaApp, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(434, Short.MAX_VALUE))
            .addComponent(labelMenu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelNamaApp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(labelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 618, 109));

        jPanel2.setOpaque(false);

        buttonUpdateAkun.setText("Update Profil");
        buttonUpdateAkun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUpdateAkunActionPerformed(evt);
            }
        });

        buttonLogout.setText("Logout");
        buttonLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogoutActionPerformed(evt);
            }
        });

        labelNamaKlmpk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNamaKlmpk.setText("Nankatsu");

        buttonDaftarBarang.setText("Daftar Barang");
        buttonDaftarBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDaftarBarangActionPerformed(evt);
            }
        });

        buttonJual.setText("Jual Barang");
        buttonJual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonJualActionPerformed(evt);
            }
        });

        namaTxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        namaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namaTxt.setText("jLabel2");

        nimTxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nimTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nimTxt.setText("jLabel2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 431, Short.MAX_VALUE)
                .addComponent(labelNamaKlmpk, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(namaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonUpdateAkun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDaftarBarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonJual, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183))
            .addComponent(nimTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(namaTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nimTxt)
                .addGap(20, 20, 20)
                .addComponent(buttonJual, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDaftarBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonUpdateAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(labelNamaKlmpk, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 618, 470));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/background_form1.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonUpdateAkunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUpdateAkunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonUpdateAkunActionPerformed

    private void buttonLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonLogoutActionPerformed

    private void buttonDaftarBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDaftarBarangActionPerformed
        DaftarBarang formDaftar = new DaftarBarang(alamatLogin);
        formDaftar.show();
        dispose();
    }//GEN-LAST:event_buttonDaftarBarangActionPerformed

    public void setNamaAkun(int index) {
        namaTxt.setText(control.user.get(index).getNama() + "-" + control.user.get(index).getFakultas());
    }
    
    public void setNimAkun(int index) {
        nimTxt.setText("( "+control.user.get(index).getNim() + " )");
    }
    
    private void buttonJualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonJualActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Penjual_GUI(alamatLogin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDaftarBarang;
    private javax.swing.JButton buttonJual;
    private javax.swing.JButton buttonLogout;
    private javax.swing.JButton buttonUpdateAkun;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelMenu;
    private javax.swing.JLabel labelNamaApp;
    private javax.swing.JLabel labelNamaKlmpk;
    private javax.swing.JLabel namaTxt;
    private javax.swing.JLabel nimTxt;
    // End of variables declaration//GEN-END:variables
}
