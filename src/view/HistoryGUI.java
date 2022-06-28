
package view;

import javax.swing.table.DefaultTableModel;
import Database.DBconnCheckOut;
import Model.CheckoutModel;
import control.BuyerControl;
import java.util.List;

public class HistoryGUI extends javax.swing.JFrame {

    // Atribut
    public DefaultTableModel modelTable = new DefaultTableModel();
    private static int addresLogin;
    static BuyerControl control;
    public HistoryGUI(int index, List<CheckoutModel> listInput) {
        initComponents();
        addresLogin = index;
        control = new BuyerControl(this);
        setNameColumnTable();
        control.getDataProduct(this, addresLogin);
        control.listCheckout = listInput;
    }
    
    // Comstructor
    public void setNameColumnTable(){
        tableHistory.setModel(modelTable);
        modelTable.addColumn("Id Bayar");
        modelTable.addColumn("Id Produk");
        modelTable.addColumn("Nama Penjual");
        modelTable.addColumn("Nama Produk");
        modelTable.addColumn("Banyak Beli");
        modelTable.addColumn("Harga");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        historyPane = new javax.swing.JPanel();
        historyTitle = new javax.swing.JLabel();
        listHistoryProduct = new javax.swing.JScrollPane();
        tableHistory = new javax.swing.JTable();
        fjbTxt = new javax.swing.JLabel();
        NankatsuTxt = new javax.swing.JLabel();
        menuBtn = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        historyPane.setOpaque(false);

        historyTitle.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        historyTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        historyTitle.setText("History");

        tableHistory.setModel(new javax.swing.table.DefaultTableModel(
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
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        listHistoryProduct.setViewportView(tableHistory);

        fjbTxt.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        fjbTxt.setForeground(new java.awt.Color(255, 255, 255));
        fjbTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fjbTxt.setText("FJB Kampus");

        NankatsuTxt.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        NankatsuTxt.setForeground(new java.awt.Color(255, 255, 255));
        NankatsuTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NankatsuTxt.setText("Nankatsu");

        menuBtn.setText("Menu");
        menuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout historyPaneLayout = new javax.swing.GroupLayout(historyPane);
        historyPane.setLayout(historyPaneLayout);
        historyPaneLayout.setHorizontalGroup(
            historyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historyPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NankatsuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(historyPaneLayout.createSequentialGroup()
                .addGroup(historyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(menuBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(historyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(historyPaneLayout.createSequentialGroup()
                            .addGap(237, 237, 237)
                            .addComponent(historyTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(historyPaneLayout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(listHistoryProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(historyPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(fjbTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        historyPaneLayout.setVerticalGroup(
            historyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historyPaneLayout.createSequentialGroup()
                .addComponent(fjbTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(historyTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(listHistoryProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(menuBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(NankatsuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(historyPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 570));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/background_form1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Main Procedure
    private void menuBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBtnActionPerformed
        BuyerGUI formBuyer = new BuyerGUI(addresLogin,control.listCheckout);
        formBuyer.show();
        dispose();
    }//GEN-LAST:event_menuBtnActionPerformed

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
            java.util.logging.Logger.getLogger(HistoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoryGUI(addresLogin,control.listCheckout).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NankatsuTxt;
    private javax.swing.JLabel background;
    private javax.swing.JLabel fjbTxt;
    private javax.swing.JPanel historyPane;
    private javax.swing.JLabel historyTitle;
    private javax.swing.JScrollPane listHistoryProduct;
    private javax.swing.JButton menuBtn;
    private javax.swing.JTable tableHistory;
    // End of variables declaration//GEN-END:variables
}
