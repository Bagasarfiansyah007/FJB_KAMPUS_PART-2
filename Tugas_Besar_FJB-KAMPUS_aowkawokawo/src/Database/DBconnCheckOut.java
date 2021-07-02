/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import static Database.DBconnProduct.conn;
import Model.CheckoutModel;
import Model.FacultyModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import view.InputProduct;

/**
 *
 * @author AMS
 */
public class DBconnCheckOut {
    static final String DB_URL = "jdbc:mysql://localhost/Fjb_campus";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static List<CheckoutModel> getDataPayment(){
        try{
            ArrayList<CheckoutModel> paymentList = new ArrayList<CheckoutModel>();
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM pembayaran";
            rs = stmt.executeQuery(sql);


            while(rs.next()){
                paymentList.add(new CheckoutModel(
                        rs.getString("id_bayar"), 
                        rs.getString("id_pembeli"),
                        rs.getString("id_produk"), 
                        rs.getString("nama_penjual"),
                        rs.getString("nama_produk"), 
                        rs.getInt("banyak_beli"), 
                        rs.getInt("harga"))
                );
            }

            stmt.close();
            conn.close();

            return paymentList;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static void insertPayment
    (
        String codePayment,String nim,String 
        idProduct,String nameSeller,String nameProduct,
        int totalProductBuy,int price)
    {
        try{
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            
            String sql = "INSERT INTO pembayaran ("
                            + "id_bayar,id_pembeli,id_produk,"
                            + "nama_penjual,nama_produk,banyak_beli,"
                            + "harga"
                        + ") VALUES ('"
                                +codePayment+"','"+nim+"','"+idProduct+"','"
                                +nameSeller+"','"+nameProduct+"','"+totalProductBuy+"','"
                                +price+
                            "')";
            
            stmt.execute(sql);
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void updateSaldo(int price,String nim){
        try{
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            
            String sql = "UPDATE user SET saldo = '"+ price + "' WHERE nim ='"+ nim + "'";            
            stmt.execute(sql);
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
