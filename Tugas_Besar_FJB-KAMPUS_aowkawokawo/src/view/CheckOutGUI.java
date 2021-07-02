/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Database.DBconnCheckOut;
import Database.DBconnUser;
import Model.CheckoutModel;
import control.BuyerControl;
import control.ProductControl;
import general.DialogMessage;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.SpinnerNumberModel;
import static view.BuyerGUI.controlPayment;

public class CheckOutGUI extends javax.swing.JFrame {

    // Atribut
    private static int addresLogin;
    static BuyerControl <CheckOutGUI> control;
    private int indexDelete;
    DefaultListModel<String> ListCheckout =new DefaultListModel<String>();
    private int price;
    
    // Constructor
    public CheckOutGUI(int index,List <CheckoutModel> listInput) {
        initComponents();
        addresLogin = index;
        control = new BuyerControl(this);
        control.listCheckout = listInput;
        setList();
        setAllProductPrice();
        if (control.listCheckout.size() != 0) {
            setTextDetail();
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        metodePembayaran = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        canelBtn = new javax.swing.JButton();
        bankBtn = new javax.swing.JButton();
        ewalletBtn = new javax.swing.JButton();
        dialogEwallet = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        saldoTxt = new javax.swing.JLabel();
        hargaTxt = new javax.swing.JLabel();
        btnBayarSekarang = new javax.swing.JButton();
        btnPerbarui = new javax.swing.JButton();
        btnTambah1 = new javax.swing.JButton();
        tambahSaldo = new javax.swing.JDialog();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtTambahSaldo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        saldoSekarang = new javax.swing.JLabel();
        increasBtn = new javax.swing.JButton();
        paneCheckOut = new javax.swing.JPanel();
        paneDaftarBarang = new javax.swing.JScrollPane();
        checkOutTxt = new javax.swing.JLabel();
        stuffScrollPane = new javax.swing.JScrollPane();
        jListBarang = new javax.swing.JList<String>();
        stuffPanel = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        totalProdukBuyLabel = new javax.swing.JLabel();
        totalPriceLabel = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        totalPriceProduct = new javax.swing.JLabel();
        priceValueLabel = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        totalAllProductPriceLabel = new javax.swing.JLabel();
        totalAllProductPriceValueLabel = new javax.swing.JLabel();
        deleteProductBtn = new javax.swing.JButton();
        paymentBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        nankatsuTxt = new javax.swing.JLabel();
        fjbTxt = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

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

        canelBtn.setBackground(new java.awt.Color(255, 102, 102));
        canelBtn.setText("Cancel");
        canelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canelBtnActionPerformed(evt);
            }
        });
        metodePembayaran.getContentPane().add(canelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 230, 50));

        bankBtn.setBackground(new java.awt.Color(255, 255, 255));
        bankBtn.setText("Pembayaran Rekening");
        bankBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankBtnActionPerformed(evt);
            }
        });
        metodePembayaran.getContentPane().add(bankBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 100, 230, 50));

        ewalletBtn.setBackground(new java.awt.Color(255, 255, 255));
        ewalletBtn.setText("Pembayaran E-Wallet");
        ewalletBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ewalletBtnActionPerformed(evt);
            }
        });
        metodePembayaran.getContentPane().add(ewalletBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 230, 50));

        dialogEwallet.setBackground(new java.awt.Color(255, 255, 255));
        dialogEwallet.setSize(new java.awt.Dimension(337, 374));
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
        dialogEwallet.getContentPane().add(btnBayarSekarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 210, 40));

        btnPerbarui.setText("Perbarui Saldo");
        btnPerbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerbaruiActionPerformed(evt);
            }
        });
        dialogEwallet.getContentPane().add(btnPerbarui, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 210, 40));

        btnTambah1.setText("Tambah Saldo");
        btnTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah1ActionPerformed(evt);
            }
        });
        dialogEwallet.getContentPane().add(btnTambah1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 210, 40));

        tambahSaldo.setSize(new java.awt.Dimension(339, 278));
        tambahSaldo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Tambah Saldo E-wallet");
        tambahSaldo.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 26, 338, -1));

        jPanel8.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        tambahSaldo.getContentPane().add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 80));
        tambahSaldo.getContentPane().add(txtTambahSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 190, 40));

        jLabel9.setText("Tambah Saldo");
        tambahSaldo.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        saldoSekarang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saldoSekarang.setText("jLabel13");
        tambahSaldo.getContentPane().add(saldoSekarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 340, -1));

        increasBtn.setText("Tambah saldo");
        increasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                increasBtnActionPerformed(evt);
            }
        });
        tambahSaldo.getContentPane().add(increasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 290, 40));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paneCheckOut.setOpaque(false);

        checkOutTxt.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        checkOutTxt.setText("Check Out Barang");
        paneDaftarBarang.setViewportView(checkOutTxt);

        jListBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jListBarangMousePressed(evt);
            }
        });
        stuffScrollPane.setViewportView(jListBarang);

        stuffPanel.setBackground(new java.awt.Color(255, 255, 255));
        stuffPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        nameLabel.setText("Nama          : ");

        priceLabel.setText("Harga          :");

        totalProdukBuyLabel.setText("Banyak Beli  :");

        totalPriceLabel.setText("Total Harga :");

        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        submitBtn.setText("Terapkan");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        totalAllProductPriceLabel.setText("Total Semua Produk  :");

        javax.swing.GroupLayout stuffPanelLayout = new javax.swing.GroupLayout(stuffPanel);
        stuffPanel.setLayout(stuffPanelLayout);
        stuffPanelLayout.setHorizontalGroup(
            stuffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stuffPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(stuffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(stuffPanelLayout.createSequentialGroup()
                        .addGroup(stuffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(priceLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(stuffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(priceValueLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(namaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stuffPanelLayout.createSequentialGroup()
                        .addComponent(totalPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalPriceProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(stuffPanelLayout.createSequentialGroup()
                        .addGroup(stuffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(stuffPanelLayout.createSequentialGroup()
                                .addComponent(totalProdukBuyLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(stuffPanelLayout.createSequentialGroup()
                                .addComponent(totalAllProductPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalAllProductPriceValueLabel)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        stuffPanelLayout.setVerticalGroup(
            stuffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(stuffPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(stuffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(namaLabel))
                .addGap(12, 12, 12)
                .addGroup(stuffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceValueLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(stuffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalProdukBuyLabel)
                    .addComponent(submitBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(stuffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalPriceLabel)
                    .addComponent(totalPriceProduct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(stuffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalAllProductPriceLabel)
                    .addComponent(totalAllProductPriceValueLabel))
                .addGap(17, 17, 17))
        );

        deleteProductBtn.setBackground(new java.awt.Color(255, 255, 255));
        deleteProductBtn.setText("Hapus Barang");
        deleteProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteProductBtnActionPerformed(evt);
            }
        });

        paymentBtn.setBackground(new java.awt.Color(255, 153, 153));
        paymentBtn.setText("Pembayaran");
        paymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentBtnActionPerformed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Keluar");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneCheckOutLayout = new javax.swing.GroupLayout(paneCheckOut);
        paneCheckOut.setLayout(paneCheckOutLayout);
        paneCheckOutLayout.setHorizontalGroup(
            paneCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCheckOutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paneCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneCheckOutLayout.createSequentialGroup()
                        .addComponent(deleteProductBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(paymentBtn))
                    .addGroup(paneCheckOutLayout.createSequentialGroup()
                        .addComponent(paneDaftarBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(paneCheckOutLayout.createSequentialGroup()
                        .addComponent(stuffScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stuffPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        paneCheckOutLayout.setVerticalGroup(
            paneCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCheckOutLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(paneDaftarBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stuffPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(stuffScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paneCheckOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        getContentPane().add(paneCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 620, 360));

        nankatsuTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nankatsuTxt.setForeground(new java.awt.Color(255, 255, 255));
        nankatsuTxt.setText("NANKATSU");
        getContentPane().add(nankatsuTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 540, 180, 30));

        fjbTxt.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        fjbTxt.setForeground(new java.awt.Color(255, 255, 255));
        fjbTxt.setText("FJB KAMPUS");
        getContentPane().add(fjbTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/background_form1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, -1, 568));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    // Main Procedure
    private void jListBarangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListBarangMousePressed
        setTitelPreviewCheckout();
    }//GEN-LAST:event_jListBarangMousePressed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        setTitelPreviewPriceProduct();
    }//GEN-LAST:event_txtTotalActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
       try {
           setTitelPreviewPriceAllProduct();
       } catch (Exception e) {
           DialogMessage.dialogFormWarning("Kesalahan input", "warning");
       }
        
    }//GEN-LAST:event_submitBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        BuyerGUI formPembeli = new BuyerGUI(addresLogin,control.listCheckout);
        formPembeli.show();
        dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void deleteProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteProductBtnActionPerformed
        setRefreshDataAfterDelete();
    }//GEN-LAST:event_deleteProductBtnActionPerformed

    private void canelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canelBtnActionPerformed
        metodePembayaran.dispose();
    }//GEN-LAST:event_canelBtnActionPerformed

    private void paymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentBtnActionPerformed
        metodePembayaran.setLocationRelativeTo(null);
        metodePembayaran.show();
    }//GEN-LAST:event_paymentBtnActionPerformed

    private void bankBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankBtnActionPerformed
        try {
            for (int i = 0; i < control.listCheckout.size();i++){
                control.insertDatabase(i, addresLogin, control.listCheckout);
            }
            for (int i = 0; i < control.listCheckout.size();i++){
                control.listCheckout.remove(indexDelete);
                ListCheckout.clear();
            }
            setAllProductPrice();jListBarang.setModel(ListCheckout);;
            metodePembayaran.dispose();
        } catch (Exception e){
            DialogMessage.dialogFormWarning("Data tidak masuk", "Warning");
        }
    }//GEN-LAST:event_bankBtnActionPerformed

    private void ewalletBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ewalletBtnActionPerformed
        setSaldoTxt();
        setPriceTxt();
        dialogEwallet.setLocationRelativeTo(null);
        dialogEwallet.show();
        metodePembayaran.dispose();
    }//GEN-LAST:event_ewalletBtnActionPerformed

    private void btnBayarSekarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBayarSekarangActionPerformed
        if (price > getSaldo()) {
            DialogMessage.dialogFormWarning("Maaf Saldo anda tidak cukup untuk melakukan pembelian", "warning");
        } else {
            try {
                
                inputHistoryPayment();
                clearListCheckout();
                int totalSaldo = 0;
                setTotalSaldo(totalSaldo);
                dialogEwallet.dispose();
                
            } catch (Exception e){
                DialogMessage.dialogFormWarning("Data tidak masuk", "Warning");
            }
        }
    }//GEN-LAST:event_btnBayarSekarangActionPerformed

    private void increasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_increasBtnActionPerformed
       try {
           setNewSaldo();
       } catch (Exception e) {
           DialogMessage.dialogFormWarning("Kesalahan input", "warning");
       }
           
    }//GEN-LAST:event_increasBtnActionPerformed

    private void btnPerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerbaruiActionPerformed
        setSaldoTxt();
    }//GEN-LAST:event_btnPerbaruiActionPerformed

    private void btnTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah1ActionPerformed
        tambahSaldo.setLocationRelativeTo(null);
        setTxtSaldoDialog();
        tambahSaldo.show();
        dialogEwallet.hide();
    }//GEN-LAST:event_btnTambah1ActionPerformed


    
    // Procedur 
    public void inputHistoryPayment(){
        for (int i = 0; i < getSizeList();i++){
            control.insertDatabase(i, addresLogin, control.listCheckout);
        }
    }
    
    public void clearListCheckout(){
        for (int i = 0; i < getSizeList();i++){
            control.listCheckout.remove(indexDelete);
            ListCheckout.clear();
        }
    }
    
    
    
    // Setter
    public void setList(){
        for (int i = 0; i < control.listCheckout.size();i++){
            ListCheckout.addElement(control.listCheckout.get(i).getNameProduct());
            jListBarang.setModel(ListCheckout);
        }
    }
    
    public void setAllProductPrice(){
        price = 0;
        for (int i = 0;i < control.listCheckout.size() ; i ++) {
            price = price + (control.listCheckout.get(i).getPrice() 
                             * control.listCheckout.get(i).getTotalProductBuy());
        }
        
        totalAllProductPriceValueLabel.setText(String.valueOf(price));
    }
    
    public void setTextDetail(){
        String setTotalProduct = String.valueOf(control.listCheckout.get(0).getTotalProductBuy());
        txtTotal.setText(setTotalProduct);
        namaLabel.setText(control.listCheckout.get(0).getNameProduct());
        priceValueLabel.setText(String.valueOf(control.listCheckout.get(0).getPrice()));
    }
    
    public void setPriceTxt(){
        hargaTxt.setText("Kamu akan membayar total harga Rp." +  String.valueOf(price));
    }
    
    public void setSaldoTxt(){
        saldoTxt.setText("Saldo Anda : Rp." +  String.valueOf(control.listUser.get(addresLogin).getSaldo()));
    }
    
    public void setTxtSaldoDialog (){
        saldoSekarang.setText("Saldo Anda : Rp." +  String.valueOf(control.listUser.get(addresLogin).getSaldo()));
    }
    
    public void setTitelPreviewCheckout(){
        String setTotalProduct = String.valueOf(control.listCheckout.get(jListBarang.getSelectedIndex()).getTotalProductBuy());
        txtTotal.setText(setTotalProduct);
        indexDelete = jListBarang.getSelectedIndex();
        int totalProduct = Integer.parseInt(setTotalProduct);
        namaLabel.setText(control.listCheckout.get(jListBarang.getSelectedIndex()).getNameProduct());
        priceValueLabel.setText(String.valueOf(control.listCheckout.get(jListBarang.getSelectedIndex()).getPrice()));
        int totalprice = control.listCheckout.get(jListBarang.getSelectedIndex()).getPrice()* totalProduct;
        totalPriceProduct.setText(String.valueOf(totalprice));
    }
    
    public void setTitelPreviewPriceProduct(){
        String setTotalProduct = String.valueOf(control.listCheckout.get(jListBarang.getSelectedIndex()).getTotalProductBuy());
        txtTotal.setText(setTotalProduct);
        int totalProduct = Integer.parseInt(setTotalProduct);
        int totalprice = control.listCheckout.get(jListBarang.getSelectedIndex()).getPrice()* totalProduct;
        totalPriceProduct.setText(String.valueOf(totalprice));
    }
    
    public void setTitelPreviewPriceAllProduct(){
        int allStockOnDatabase = control.listProduk.get(jListBarang.getSelectedIndex()).getStok();
        int totalProduct = Integer.parseInt(txtTotal.getText());
        System.out.println(totalProduct);
        
        if (totalProduct >= allStockOnDatabase){
            control.listCheckout.get(jListBarang.getSelectedIndex()).setTotalProductBuy(totalProduct);
            int totalprice = control.listCheckout.get(jListBarang.getSelectedIndex()).getPrice()* totalProduct;
            setAllProductPrice();
            totalPriceProduct.setText(String.valueOf(totalprice));
        } else {
            DialogMessage.dialogFormWarning("Stok Produk Melebihi kapasitas !", "warning");
        }
    }
    
    public void setRefreshDataAfterDelete(){
        control.listCheckout.remove(indexDelete);
        ListCheckout.clear();
        setAllProductPrice();
        setList();
    }
    
    public void setTotalSaldo(int totalSaldo){
        if (control.listUser.get(addresLogin).getSaldo() > price) {
            totalSaldo = control.listUser.get(addresLogin).getSaldo() - price;
        } else {
            totalSaldo = price - control.listUser.get(addresLogin).getSaldo() ;
        }
        DBconnCheckOut.updateSaldo(totalSaldo,control.listUser.get(addresLogin).getNim());
        control.listUser = DBconnUser.getDataUser();
        setAllProductPrice();
        jListBarang.setModel(ListCheckout);
    }
    
    public void setNewSaldo(){
        int saldoIncrease = Integer.parseInt(txtTambahSaldo.getText());
        int saldoTotal = control.listUser.get(addresLogin).getSaldo() + saldoIncrease;
        DBconnCheckOut.updateSaldo(saldoTotal,control.listUser.get(addresLogin).getNim());
        control.listUser = DBconnUser.getDataUser();
        DialogMessage.dialogFormSucsess("Saldo berhasil ditambahkan menjadi " + String.valueOf(saldoTotal), "suksess");
        tambahSaldo.dispose();
        dialogEwallet.show();
    }
    
    
    
    // Getter
    public int getSaldo(){
        return control.listUser.get(addresLogin).getSaldo();
    }
    
    public int getSizeList(){
        return control.listCheckout.size();
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
            java.util.logging.Logger.getLogger(CheckOutGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckOutGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckOutGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckOutGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckOutGUI(addresLogin,control.listCheckout).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton bankBtn;
    private javax.swing.JButton btnBayarSekarang;
    private javax.swing.JButton btnPerbarui;
    private javax.swing.JButton btnTambah1;
    private javax.swing.JButton canelBtn;
    private javax.swing.JLabel checkOutTxt;
    private javax.swing.JButton deleteProductBtn;
    private javax.swing.JDialog dialogEwallet;
    private javax.swing.JButton ewalletBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel fjbTxt;
    private javax.swing.JLabel hargaTxt;
    private javax.swing.JButton increasBtn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListBarang;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JDialog metodePembayaran;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nankatsuTxt;
    private javax.swing.JPanel paneCheckOut;
    private javax.swing.JScrollPane paneDaftarBarang;
    private javax.swing.JButton paymentBtn;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JLabel priceValueLabel;
    private javax.swing.JLabel saldoSekarang;
    private javax.swing.JLabel saldoTxt;
    private javax.swing.JPanel stuffPanel;
    private javax.swing.JScrollPane stuffScrollPane;
    private javax.swing.JButton submitBtn;
    private javax.swing.JDialog tambahSaldo;
    private javax.swing.JLabel totalAllProductPriceLabel;
    private javax.swing.JLabel totalAllProductPriceValueLabel;
    private javax.swing.JLabel totalPriceLabel;
    private javax.swing.JLabel totalPriceProduct;
    private javax.swing.JLabel totalProdukBuyLabel;
    private javax.swing.JTextField txtTambahSaldo;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
