/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import static Database.DBconnProduk.conn;
import Model.CheckoutModel;
import Model.FakultasModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import view.InputProduk;

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
    
    public static List<CheckoutModel> GetDataPembayaran(){
        try{
            ArrayList<CheckoutModel> pembayaranList = new ArrayList<CheckoutModel>();
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM pembayaran";
            rs = stmt.executeQuery(sql);


            while(rs.next()){
                pembayaranList.add(new CheckoutModel(rs.getString("id_bayar"), rs.getString("id_pembeli"), rs.getString("id_produk"), rs.getString("nama_penjual"), rs.getString("nama_produk"), rs.getInt("banyak_beli"), rs.getInt("harga")));
            }

            stmt.close();
            conn.close();

            return pembayaranList;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static void insertPembayaran(String kodeBayar,String idPembeli,String idProduk,String namaPenjual,String namaProduk,int banyakBeli,int harga){
        try{
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            
            String sql = "INSERT INTO pembayaran (id_bayar,id_pembeli,id_produk,nama_penjual,nama_produk,banyak_beli,harga)VALUES('"+kodeBayar+"','"+idPembeli+"','"+idProduk+"','"+namaPenjual+"','"+namaProduk+"','"+banyakBeli+"','"+harga+"')";
            stmt.execute(sql);
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void updateSaldo(int harga,String nim){
        try{
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            
            String sql = "UPDATE user SET saldo = '"+ harga + "' WHERE nim ='"+ nim + "'";            
            stmt.execute(sql);
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
