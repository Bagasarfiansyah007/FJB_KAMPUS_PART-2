
package view;

import Database.DBconnProduct;
import control.ProductControl;
import general.DialogMessage;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class InputProduct extends javax.swing.JFrame {

    public static ProductControl control;
    private static int addresLogin;
    
    public InputProduct(int index) {
        initComponents();
        control = new ProductControl(this);
        addresLogin = index;
        System.out.println(control.listProduct.size());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fjbTxt = new javax.swing.JLabel();
        nankatsuTxt = new javax.swing.JLabel();
        inputTitle = new javax.swing.JLabel();
        nameProductLabel = new javax.swing.JLabel();
        cattegoryLabel = new javax.swing.JLabel();
        stokLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        nameProductTxt = new javax.swing.JTextField();
        comboBoxcattegory = new javax.swing.JComboBox<String>();
        stokTxt = new javax.swing.JTextField();
        priceTxt = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        fjbTxt.setForeground(new java.awt.Color(255, 255, 255));
        fjbTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fjbTxt.setText("FJB Kampus");

        nankatsuTxt.setForeground(new java.awt.Color(255, 255, 255));
        nankatsuTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nankatsuTxt.setText("Nankatsu");

        inputTitle.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        inputTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        inputTitle.setText("Input Produk");

        nameProductLabel.setText("Nama Produk");

        cattegoryLabel.setText("Kategori");

        stokLabel.setText("Stok");

        priceLabel.setText("Harga");

        comboBoxcattegory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Elektronik", "Fashion", "Alat Tulis Kerja", "Hobi", "Perabot Rumah Tangga" }));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nankatsuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(fjbTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 232, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(inputTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameProductLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cattegoryLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stokLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(priceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameProductTxt)
                            .addComponent(comboBoxcattegory, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stokTxt)
                            .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fjbTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(inputTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameProductLabel)
                    .addComponent(nameProductTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cattegoryLabel)
                    .addComponent(comboBoxcattegory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stokLabel)
                    .addComponent(stokTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(backBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(nankatsuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 570));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/background_form1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Main Procedure
    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try {
            control.inputProductData(this,addresLogin);
            ListOfStuff formListProduct = new ListOfStuff(addresLogin);
            formListProduct.show();
            dispose();
        } catch (Exception e) {
            DialogMessage.dialogFormWarning("Tipe data yang dimasukan Salah !", "Tipe data yang dimasukan Salah !");
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new SellerGUI(addresLogin).setVisible(true);
        dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    
    // Getter
    public String getComCategory() {
        return comboBoxcattegory.getSelectedItem().toString();
    }

    public String getTxtPrice() {
        return priceTxt.getText();
    }

    public String getTxtNameProduct() {
        return nameProductTxt.getText();
    }

    public String getTxtStok() {
        return stokTxt.getText();
    }
    

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputProduct(addresLogin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cattegoryLabel;
    private javax.swing.JComboBox<String> comboBoxcattegory;
    private javax.swing.JLabel fjbTxt;
    private javax.swing.JLabel inputTitle;
    private javax.swing.JPanel jPanel1;
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
