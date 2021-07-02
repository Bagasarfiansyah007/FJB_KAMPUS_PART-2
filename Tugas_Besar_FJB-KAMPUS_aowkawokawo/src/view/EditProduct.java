
package view;

import Database.DBconnProduct;
import control.ProductControl;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class EditProduct extends javax.swing.JFrame {

    public static ProductControl <EditProduct> control;
    private static int addresLogin;
    private static int addresList;
    
    public EditProduct(int alamat,int addresListIndex) {
        initComponents();
        control = new ProductControl(this);
        addresLogin = alamat;
        addresList = addresListIndex-1;
        String name = control.listProduct.get(addresList).getProducrName();
        String price = String.valueOf(control.listProduct.get(addresList).getPrice());
        String stok = String.valueOf(control.listProduct.get(addresList).getStok());
        setTextField(name,price,stok);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editProductPane = new javax.swing.JPanel();
        fjbTxt = new javax.swing.JLabel();
        nankatsuTxt = new javax.swing.JLabel();
        editTitle = new javax.swing.JLabel();
        nameProductLabel = new javax.swing.JLabel();
        categoryLabel = new javax.swing.JLabel();
        stokLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        nameProductTxt = new javax.swing.JTextField();
        comCategory = new javax.swing.JComboBox<String>();
        stokTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
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

        nameProductLabel.setText("Nama Produk");

        categoryLabel.setText("Kategori");

        stokLabel.setText("Stok");

        priceLabel.setText("Harga");

        comCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elektronik", "Fashion", "Alat Tulis Kerja", "Hobi", "Perabot Rumah Tangga" }));

        saveBtn.setText("Simpan");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        backBtn.setText("Kembali");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
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
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(nameProductLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(categoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stokLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameProductTxt)
                            .addComponent(comCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stokTxt)
                            .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addComponent(nameProductLabel)
                    .addComponent(nameProductTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoryLabel)
                    .addComponent(comCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stokLabel)
                    .addComponent(stokTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(editProductPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(backBtn))
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

    
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try {
            control.editDataProduct(this,addresList);
            ListOfStuff formDaftar = new ListOfStuff(addresLogin);
            formDaftar.show();
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tipe data yang dimasukan Salah !",
                    "warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new SellerGUI(addresLogin).setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    
    // Setter
    public void setTextField(String name,String price,String stok){
        priceTxt.setText(price);
        nameProductTxt.setText(name);
        stokTxt.setText(stok);
    }
    
    
    
   
    // Getter
    public String getComKategori() {
        return comCategory.getSelectedItem().toString();
    }

    public String getTxtHarga() {
        return priceTxt.getText();
    }

    public String getTxtNamaProduk() {
        return nameProductTxt.getText();
    }

    public String getTxtStok() {
        return stokTxt.getText();
    }
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditProduct(addresLogin,addresList).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backgroud;
    private javax.swing.JLabel categoryLabel;
    private javax.swing.JComboBox<String> comCategory;
    private javax.swing.JPanel editProductPane;
    private javax.swing.JLabel editTitle;
    private javax.swing.JLabel fjbTxt;
    private javax.swing.JLabel nameProductLabel;
    private javax.swing.JTextField nameProductTxt;
    private javax.swing.JLabel nankatsuTxt;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel stokLabel;
    private javax.swing.JTextField stokTxt;
    // End of variables declaration//GEN-END:variables
}
