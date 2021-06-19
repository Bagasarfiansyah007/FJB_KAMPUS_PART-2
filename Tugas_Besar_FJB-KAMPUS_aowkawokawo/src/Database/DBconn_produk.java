/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AMS
 */
public class DBconn_produk {
    static final String DB_URL = "jdbc:mysql://localhost/Fjb_campus";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static void insertProduk(String kode_produk, String nama_produk, String kategori, int stok, int harga){
        try{
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "INSERT INTO produk (kode_produk,nama_produk,kategori,stok,harga)VALUES('"+kode_produk+"','"+nama_produk+"','"+kategori+"','"+stok+"','"+harga+"')";
            stmt.execute(sql);
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static List<Product> GetDataProduk(){

        try{
            ArrayList<Product> produkList = new ArrayList<Product>();
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM produk";
            rs = stmt.executeQuery(sql);

            while(rs.next()){
                Object[] obj = new Object[5];
                obj[0] = rs.getString("kode_produk");
                obj[1] = rs.getString("nama_produk");
                obj[2] = rs.getString("kategori");
                obj[3] = rs.getString("stok");
                obj[4] = rs.getString("harga");   
            }

            stmt.close();
            conn.close();
            return produkList;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
