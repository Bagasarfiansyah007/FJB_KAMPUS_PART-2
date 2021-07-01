
package view;

import Database.DBconnProduct;
import control.ProductControl;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class EditProduct extends javax.swing.JFrame {

    public static ProductControl <EditProduct> control;
    private static int alamatLogin;
    private static int alamatList;
    
    public EditProduct(int alamat,int alamatListIndex) {
        initComponents();
        control = new ProductControl(this);
        alamatLogin = alamat;
        alamatList = alamatListIndex-1;
        String nama = control.listProduk.get(alamatList).getNama();
        String harga = String.valueOf(control.listProduk.get(alamatList).getHarga());
        String stok = String.valueOf(control.listProduk.get(alamatList).getStok());
        setTextField(nama,harga,stok);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editProductPane = new javax.swing.JPanel();
        fjbTxt = new javax.swing.JLabel();
        nankatsuTxt = new javax.swing.JLabel();
        editTitle = new javax.swing.JLabel();
        namaPrdukTxt = new javax.swing.JLabel();
        kategoriTxt = new javax.swing.JLabel();
        stokTxt = new javax.swing.JLabel();
        hargaTxt = new javax.swing.JLabel();
        fieldNamaProduk = new javax.swing.JTextField();
        comKategori = new javax.swing.JComboBox<>();
        fieldStok = new javax.swing.JTextField();
        fieldHarga = new javax.swing.JTextField();
        buttonSimpan = new javax.swing.JButton();
        buttonKembali = new javax.swing.JButton();
        backgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        editProductPane.setOpaque(false);

        fjbTxt.setForeground(new java.awt.Color(255, 255, 255));
        fjbTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fjbTxt.setText("FJB Kampus");

        nankatsuTxt.setForeground(new java.awt.Color(255, 255, 255));
        nankatsuTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nankatsuTxt.setText("Nankatsu");

        editTitle.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        editTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editTitle.setText("Edit Produk");

        namaPrdukTxt.setText("Nama Produk");

        kategoriTxt.setText("Kategori");

        stokTxt.setText("Stok");

        hargaTxt.setText("Harga");

        comKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elektronik", "Fashion", "Alat Tulis Kerja", "Hobi", "Perabot Rumah Tangga" }));

        buttonSimpan.setText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonKembali.setText("Kembali");
        buttonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editProductPaneLayout = new javax.swing.GroupLayout(editProductPane);
        editProductPane.setLayout(editProductPaneLayout);
        editProductPaneLayout.setHorizontalGroup(
            editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editProductPaneLayout.createSequentialGroup()
                .addGroup(editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editProductPaneLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nankatsuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editProductPaneLayout.createSequentialGroup()
                        .addGroup(editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(editProductPaneLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(fjbTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(editProductPaneLayout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(buttonSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 232, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(editProductPaneLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editProductPaneLayout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(editTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(editProductPaneLayout.createSequentialGroup()
                        .addGroup(editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaPrdukTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kategoriTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stokTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(hargaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(fieldNamaProduk)
                            .addComponent(comKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldStok)
                            .addComponent(fieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editProductPaneLayout.setVerticalGroup(
            editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editProductPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fjbTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(editTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaPrdukTxt)
                    .addComponent(fieldNamaProduk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kategoriTxt)
                    .addComponent(comKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stokTxt)
                    .addComponent(fieldStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hargaTxt)
                    .addComponent(fieldHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSimpan)
                    .addComponent(buttonKembali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(nankatsuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(editProductPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 570));

        backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/background_form1.png"))); // NOI18N
        getContentPane().add(backgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSimpanActionPerformed
        try {
            control.EditDataBarang(this,alamatList);
            ListOfStuff formDaftar = new ListOfStuff(alamatLogin);
            formDaftar.show();
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tipe data yang dimasukan Salah !",
                    "warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonSimpanActionPerformed

    private void buttonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembaliActionPerformed
        new SellerGUI(alamatLogin).setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonKembaliActionPerformed

    
    // Setter
    public void setTextField(String nama,String harga,String stok){
        fieldHarga.setText(harga);
        fieldNamaProduk.setText(nama);
        fieldStok.setText(stok);
    }
    
    
    
   
    // Getter
    public String getComKategori() {
        return comKategori.getSelectedItem().toString();
    }

    public String getTxtHarga() {
        return fieldHarga.getText();
    }

    public String getTxtNamaProduk() {
        return fieldNamaProduk.getText();
    }

    public String getTxtStok() {
        return fieldStok.getText();
    }
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProduct(alamatLogin,alamatList).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroud;
    private javax.swing.JButton buttonKembali;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JComboBox<String> comKategori;
    private javax.swing.JPanel editProductPane;
    private javax.swing.JLabel editTitle;
    private javax.swing.JTextField fieldHarga;
    private javax.swing.JTextField fieldNamaProduk;
    private javax.swing.JTextField fieldStok;
    private javax.swing.JLabel fjbTxt;
    private javax.swing.JLabel hargaTxt;
    private javax.swing.JLabel kategoriTxt;
    private javax.swing.JLabel namaPrdukTxt;
    private javax.swing.JLabel nankatsuTxt;
    private javax.swing.JLabel stokTxt;
    // End of variables declaration//GEN-END:variables
}
