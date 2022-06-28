
package view;

import java.awt.event.MouseEvent;
import static view.MenuLogin.control;

public class SellerGUI extends javax.swing.JFrame {
    
    // Attribute
    private static int addressLogin;
    
    // Constructor
    public SellerGUI(int index) {
        initComponents();
        addressLogin = index;
        setNamaAkun(addressLogin);
        setNimAccount(addressLogin);
        System.out.println(addressLogin);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        guidePanelTop = new javax.swing.JPanel();
        menuTitle = new javax.swing.JLabel();
        fjbTxt = new javax.swing.JLabel();
        guideMenuPanel = new javax.swing.JPanel();
        updateProfileBtn = new javax.swing.JButton();
        nankatsuTxt = new javax.swing.JLabel();
        logOutBtn = new javax.swing.JButton();
        listProductBtn = new javax.swing.JButton();
        sellBtn = new javax.swing.JButton();
        nameLabel = new javax.swing.JLabel();
        nimLabel = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        guidePanelTop.setOpaque(false);

        menuTitle.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        menuTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuTitle.setText("MENU PENJUAL");

        fjbTxt.setForeground(new java.awt.Color(255, 255, 255));
        fjbTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fjbTxt.setText("FJB Kampus");

        javax.swing.GroupLayout guidePanelTopLayout = new javax.swing.GroupLayout(guidePanelTop);
        guidePanelTop.setLayout(guidePanelTopLayout);
        guidePanelTopLayout.setHorizontalGroup(
            guidePanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guidePanelTopLayout.createSequentialGroup()
                .addComponent(fjbTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(434, Short.MAX_VALUE))
            .addComponent(menuTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        guidePanelTopLayout.setVerticalGroup(
            guidePanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guidePanelTopLayout.createSequentialGroup()
                .addComponent(fjbTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(menuTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(guidePanelTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 618, 109));

        guideMenuPanel.setOpaque(false);

        updateProfileBtn.setText("Update Profil");

        nankatsuTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nankatsuTxt.setText("Nankatsu");

        logOutBtn.setText("Keluar");
        logOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutBtnActionPerformed(evt);
            }
        });

        listProductBtn.setText("Daftar Barang");
        listProductBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listProductBtnActionPerformed(evt);
            }
        });

        sellBtn.setText("Jual Barang");
        sellBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellBtnActionPerformed(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameLabel.setText("jLabel2");

        nimLabel.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nimLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nimLabel.setText("jLabel2");

        javax.swing.GroupLayout guideMenuPanelLayout = new javax.swing.GroupLayout(guideMenuPanel);
        guideMenuPanel.setLayout(guideMenuPanelLayout);
        guideMenuPanelLayout.setHorizontalGroup(
            guideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guideMenuPanelLayout.createSequentialGroup()
                .addGap(0, 431, Short.MAX_VALUE)
                .addComponent(nankatsuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, guideMenuPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(guideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateProfileBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listProductBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sellBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(183, 183, 183))
            .addComponent(nimLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        guideMenuPanelLayout.setVerticalGroup(
            guideMenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guideMenuPanelLayout.createSequentialGroup()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nimLabel)
                .addGap(20, 20, 20)
                .addComponent(sellBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listProductBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateProfileBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(nankatsuTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(guideMenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 618, 470));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/resources/background_form1.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutBtnActionPerformed
        MenuLogin formMenu = new MenuLogin(addressLogin + 1);
        formMenu.show();
        dispose();
    }//GEN-LAST:event_logOutBtnActionPerformed

    private void listProductBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listProductBtnActionPerformed
        ListOfStuff formDaftar = new ListOfStuff(addressLogin);
        formDaftar.show();
        dispose();
    }//GEN-LAST:event_listProductBtnActionPerformed
    
    private void sellBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellBtnActionPerformed
        InputProduct formInput = new InputProduct(addressLogin);
        formInput.show();
        dispose();
    }//GEN-LAST:event_sellBtnActionPerformed

    
    // Setter
    public void setNamaAkun(int index) {
        nameLabel.setText(control.user.get(index).getName()+ "-" + control.user.get(index).getFaculty());
    }
    
    public void setNimAccount(int index) {
        nimLabel.setText("( "+control.user.get(index).getNim() + " )");
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellerGUI(addressLogin).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel fjbTxt;
    private javax.swing.JPanel guideMenuPanel;
    private javax.swing.JPanel guidePanelTop;
    private javax.swing.JButton listProductBtn;
    private javax.swing.JButton logOutBtn;
    private javax.swing.JLabel menuTitle;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel nankatsuTxt;
    private javax.swing.JLabel nimLabel;
    private javax.swing.JButton sellBtn;
    private javax.swing.JButton updateProfileBtn;
    // End of variables declaration//GEN-END:variables
}
