/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static view.DaftarBarang.conn;
/**
 *
 * @author USER
 */
public class Pembeli_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Pembeli_GUI
     */
    
    static final String DB_URL = "jdbc:mysql://localhost/Fjb_campus";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    DefaultTableModel modelTable = new DefaultTableModel();
    
    public Pembeli_GUI() {
        initComponents();
        setNameColumnTable();
        GetDataProduk();
    }
    
    public void setNameColumnTable(){
        tableProduk.setModel(modelTable);
        modelTable.addColumn("Kode Produk");
        modelTable.addColumn("Nama Produk");
        modelTable.addColumn("Kategori");
        modelTable.addColumn("Stok");
        modelTable.addColumn("Harga");
    }
    
    public void cariBarang(String nama){
        modelTable.getDataVector().removeAllElements();
        modelTable.fireTableDataChanged();
        
        try{
//             ArrayList<Product> produkList = new ArrayList<Product>();
             conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             stmt = conn.createStatement();
                
                
           String sql = "SELECT * FROM produk WHERE nama_produk LIKE '%" + nama + "%' ";
           rs = stmt.executeQuery(sql);
           
//           while(rs.next()){
//               produkList.add(new Product(rs.getString("kode_produk"), rs.getString("nama_produk"), rs.getString("kategori"), rs.getInt("stok"), rs.getInt("harga")));
//               modelTable.addRow();
//           }
           
           Object[] obj = new Object[5];
           while(rs.next()){
               
               obj[0] = rs.getString("kode_produk");
               obj[1] = rs.getString("nama_produk");
               obj[2] = rs.getString("kategori");
               obj[3] = rs.getString("stok");
               obj[4] = rs.getString("harga");
               modelTable.addRow(obj);
           }
                
           
           
           stmt.close();
           conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void GetDataProduk(){
        modelTable.getDataVector().removeAllElements();
        modelTable.fireTableDataChanged();
        
        try{
             conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             stmt = conn.createStatement();
                
                
           String sql = "SELECT * FROM produk";
           rs = stmt.executeQuery(sql);
           
           
           Object[] obj = new Object[5];
           while(rs.next()){
               
               obj[0] = rs.getString("kode_produk");
               obj[1] = rs.getString("nama_produk");
               obj[2] = rs.getString("kategori");
               obj[3] = rs.getString("stok");
               obj[4] = rs.getString("harga");
               modelTable.addRow(obj);
           }
           stmt.close();
           conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public void cariBarangKategori(String kategori){
        modelTable.getDataVector().removeAllElements();
        modelTable.fireTableDataChanged();
        
        try{
//             ArrayList<Product> produkList = new ArrayList<Product>();
             conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             stmt = conn.createStatement();
                
                
           String sql = "SELECT * FROM produk WHERE kategori LIKE '%" + kategori + "%' ";
           rs = stmt.executeQuery(sql);
           
//           while(rs.next()){
//               produkList.add(new Product(rs.getString("kode_produk"), rs.getString("nama_produk"), rs.getString("kategori"), rs.getInt("stok"), rs.getInt("harga")));
//               modelTable.addRow();
//           }
           
           Object[] obj = new Object[5];
           while(rs.next()){
               
               obj[0] = rs.getString("kode_produk");
               obj[1] = rs.getString("nama_produk");
               obj[2] = rs.getString("kategori");
               obj[3] = rs.getString("stok");
               obj[4] = rs.getString("harga");
               modelTable.addRow(obj);
           }
                
           
           
           stmt.close();
           conn.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BeliButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProduk = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        Troli = new javax.swing.JButton();
        AkunButton = new javax.swing.JButton();
        BeliButton1 = new javax.swing.JButton();
        CariBarangField = new javax.swing.JTextField();
        NamaSearchButton = new javax.swing.JButton();
        KategoriSearchButton = new javax.swing.JButton();
        PaneDaftarBarang = new javax.swing.JScrollPane();
        DaftarBarangField = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        OkeSearchButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(tableProduk);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
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
                .addComponent(BeliButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        BeliButton1.setText("LogOut");
        BeliButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeliButton1ActionPerformed(evt);
            }
        });

        CariBarangField.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        CariBarangField.setText("Cari Barang");
        CariBarangField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CariBarangFieldActionPerformed(evt);
            }
        });

        NamaSearchButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        NamaSearchButton.setText("Nama");
        NamaSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaSearchButtonActionPerformed(evt);
            }
        });

        KategoriSearchButton.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        KategoriSearchButton.setText("Kategori");
        KategoriSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KategoriSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(204, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Troli, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AkunButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BeliButton1)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(CariBarangField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(NamaSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(KategoriSearchButton)
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Troli, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AkunButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BeliButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CariBarangField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NamaSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(KategoriSearchButton))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 140));

        DaftarBarangField.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        DaftarBarangField.setText("Daftar Barang");
        PaneDaftarBarang.setViewportView(DaftarBarangField);

        getContentPane().add(PaneDaftarBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 30));

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
    }// </editor-fold>//GEN-END:initComponents

    private void AkunButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AkunButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AkunButtonActionPerformed

    private void CariBarangFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CariBarangFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CariBarangFieldActionPerformed

    private void TroliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TroliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TroliActionPerformed

    private void NamaSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaSearchButtonActionPerformed
        String nama = CariBarangField.getText();
        
        if(nama != " "){
            cariBarang(nama);
            CariBarangField.setText(" ");
        }else {
            JOptionPane.showMessageDialog(null, "Isi nama barang yang ingin dicari",
                "Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_NamaSearchButtonActionPerformed

    private void BeliButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BeliButtonActionPerformed

    private void OkeSearchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OkeSearchButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OkeSearchButton1ActionPerformed

    private void BeliButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeliButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BeliButton1ActionPerformed

    private void KategoriSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KategoriSearchButtonActionPerformed
        String kategori = CariBarangField.getText();
        
        if(kategori != " "){
            cariBarangKategori(kategori);
            CariBarangField.setText(" ");
        }else {
            JOptionPane.showMessageDialog(null, "Isi kategori barang yang ingin dicari",
                "Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_KategoriSearchButtonActionPerformed

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
                new Pembeli_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AkunButton;
    private javax.swing.JButton BeliButton;
    private javax.swing.JButton BeliButton1;
    private javax.swing.JTextField CariBarangField;
    private javax.swing.JLabel DaftarBarangField;
    private javax.swing.JButton KategoriSearchButton;
    private javax.swing.JButton NamaSearchButton;
    private javax.swing.JButton OkeSearchButton1;
    private javax.swing.JScrollPane PaneDaftarBarang;
    private javax.swing.JButton Troli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableProduk;
    // End of variables declaration//GEN-END:variables
}
