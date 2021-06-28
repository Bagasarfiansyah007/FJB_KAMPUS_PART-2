/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Database.DBconn_checkout;
import Database.DBconn_user;
import Model.Checkout_model;
import control.Pembeli_control;
import control.Product_control;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.SpinnerNumberModel;
import static view.Pembeli_GUI.controlPembeli;

public class CheckOut_GUI extends javax.swing.JFrame {

    private static int alamatLogin;
    static Pembeli_control control;
    private int indexHapus;
    
    DefaultListModel<String> ListCheckout =new DefaultListModel<String>();
    private int Harga;
    
    public CheckOut_GUI(int index,List <Checkout_model> listInput) {
        initComponents();
        alamatLogin = index;
        control = new Pembeli_control(this);
        control.listCheckout = listInput;
        setList();
        setSemuaProdukHarga();
    }
    
    public void setList(){
        for (int i = 0; i < control.listCheckout.size();i++){
            ListCheckout.addElement(control.listCheckout.get(i).getNamaProduk());
            jListBarang.setModel(ListCheckout);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        metodePembayaran = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        dialogEwallet = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        saldoTxt = new javax.swing.JLabel();
        hargaTxt = new javax.swing.JLabel();
        btnBayarSekarang = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        PaneDaftarBarang = new javax.swing.JScrollPane();
        CheckOutTxt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListBarang = new javax.swing.JList<String>();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        totalHargaProduk = new javax.swing.JLabel();
        hargaLabel = new javax.swing.JLabel();
        txtBanyak = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        totalSemuaProduk = new javax.swing.JLabel();
        HapusBarangButton = new javax.swing.JButton();
        PembayaranButton = new javax.swing.JButton();
        PembayaranButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        metodePembayaran.setBackground(new java.awt.Color(255, 255, 255));
        metodePembayaran.setResizable(false);
        metodePembayaran.setSize(new java.awt.Dimension(337, 303));
        metodePembayaran.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Metode Pembayaran");
        metodePembayaran.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, 338, -1));

        jPanel6.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        metodePembayaran.getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 80));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        metodePembayaran.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 230, 50));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Pembayaran Rekening");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        metodePembayaran.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 100, 230, 50));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Pembayaran E-Wallet");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        metodePembayaran.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 230, 50));

        dialogEwallet.setBackground(new java.awt.Color(255, 255, 255));
        dialogEwallet.setPreferredSize(new java.awt.Dimension(337, 303));
        dialogEwallet.setSize(new java.awt.Dimension(337, 330));
        dialogEwallet.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("E-Wallet Pembayaran");
        dialogEwallet.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, 338, -1));

        jPanel7.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        dialogEwallet.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 80));

        saldoTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saldoTxt.setText("jLabel9");
        dialogEwallet.getContentPane().add(saldoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 340, -1));

        hargaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hargaTxt.setText("jLabel9");
        dialogEwallet.getContentPane().add(hargaTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 340, -1));

        btnBayarSekarang.setText("Bayar Sekarang");
        btnBayarSekarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBayarSekarangActionPerformed(evt);
            }
        });
        dialogEwallet.getContentPane().add(btnBayarSekarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 210, 40));

        btnTambah.setText("Tambah Saldo");
        dialogEwallet.getContentPane().add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 210, 40));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setOpaque(false);

        CheckOutTxt.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        CheckOutTxt.setText("Check Out Barang");
        PaneDaftarBarang.setViewportView(CheckOutTxt);

        jListBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jListBarangMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jListBarang);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel4.setText("Nama          : ");

        jLabel5.setText("Harga          :");

        jLabel6.setText("Banyak Beli  :");

        jLabel7.setText("Total Harga :");

        txtBanyak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBanyakActionPerformed(evt);
            }
        });

        jButton1.setText("Terapkan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Total Semua Produk  :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hargaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalHargaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBanyak, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalSemuaProduk)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(namaLabel))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(hargaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBanyak, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(totalHargaProduk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(totalSemuaProduk))
                .addGap(17, 17, 17))
        );

        HapusBarangButton.setBackground(new java.awt.Color(255, 255, 255));
        HapusBarangButton.setText("Hapus Barang");
        HapusBarangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusBarangButtonActionPerformed(evt);
            }
        });

        PembayaranButton.setBackground(new java.awt.Color(255, 153, 153));
        PembayaranButton.setText("Pembayaran");
        PembayaranButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PembayaranButtonActionPerformed(evt);
            }
        });

        PembayaranButton1.setBackground(new java.awt.Color(255, 255, 255));
        PembayaranButton1.setText("Keluar");
        PembayaranButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PembayaranButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(HapusBarangButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PembayaranButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PembayaranButton))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(PaneDaftarBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(PaneDaftarBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(HapusBarangButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PembayaranButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PembayaranButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 620, 360));

        jPanel2.setOpaque(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 620, 110));

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 110, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 110));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NANKATSU");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 180, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FJB KAMPUS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/background_form1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, -1, 568));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setSemuaProdukHarga(){
        Harga = 0;
        for (int i = 0;i < control.listCheckout.size() ; i ++) {
            Harga = Harga + (control.listCheckout.get(i).getHarga() * control.listCheckout.get(i).getBanyakBeli());
        }
        
        totalSemuaProduk.setText(String.valueOf(Harga));
    }
    
    private void jListBarangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListBarangMousePressed
        String setBanyak = String.valueOf(control.listCheckout.get(jListBarang.getSelectedIndex()).getBanyakBeli());
        txtBanyak.setText(setBanyak);
        indexHapus = jListBarang.getSelectedIndex();
        int totalBanyak = Integer.parseInt(setBanyak);
        namaLabel.setText(control.listCheckout.get(jListBarang.getSelectedIndex()).getNamaProduk());
        hargaLabel.setText(String.valueOf(control.listCheckout.get(jListBarang.getSelectedIndex()).getHarga()));
        int totalHarga = control.listCheckout.get(jListBarang.getSelectedIndex()).getHarga() * totalBanyak;
        totalHargaProduk.setText(String.valueOf(totalHarga));
    }//GEN-LAST:event_jListBarangMousePressed

    private void txtBanyakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBanyakActionPerformed
        String setBanyak = String.valueOf(control.listCheckout.get(jListBarang.getSelectedIndex()).getBanyakBeli());
        txtBanyak.setText(setBanyak);
        int totalBanyak = Integer.parseInt(setBanyak);
        int totalHarga = control.listCheckout.get(jListBarang.getSelectedIndex()).getHarga() * totalBanyak;
        totalHargaProduk.setText(String.valueOf(totalHarga));
    }//GEN-LAST:event_txtBanyakActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int totalBanyak = Integer.parseInt(txtBanyak.getText());
        control.listCheckout.get(jListBarang.getSelectedIndex()).setBanyakBeli(totalBanyak);
        int totalHarga = control.listCheckout.get(jListBarang.getSelectedIndex()).getHarga() * totalBanyak;
        setSemuaProdukHarga();
        totalHargaProduk.setText(String.valueOf(totalHarga));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PembayaranButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PembayaranButton1ActionPerformed
        Pembeli_GUI formPembeli = new Pembeli_GUI(alamatLogin,control.listCheckout);
        formPembeli.show();
        dispose();
    }//GEN-LAST:event_PembayaranButton1ActionPerformed

    private void HapusBarangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusBarangButtonActionPerformed
        control.listCheckout.remove(indexHapus);
        ListCheckout.clear();
        setSemuaProdukHarga();
        setList();
    }//GEN-LAST:event_HapusBarangButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        metodePembayaran.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void PembayaranButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PembayaranButtonActionPerformed
        metodePembayaran.setLocationRelativeTo(null);
        metodePembayaran.show();
    }//GEN-LAST:event_PembayaranButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            for (int i = 0; i < control.listCheckout.size();i++){
                control.isiDatabase(i, alamatLogin, control.listCheckout);
            }
            for (int i = 0; i < control.listCheckout.size();i++){
                control.listCheckout.remove(indexHapus);
                ListCheckout.clear();
            }
            setSemuaProdukHarga();jListBarang.setModel(ListCheckout);;
            metodePembayaran.dispose();
        } catch (Exception e){
            control.dialogFormWarning("Data tidak masuk", "Warning");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    public void setHargaTxt(){
        hargaTxt.setText("Kamu akan membayar total harga Rp." +  String.valueOf(Harga));
    }
    
    public void setSaldoTxt(){
        saldoTxt.setText("Saldo Anda : Rp." +  String.valueOf(control.listUser.get(alamatLogin).getSaldo()));
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        setSaldoTxt();
        setHargaTxt();
        dialogEwallet.setLocationRelativeTo(null);
        dialogEwallet.show();
        metodePembayaran.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnBayarSekarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarSekarangActionPerformed
        if (Harga > control.listUser.get(alamatLogin).getSaldo()) {
            control.dialogFormWarning("Maaf Saldo anda tidak cukup untuk melakukan pembelian", "warning");
        } else {
            try {
                for (int i = 0; i < control.listCheckout.size();i++){
                    control.isiDatabase(i, alamatLogin, control.listCheckout);
                }
                for (int i = 0; i < control.listCheckout.size();i++){
                    control.listCheckout.remove(indexHapus);
                    ListCheckout.clear();
                }
                int totalSaldo;
                if (control.listUser.get(alamatLogin).getSaldo() > Harga) {
                    totalSaldo = control.listUser.get(alamatLogin).getSaldo() - Harga;
                } else {
                    totalSaldo = Harga - control.listUser.get(alamatLogin).getSaldo() ;
                }
                DBconn_checkout.updateSaldo(totalSaldo,control.listUser.get(alamatLogin).getNim());
                control.listUser = DBconn_user.GetDataUser();
                setSemuaProdukHarga();
                jListBarang.setModel(ListCheckout);
                
                dialogEwallet.dispose();
            } catch (Exception e){
                control.dialogFormWarning("Data tidak masuk", "Warning");
            }
        }
    }//GEN-LAST:event_btnBayarSekarangActionPerformed

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
            java.util.logging.Logger.getLogger(CheckOut_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOut_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOut_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOut_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOut_GUI(alamatLogin,control.listCheckout).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CheckOutTxt;
    private javax.swing.JButton HapusBarangButton;
    private javax.swing.JScrollPane PaneDaftarBarang;
    private javax.swing.JButton PembayaranButton;
    private javax.swing.JButton PembayaranButton1;
    private javax.swing.JButton btnBayarSekarang;
    private javax.swing.JButton btnTambah;
    private javax.swing.JDialog dialogEwallet;
    private javax.swing.JLabel hargaLabel;
    private javax.swing.JLabel hargaTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jListBarang;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JDialog metodePembayaran;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel saldoTxt;
    private javax.swing.JLabel totalHargaProduk;
    private javax.swing.JLabel totalSemuaProduk;
    private javax.swing.JTextField txtBanyak;
    // End of variables declaration//GEN-END:variables
}
