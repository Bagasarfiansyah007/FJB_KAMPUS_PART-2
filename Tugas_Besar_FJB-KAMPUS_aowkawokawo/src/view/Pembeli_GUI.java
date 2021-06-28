/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.Checkout_model;
import control.Pembeli_control;
import control.Product_control;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static view.InputProduk.control;

/**
 *
 * @author USER
 */
public class Pembeli_GUI extends javax.swing.JFrame {

    public DefaultTableModel modelTable = new DefaultTableModel();
    Product_control control;
    static Pembeli_control controlPembeli;
    private static int alamatLogin;
    private int selectProdukIndex;

    public Pembeli_GUI(int index, List<Checkout_model> listInput) {
        initComponents();
        control = new Product_control(this);
        controlPembeli = new Pembeli_control(this);

        setNameColumnTable();
        alamatLogin = index;
        control.GetDataProduk(this);

        if (listInput != null) {
            controlPembeli.listCheckout = listInput;
        }
    }

    public void setNameColumnTable() {
        tableProduk.setModel(modelTable);
        modelTable.addColumn("Kode Produk");
        modelTable.addColumn("Nama Produk");
        modelTable.addColumn("Kategori");
        modelTable.addColumn("Stok");
        modelTable.addColumn("Harga");
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
        jPanel1 = new javax.swing.JPanel();
        BeliButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduk = new javax.swing.JTable();
        BeliButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Troli = new javax.swing.JButton();
        AkunButton = new javax.swing.JButton();
        BeliButton1 = new javax.swing.JButton();
        CariBarangField = new javax.swing.JTextField();
        NamaSearchButton = new javax.swing.JButton();
        PaneDaftarBarang = new javax.swing.JScrollPane();
        DaftarBarangField = new javax.swing.JLabel();
        comboKategori = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        OkeSearchButton1 = new javax.swing.JButton();

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        BeliButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        BeliButton.setText("Beli");
        BeliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliButtonActionPerformed(evt);
            }
        });

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

        BeliButton2.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        BeliButton2.setText("Tambah ke troli");
        BeliButton2.setEnabled(false);
        BeliButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BeliButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BeliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BeliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BeliButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 600, 310));

        jPanel2.setOpaque(false);

        Troli.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        Troli.setText("Troli");
        Troli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TroliActionPerformed(evt);
            }
        });

        AkunButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        AkunButton.setText("Update Profil");
        AkunButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AkunButtonActionPerformed(evt);
            }
        });

        BeliButton1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        BeliButton1.setText("Keluar");
        BeliButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliButton1ActionPerformed(evt);
            }
        });

        CariBarangField.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        CariBarangField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariBarangFieldActionPerformed(evt);
            }
        });

        NamaSearchButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        NamaSearchButton.setText("Search");
        NamaSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaSearchButtonActionPerformed(evt);
            }
        });

        DaftarBarangField.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        DaftarBarangField.setText("Daftar Barang");
        PaneDaftarBarang.setViewportView(DaftarBarangField);

        comboKategori.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elektronik", "Fashion", "Alat Tulis Kerja", "Hobi", "Perabot Rumah Tangga" }));
        comboKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboKategoriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(PaneDaftarBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CariBarangField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Troli, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(AkunButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BeliButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(NamaSearchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Troli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AkunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BeliButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CariBarangField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NamaSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboKategori, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addComponent(PaneDaftarBarang))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 140));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NANKATSU");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 180, 20));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FJB KAMPUS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 6, 170, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/background_form1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        OkeSearchButton1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        OkeSearchButton1.setText("Oke");
        OkeSearchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OkeSearchButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(OkeSearchButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 70, 30));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BeliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BeliButtonActionPerformed

    private void OkeSearchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkeSearchButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OkeSearchButton1ActionPerformed

    private void NamaSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaSearchButtonActionPerformed
        String nama = CariBarangField.getText();

        if (nama.isEmpty()) {
            control.GetDataProduk(this);
        } else {
            control.cariBarang(this, nama);
            CariBarangField.setText("");
        }
    }//GEN-LAST:event_NamaSearchButtonActionPerformed

    private void CariBarangFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariBarangFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CariBarangFieldActionPerformed

    private void BeliButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliButton1ActionPerformed
        dialogKonfirmasi.setLocationRelativeTo(null);
        dialogKonfirmasi.show();
    }//GEN-LAST:event_BeliButton1ActionPerformed

    private void AkunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AkunButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AkunButtonActionPerformed

    private void TroliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TroliActionPerformed
        CheckOut_GUI formCheckout = new CheckOut_GUI(alamatLogin, controlPembeli.listCheckout);
        formCheckout.show();
        dispose();
    }//GEN-LAST:event_TroliActionPerformed

    private void comboKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboKategoriActionPerformed
        String nama = comboKategori.getSelectedItem().toString();
        if (nama.isEmpty()) {
            control.GetDataProduk(this);
        } else {
            control.cariBarangKategori(this, nama);
        }
    }//GEN-LAST:event_comboKategoriActionPerformed

    private void yesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBtnActionPerformed
        LogInAkun_GUI formLogin = new LogInAkun_GUI(alamatLogin + 1);
        formLogin.show();
        dialogKonfirmasi.dispose();
        dispose();
    }//GEN-LAST:event_yesBtnActionPerformed

    private void noBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBtnActionPerformed
        dialogKonfirmasi.dispose();
    }//GEN-LAST:event_noBtnActionPerformed

    private void BeliButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliButton2ActionPerformed
        dialogTroli.setLocationRelativeTo(null);
        dialogTroli.show();
        labelJudul.setText("ingin Menambahkan " + controlPembeli.listProduk.get(selectProdukIndex).getNama() + " ?");
    }//GEN-LAST:event_BeliButton2ActionPerformed


    private void tableProdukMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdukMousePressed
        selectProdukIndex = controlPembeli.CariIndexProduk(tableProduk.getValueAt(tableProduk.getSelectedRow(), 0).toString());
        BeliButton2.setEnabled(true);
    }//GEN-LAST:event_tableProdukMousePressed

    private void btnYesTroliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesTroliActionPerformed
        controlPembeli.isiDataCheckout(selectProdukIndex, alamatLogin);
        for (int i = 0 ; i < controlPembeli.listCheckout.size(); i++) {
            System.out.println(controlPembeli.listCheckout.get(i).getIdBayar());
        }
        dialogTroli.dispose();
    }//GEN-LAST:event_btnYesTroliActionPerformed

    private void btnNoTroliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoTroliActionPerformed
        dialogTroli.dispose();
    }//GEN-LAST:event_btnNoTroliActionPerformed

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
            java.util.logging.Logger.getLogger(Pembeli_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pembeli_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pembeli_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pembeli_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pembeli_GUI(alamatLogin, controlPembeli.listCheckout).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AkunButton;
    private javax.swing.JButton BeliButton;
    private javax.swing.JButton BeliButton1;
    private javax.swing.JButton BeliButton2;
    private javax.swing.JTextField CariBarangField;
    private javax.swing.JLabel DaftarBarangField;
    private javax.swing.JButton NamaSearchButton;
    private javax.swing.JButton OkeSearchButton1;
    private javax.swing.JScrollPane PaneDaftarBarang;
    private javax.swing.JButton Troli;
    private javax.swing.JButton btnNoTroli;
    private javax.swing.JButton btnYesTroli;
    private javax.swing.JComboBox comboKategori;
    private javax.swing.JDialog dialogKonfirmasi;
    private javax.swing.JDialog dialogTroli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JButton noBtn;
    private javax.swing.JTable tableProduk;
    private javax.swing.JButton yesBtn;
    // End of variables declaration//GEN-END:variables
}
