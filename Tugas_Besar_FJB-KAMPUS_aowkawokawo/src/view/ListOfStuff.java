
package view;

import Database.DBconnProduct;
import control.LoginControl;
import control.ProductControl;
import control.RegistrasiControl;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static view.LogInAkunGUI.control;
import static view.RegisterGUI.control;

public class ListOfStuff extends javax.swing.JFrame {
    
    // Atribut
    public DefaultTableModel modelTable = new DefaultTableModel();
    ProductControl control;

    private static int alamatLogin;
    
    // Contructor
    public ListOfStuff(int index) {
        initComponents();
        control = new ProductControl(this);
        alamatLogin = index;
        setNameColumnTable();
        control.GetDataProduk(this,alamatLogin);
        System.out.println(alamatLogin);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogShow = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnYes = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();
        panelStuff = new javax.swing.JPanel();
        fjbTxt = new javax.swing.JLabel();
        nankatsuTxt = new javax.swing.JLabel();
        daftararangTitle = new javax.swing.JLabel();
        tableScrollPane = new javax.swing.JScrollPane();
        tableProduk = new javax.swing.JTable();
        buttonTambah = new javax.swing.JButton();
        buttonEdit = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonKembali = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        dialogShow.setSize(new java.awt.Dimension(357, 202));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Apakah kamu yakin ingin menghapus data ?");

        btnYes.setText("Yes");
        btnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYesActionPerformed(evt);
            }
        });

        btnNo.setText("No");
        btnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnYes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNo)
                .addGap(104, 104, 104))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel5)
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnYes)
                    .addComponent(btnNo))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dialogShowLayout = new javax.swing.GroupLayout(dialogShow.getContentPane());
        dialogShow.getContentPane().setLayout(dialogShowLayout);
        dialogShowLayout.setHorizontalGroup(
            dialogShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dialogShowLayout.setVerticalGroup(
            dialogShowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelStuff.setOpaque(false);

        fjbTxt.setForeground(new java.awt.Color(255, 255, 255));
        fjbTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fjbTxt.setText("FJB Kampus");

        nankatsuTxt.setForeground(new java.awt.Color(255, 255, 255));
        nankatsuTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nankatsuTxt.setText("Nankatsu");

        daftararangTitle.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        daftararangTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        daftararangTitle.setText("Daftar Barang");

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
        tableScrollPane.setViewportView(tableProduk);

        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonEdit.setText("Edit");
        buttonEdit.setEnabled(false);
        buttonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditActionPerformed(evt);
            }
        });

        buttonHapus.setText("Hapus");
        buttonHapus.setEnabled(false);
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonKembali.setText("Kembali");
        buttonKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelStuffLayout = new javax.swing.GroupLayout(panelStuff);
        panelStuff.setLayout(panelStuffLayout);
        panelStuffLayout.setHorizontalGroup(
            panelStuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStuffLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelStuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStuffLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nankatsuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelStuffLayout.createSequentialGroup()
                        .addComponent(fjbTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStuffLayout.createSequentialGroup()
                .addGap(0, 53, Short.MAX_VALUE)
                .addGroup(panelStuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelStuffLayout.createSequentialGroup()
                        .addComponent(buttonTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(panelStuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStuffLayout.createSequentialGroup()
                            .addComponent(daftararangTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(236, 236, 236))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelStuffLayout.createSequentialGroup()
                            .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(52, 52, 52)))))
        );
        panelStuffLayout.setVerticalGroup(
            panelStuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStuffLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fjbTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(daftararangTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(panelStuffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTambah)
                    .addComponent(buttonEdit)
                    .addComponent(buttonHapus)
                    .addComponent(buttonKembali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(nankatsuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelStuff, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 570));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/background_form1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 570));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Main procedure
    private void EnableButton(boolean stat){ 
        buttonHapus.setEnabled(stat);
        buttonEdit.setEnabled(stat);
    }

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
        InputProduk formInput = new InputProduk(alamatLogin);
        formInput.show();
        dispose();
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKembaliActionPerformed
        new SellerGUI(alamatLogin).setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonKembaliActionPerformed
    
    public String kodeProdukValue(){
       return modelTable.getValueAt(tableProduk.getSelectedRow(),0).toString();
    }
    
    private void buttonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditActionPerformed
        EditProduk formInputProduk = new EditProduk(alamatLogin,control.findDatatIndex(kodeProdukValue()));
        formInputProduk.show();
        dispose();
    }//GEN-LAST:event_buttonEditActionPerformed

    private void btnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYesActionPerformed
        try {
            control.deleteProductData(this,alamatLogin);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal Menghapus !",
                    "warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnYesActionPerformed

    private void btnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNoActionPerformed
        dialogShow.dispose();
    }//GEN-LAST:event_btnNoActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        dialogShow.setLocationRelativeTo(null);
        dialogShow.show();
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void tableProdukMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProdukMousePressed
        EnableButton(true);
        System.out.println(modelTable.getValueAt(tableProduk.getSelectedRow(),0).toString());
    }//GEN-LAST:event_tableProdukMousePressed

    // Setter
    public void setNameColumnTable(){
        tableProduk.setModel(modelTable);
        modelTable.addColumn("Kode Produk");
        modelTable.addColumn("Nama Produk");
        modelTable.addColumn("Kategori");
        modelTable.addColumn("Stok");
        modelTable.addColumn("Harga");
    }
    
    
    // Getter
    public JTable getTableProduk() {    
        return tableProduk;
    }
    
    public JDialog getDialogShow() {
        return dialogShow;
    }

    //main
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListOfStuff(alamatLogin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnYes;
    private javax.swing.JButton buttonEdit;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonKembali;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JLabel daftararangTitle;
    private javax.swing.JDialog dialogShow;
    private javax.swing.JLabel fjbTxt;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nankatsuTxt;
    private javax.swing.JPanel panelStuff;
    private javax.swing.JTable tableProduk;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables
}
