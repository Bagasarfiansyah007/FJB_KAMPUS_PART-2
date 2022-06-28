/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.CheckoutModel;
import control.BuyerControl;
import control.ProductControl;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static view.InputProduct.control;

/**
 *
 * @author USER
 */
public class BuyerGUI extends javax.swing.JFrame {

    public DefaultTableModel modelTable = new DefaultTableModel();
    ProductControl control;
    static BuyerControl <BuyerGUI> controlPayment;
    private static int addresLogin;
    private int selectProdukIndex;

    public BuyerGUI(int index, List<CheckoutModel> listInput) {
        initComponents();
        control = new ProductControl(this);
        controlPayment = new BuyerControl(this);

        setNameColumnTable();
        addresLogin = index;
        control.getDataProduct(this);

        if (listInput != null) {
            controlPayment.listCheckout = listInput;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogTroli = new javax.swing.JDialog();
        panelTroli = new javax.swing.JPanel();
        labelTitel = new javax.swing.JLabel();
        btnNoTroli = new javax.swing.JButton();
        btnYesTroli = new javax.swing.JButton();
        dialogConfirm = new javax.swing.JDialog();
        panelConfirm = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        yesBtn = new javax.swing.JButton();
        noBtn = new javax.swing.JButton();
        panelListStuff = new javax.swing.JPanel();
        buyButton = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        tableProduk = new javax.swing.JTable();
        addTroliButton = new javax.swing.JButton();
        historyButton = new javax.swing.JButton();
        panelGuide = new javax.swing.JPanel();
        troli = new javax.swing.JButton();
        updateAccountButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        searchProductField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        paneListProduct = new javax.swing.JScrollPane();
        listProductField = new javax.swing.JLabel();
        comboKategori = new javax.swing.JComboBox();
        nankatsuTxt = new javax.swing.JLabel();
        fjbTxt = new javax.swing.JLabel();
        backgroud = new javax.swing.JLabel();

        dialogTroli.setSize(new java.awt.Dimension(348, 223));

        panelTroli.setBackground(new java.awt.Color(255, 255, 255));

        labelTitel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitel.setText("jLabel5");

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

        javax.swing.GroupLayout panelTroliLayout = new javax.swing.GroupLayout(panelTroli);
        panelTroli.setLayout(panelTroliLayout);
        panelTroliLayout.setHorizontalGroup(
            panelTroliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelTitel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelTroliLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(btnYesTroli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNoTroli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(96, 96, 96))
        );
        panelTroliLayout.setVerticalGroup(
            panelTroliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTroliLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(labelTitel)
                .addGap(41, 41, 41)
                .addGroup(panelTroliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNoTroli)
                    .addComponent(btnYesTroli))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogTroliLayout = new javax.swing.GroupLayout(dialogTroli.getContentPane());
        dialogTroli.getContentPane().setLayout(dialogTroliLayout);
        dialogTroliLayout.setHorizontalGroup(
            dialogTroliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTroli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogTroliLayout.setVerticalGroup(
            dialogTroliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTroli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        dialogConfirm.setSize(new java.awt.Dimension(342, 216));

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

        javax.swing.GroupLayout panelConfirmLayout = new javax.swing.GroupLayout(panelConfirm);
        panelConfirm.setLayout(panelConfirmLayout);
        panelConfirmLayout.setHorizontalGroup(
            panelConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
            .addGroup(panelConfirmLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(yesBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(noBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelConfirmLayout.setVerticalGroup(
            panelConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConfirmLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesBtn)
                    .addComponent(noBtn))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogConfirmLayout = new javax.swing.GroupLayout(dialogConfirm.getContentPane());
        dialogConfirm.getContentPane().setLayout(dialogConfirmLayout);
        dialogConfirmLayout.setHorizontalGroup(
            dialogConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        dialogConfirmLayout.setVerticalGroup(
            dialogConfirmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelListStuff.setBackground(new java.awt.Color(255, 255, 255));

        buyButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        buyButton.setText("Beli");

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
        scrollPane.setViewportView(tableProduk);

        addTroliButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        addTroliButton.setText("Tambah ke troli");
        addTroliButton.setEnabled(false);
        addTroliButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTroliButtonActionPerformed(evt);
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
                        .addComponent(addTroliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelListStuffLayout.setVerticalGroup(
            panelListStuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListStuffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(panelListStuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addTroliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historyButton))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        getContentPane().add(panelListStuff, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 600, 310));

        panelGuide.setOpaque(false);

        troli.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        troli.setText("Troli");
        troli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                troliActionPerformed(evt);
            }
        });

        updateAccountButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        updateAccountButton.setText("Update Profil");

        logOutButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        logOutButton.setText("Keluar");
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        searchProductField.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N

        searchButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        listProductField.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        listProductField.setText("Daftar Barang");
        paneListProduct.setViewportView(listProductField);

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
                        .addComponent(paneListProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchProductField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGuideLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(troli, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGuideLayout.createSequentialGroup()
                        .addComponent(updateAccountButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(logOutButton))
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
                    .addComponent(troli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateAccountButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(panelGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelGuideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchProductField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboKategori, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addComponent(paneListProduct))
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
        String nama = searchProductField.getText();

        if (nama.isEmpty()) {
            control.getDataProduct(this);
        } else {
            control.searchProduct(this, nama);
            searchProductField.setText("");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        dialogConfirm.setLocationRelativeTo(null);
        dialogConfirm.show();
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void troliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_troliActionPerformed
        CheckOutGUI formCheckout = new CheckOutGUI(addresLogin, controlPayment.listCheckout);
        formCheckout.show();
        dispose();
    }//GEN-LAST:event_troliActionPerformed

    private void comboKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboKategoriActionPerformed
        String nama = comboKategori.getSelectedItem().toString();
        if (nama.isEmpty()) {
            control.getDataProduct(this);
        } else {
            control.searchProductCategory(this, nama);
        }
    }//GEN-LAST:event_comboKategoriActionPerformed

    private void yesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBtnActionPerformed
        MenuLogin formLogin = new MenuLogin(addresLogin + 1);
        formLogin.show();
        dialogConfirm.dispose();
        dispose();
    }//GEN-LAST:event_yesBtnActionPerformed

    private void noBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noBtnActionPerformed
        dialogConfirm.dispose();
    }//GEN-LAST:event_noBtnActionPerformed

    private void addTroliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTroliButtonActionPerformed
        dialogTroli.setLocationRelativeTo(null);
        dialogTroli.show();
        labelTitel.setText("ingin Menambahkan " + controlPayment.listProduk.get(selectProdukIndex).getProducrName()+ " ?");
    }//GEN-LAST:event_addTroliButtonActionPerformed

    private void tableProdukMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdukMousePressed
        selectProdukIndex = controlPayment.findeIndexProduct(tableProduk.getValueAt(tableProduk.getSelectedRow(), 0).toString());
        addTroliButton.setEnabled(true);
    }//GEN-LAST:event_tableProdukMousePressed

    private void btnYesTroliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesTroliActionPerformed
        controlPayment.inserListCheckout(selectProdukIndex, addresLogin);
        for (int i = 0 ; i < controlPayment.listCheckout.size(); i++) {
            System.out.println(controlPayment.listCheckout.get(i).getIdPayment());
        }
        dialogTroli.dispose();
    }//GEN-LAST:event_btnYesTroliActionPerformed

    private void btnNoTroliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoTroliActionPerformed
        dialogTroli.dispose();
    }//GEN-LAST:event_btnNoTroliActionPerformed

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
        HistoryGUI history = new HistoryGUI(addresLogin,controlPayment.listCheckout);
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
                new BuyerGUI(addresLogin, controlPayment.listCheckout).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addTroliButton;
    private javax.swing.JLabel backgroud;
    private javax.swing.JButton btnNoTroli;
    private javax.swing.JButton btnYesTroli;
    private javax.swing.JButton buyButton;
    private javax.swing.JComboBox comboKategori;
    private javax.swing.JDialog dialogConfirm;
    private javax.swing.JDialog dialogTroli;
    private javax.swing.JLabel fjbTxt;
    private javax.swing.JButton historyButton;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labelTitel;
    private javax.swing.JLabel listProductField;
    private javax.swing.JButton logOutButton;
    private javax.swing.JLabel nankatsuTxt;
    private javax.swing.JButton noBtn;
    private javax.swing.JScrollPane paneListProduct;
    private javax.swing.JPanel panelConfirm;
    private javax.swing.JPanel panelGuide;
    private javax.swing.JPanel panelListStuff;
    private javax.swing.JPanel panelTroli;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchProductField;
    private javax.swing.JTable tableProduk;
    private javax.swing.JButton troli;
    private javax.swing.JButton updateAccountButton;
    private javax.swing.JButton yesBtn;
    // End of variables declaration//GEN-END:variables
}
