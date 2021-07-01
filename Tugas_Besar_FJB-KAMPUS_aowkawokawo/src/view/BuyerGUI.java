/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.CheckoutModel;
import control.PembeliControl;
import control.ProductControl;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static view.InputProduk.control;

/**
 *
 * @author USER
 */
public class BuyerGUI extends javax.swing.JFrame {

    public DefaultTableModel modelTable = new DefaultTableModel();
    ProductControl control;
    static PembeliControl <BuyerGUI> controlPembeli;
    private static int alamatLogin;
    private int selectProdukIndex;

    public BuyerGUI(int index, List<CheckoutModel> listInput) {
        initComponents();
        control = new ProductControl(this);
        controlPembeli = new PembeliControl(this);

        setNameColumnTable();
        alamatLogin = index;
        control.GetDataProduk(this);

        if (listInput != null) {
            controlPembeli.listCheckout = listInput;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogTroli = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        labelJudul = new javax.swing.JLabel();
        btnNoTroli = new javax.swing.JButton();
        btnYesTroli = new javax.swing.JButton();
        dialogKonfirmasi = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        yesBtn = new javax.swing.JButton();
        noBtn = new javax.swing.JButton();
        panelListStuff = new javax.swing.JPanel();
        BeliButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduk = new javax.swing.JTable();
        tambahTroliButton = new javax.swing.JButton();
        historyButton = new javax.swing.JButton();
        panelGuide = new javax.swing.JPanel();
        Troli = new javax.swing.JButton();
        updateAkunButton = new javax.swing.JButton();
        keluarButton = new javax.swing.JButton();
        CariBarangField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        paneDaftarBarang = new javax.swing.JScrollPane();
        DaftarBarangField = new javax.swing.JLabel();
        comboKategori = new javax.swing.JComboBox();
        nankatsuTxt = new javax.swing.JLabel();
        fjbTxt = new javax.swing.JLabel();
        backgroud = new javax.swing.JLabel();

        dialogTroli.setSize(new java.awt.Dimension(348, 223));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        labelJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJudul.setText("jLabel5");

        btnNoTroli.setText("no");
        btnNoTroli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoTroliActionPerformed(evt);
            }
        });

        btnYesTroli.setText("yes");
        btnYesTroli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesTroliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelJudul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(btnYesTroli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNoTroli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(96, 96, 96))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(labelJudul)
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNoTroli)
                    .addComponent(btnYesTroli))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogTroliLayout = new javax.swing.GroupLayout(dialogTroli.getContentPane());
        dialogTroli.getContentPane().setLayout(dialogTroliLayout);
        dialogTroliLayout.setHorizontalGroup(
            dialogTroliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogTroliLayout.setVerticalGroup(
            dialogTroliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dialogKonfirmasi.setSize(new java.awt.Dimension(342, 216));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Apakah kamu yakin ingin \nkeluar dari aplikasi ?");

        yesBtn.setText("Yes");
        yesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesBtnActionPerformed(evt);
            }
        });

        noBtn.setText("no");
        noBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(yesBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesBtn)
                    .addComponent(noBtn))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogKonfirmasiLayout = new javax.swing.GroupLayout(dialogKonfirmasi.getContentPane());
        dialogKonfirmasi.getContentPane().setLayout(dialogKonfirmasiLayout);
        dialogKonfirmasiLayout.setHorizontalGroup(
            dialogKonfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogKonfirmasiLayout.setVerticalGroup(
            dialogKonfirmasiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelListStuff.setBackground(new java.awt.Color(255, 255, 255));

        BeliButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        BeliButton.setText("Beli");

        tableProduk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableProduk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableProdukMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tableProduk);

        tambahTroliButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        tambahTroliButton.setText("Tambah ke troli");
        tambahTroliButton.setEnabled(false);
        tambahTroliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahTroliButtonActionPerformed(evt);
            }
        });

        historyButton.setText("History");
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelListStuffLayout = new javax.swing.GroupLayout(panelListStuff);
        panelListStuff.setLayout(panelListStuffLayout);
        panelListStuffLayout.setHorizontalGroup(
            panelListStuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListStuffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelListStuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelListStuffLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(historyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tambahTroliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BeliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelListStuffLayout.setVerticalGroup(
            panelListStuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListStuffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(panelListStuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BeliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tambahTroliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historyButton))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        getContentPane().add(panelListStuff, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 600, 310));

        panelGuide.setOpaque(false);

        Troli.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        Troli.setText("Troli");
        Troli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TroliActionPerformed(evt);
            }
        });

        updateAkunButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        updateAkunButton.setText("Update Profil");

        keluarButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        keluarButton.setText("Keluar");
        keluarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarButtonActionPerformed(evt);
            }
        });

        CariBarangField.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N

        searchButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        DaftarBarangField.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        DaftarBarangField.setText("Daftar Barang");
        paneDaftarBarang.setViewportView(DaftarBarangField);

        comboKategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elektronik", "Fashion", "Alat Tulis Kerja", "Hobi", "Perabot Rumah Tangga" }));
        comboKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboKategoriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGuideLayout = new javax.swing.GroupLayout(panelGuide);
        panelGuide.setLayout(panelGuideLayout);
        panelGuideLayout.setHorizontalGroup(
            panelGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideLayout.createSequentialGroup()
                .addGroup(panelGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGuideLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(paneDaftarBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CariBarangField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Troli, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGuideLayout.createSequentialGroup()
                        .addComponent(updateAkunButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(keluarButton))
                    .addGroup(panelGuideLayout.createSequentialGroup()
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        panelGuideLayout.setVerticalGroup(
            panelGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGuideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Troli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateAkunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(keluarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(panelGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CariBarangField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboKategori, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addComponent(paneDaftarBarang))
                .addContainerGap())
        );

        getContentPane().add(panelGuide, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 140));

        nankatsuTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nankatsuTxt.setForeground(new java.awt.Color(255, 255, 255));
        nankatsuTxt.setText("NANKATSU");
        getContentPane().add(nankatsuTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 180, 20));

        fjbTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fjbTxt.setForeground(new java.awt.Color(255, 255, 255));
        fjbTxt.setText("FJB KAMPUS");
        getContentPane().add(fjbTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 170, 20));

        backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/background_form1.png"))); // NOI18N
        getContentPane().add(backgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    // Main Procedur
    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String nama = CariBarangField.getText();

        if (nama.isEmpty()) {
            control.GetDataProduk(this);
        } else {
            control.searchProduct(this, nama);
            CariBarangField.setText("");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void keluarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarButtonActionPerformed
        dialogKonfirmasi.setLocationRelativeTo(null);
        dialogKonfirmasi.show();
    }//GEN-LAST:event_keluarButtonActionPerformed

    private void TroliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TroliActionPerformed
        CheckOutGUI formCheckout = new CheckOutGUI(alamatLogin, controlPembeli.listCheckout);
        formCheckout.show();
        dispose();
    }//GEN-LAST:event_TroliActionPerformed

    private void comboKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboKategoriActionPerformed
        String nama = comboKategori.getSelectedItem().toString();
        if (nama.isEmpty()) {
            control.GetDataProduk(this);
        } else {
            control.searchProductCategory(this, nama);
        }
    }//GEN-LAST:event_comboKategoriActionPerformed

    private void yesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBtnActionPerformed
        LogInAkunGUI formLogin = new LogInAkunGUI(alamatLogin + 1);
        formLogin.show();
        dialogKonfirmasi.dispose();
        dispose();
    }//GEN-LAST:event_yesBtnActionPerformed

    private void noBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBtnActionPerformed
        dialogKonfirmasi.dispose();
    }//GEN-LAST:event_noBtnActionPerformed

    private void tambahTroliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahTroliButtonActionPerformed
        dialogTroli.setLocationRelativeTo(null);
        dialogTroli.show();
        labelJudul.setText("ingin Menambahkan " + controlPembeli.listProduk.get(selectProdukIndex).getNama() + " ?");
    }//GEN-LAST:event_tambahTroliButtonActionPerformed

    private void tableProdukMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdukMousePressed
        selectProdukIndex = controlPembeli.findeIndexProduct(tableProduk.getValueAt(tableProduk.getSelectedRow(), 0).toString());
        tambahTroliButton.setEnabled(true);
    }//GEN-LAST:event_tableProdukMousePressed

    private void btnYesTroliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesTroliActionPerformed
        controlPembeli.inserListCheckout(selectProdukIndex, alamatLogin);
        for (int i = 0 ; i < controlPembeli.listCheckout.size(); i++) {
            System.out.println(controlPembeli.listCheckout.get(i).getIdBayar());
        }
        dialogTroli.dispose();
    }//GEN-LAST:event_btnYesTroliActionPerformed

    private void btnNoTroliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoTroliActionPerformed
        dialogTroli.dispose();
    }//GEN-LAST:event_btnNoTroliActionPerformed

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
        HistoryGUI history = new HistoryGUI(alamatLogin,controlPembeli.listCheckout);
        history.show();
        hide();
    }//GEN-LAST:event_historyButtonActionPerformed

        
    // Setter
    public void setNameColumnTable() {
        tableProduk.setModel(modelTable);
        modelTable.addColumn("Kode Produk");
        modelTable.addColumn("Nama Produk");
        modelTable.addColumn("Kategori");
        modelTable.addColumn("Stok");
        modelTable.addColumn("Harga");
    }
    
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
            java.util.logging.Logger.getLogger(BuyerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyerGUI(alamatLogin, controlPembeli.listCheckout).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BeliButton;
    private javax.swing.JTextField CariBarangField;
    private javax.swing.JLabel DaftarBarangField;
    private javax.swing.JButton Troli;
    private javax.swing.JLabel backgroud;
    private javax.swing.JButton btnNoTroli;
    private javax.swing.JButton btnYesTroli;
    private javax.swing.JComboBox comboKategori;
    private javax.swing.JDialog dialogKonfirmasi;
    private javax.swing.JDialog dialogTroli;
    private javax.swing.JLabel fjbTxt;
    private javax.swing.JButton historyButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keluarButton;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel nankatsuTxt;
    private javax.swing.JButton noBtn;
    private javax.swing.JScrollPane paneDaftarBarang;
    private javax.swing.JPanel panelGuide;
    private javax.swing.JPanel panelListStuff;
    private javax.swing.JButton searchButton;
    private javax.swing.JTable tableProduk;
    private javax.swing.JButton tambahTroliButton;
    private javax.swing.JButton updateAkunButton;
    private javax.swing.JButton yesBtn;
    // End of variables declaration//GEN-END:variables
}
