
package view;

import java.awt.event.MouseEvent;
import static view.LogInAkunGUI.control;

public class SellerGUI extends javax.swing.JFrame {
    
    // Attribute
    private static int alamatLogin;
    
    // Constructor
    public SellerGUI(int index) {
        initComponents();
        alamatLogin = index;
        setNamaAkun(alamatLogin);
        setNimAkun(alamatLogin);
        System.out.println(alamatLogin);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guidePanelTop = new javax.swing.JPanel();
        menuTitle = new javax.swing.JLabel();
        fjbTxt = new javax.swing.JLabel();
        guideMenuPanel = new javax.swing.JPanel();
        buttonUpdateAkun = new javax.swing.JButton();
        nankatsuTxt = new javax.swing.JLabel();
        buttonLogOut = new javax.swing.JButton();
        buttonDaftarBarang = new javax.swing.JButton();
        buttonJual = new javax.swing.JButton();
        namaLabel = new javax.swing.JLabel();
        nimLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guidePanelTop.setOpaque(false);

        menuTitle.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        menuTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuTitle.setText("MENU PENJUAL");

        fjbTxt.setForeground(new java.awt.Color(255, 255, 255));
        fjbTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fjbTxt.setText("FJB Kampus");

        javax.swing.GroupLayout guidePanelTopLayout = new javax.swing.GroupLayout(guidePanelTop);
        guidePanelTop.setLayout(guidePanelTopLayout);
        guidePanelTopLayout.setHorizontalGroup(
            guidePanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guidePanelTopLayout.createSequentialGroup()
                .addComponent(fjbTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(434, Short.MAX_VALUE))
            .addComponent(menuTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        guidePanelTopLayout.setVerticalGroup(
            guidePanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guidePanelTopLayout.createSequentialGroup()
                .addComponent(fjbTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(guidePanelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 618, 109));

        guideMenuPanel.setOpaque(false);

        buttonUpdateAkun.setText("Update Profil");

        nankatsuTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nankatsuTxt.setText("Nankatsu");

        buttonLogOut.setText("Keluar");
        buttonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLogOutActionPerformed(evt);
            }
        });

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

        namaLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        namaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        namaLabel.setText("jLabel2");

        nimLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nimLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nimLabel.setText("jLabel2");

        javax.swing.GroupLayout guideMenuPanelLayout = new javax.swing.GroupLayout(guideMenuPanel);
        guideMenuPanel.setLayout(guideMenuPanelLayout);
        guideMenuPanelLayout.setHorizontalGroup(
            guideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guideMenuPanelLayout.createSequentialGroup()
                .addGap(0, 431, Short.MAX_VALUE)
                .addComponent(nankatsuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(namaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guideMenuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(guideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonUpdateAkun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonDaftarBarang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonJual, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183))
            .addComponent(nimLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        guideMenuPanelLayout.setVerticalGroup(
            guideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guideMenuPanelLayout.createSequentialGroup()
                .addComponent(namaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nimLabel)
                .addGap(20, 20, 20)
                .addComponent(buttonJual, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonDaftarBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonUpdateAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(nankatsuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(guideMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 618, 470));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/background_form1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLogOutActionPerformed
        LogInAkunGUI formMenu = new LogInAkunGUI(alamatLogin + 1);
        formMenu.show();
        dispose();
    }//GEN-LAST:event_buttonLogOutActionPerformed

    private void buttonDaftarBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDaftarBarangActionPerformed
        DaftarBarang formDaftar = new DaftarBarang(alamatLogin);
        formDaftar.show();
        dispose();
    }//GEN-LAST:event_buttonDaftarBarangActionPerformed
    
    private void buttonJualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonJualActionPerformed
        InputProduk formInput = new InputProduk(alamatLogin);
        formInput.show();
        dispose();
    }//GEN-LAST:event_buttonJualActionPerformed

    
    // Setter
    public void setNamaAkun(int index) {
        namaLabel.setText(control.user.get(index).getNama() + "-" + control.user.get(index).getFakultas());
    }
    
    public void setNimAkun(int index) {
        nimLabel.setText("( "+control.user.get(index).getNim() + " )");
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellerGUI(alamatLogin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton buttonDaftarBarang;
    private javax.swing.JButton buttonJual;
    private javax.swing.JButton buttonLogOut;
    private javax.swing.JButton buttonUpdateAkun;
    private javax.swing.JLabel fjbTxt;
    private javax.swing.JPanel guideMenuPanel;
    private javax.swing.JPanel guidePanelTop;
    private javax.swing.JLabel menuTitle;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel nankatsuTxt;
    private javax.swing.JLabel nimLabel;
    // End of variables declaration//GEN-END:variables
}
