    package Database;

import static Database.DBconn_user.rs;
import Model.Product;
import Model.UserModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import view.EditProduk;
import view.InputProduk;

public class DBconnProduk {
    static final String DB_URL = "jdbc:mysql://localhost/Fjb_campus";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static void insertProduk(InputProduk input,String kodeProduk,String nim){
        try{
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            
            String nama = input.getTxtNamaProduk();
            String kategori = input.getComKategori();
            int Stok = Integer.parseInt(input.getTxtStok());
            int Harga = Integer.parseInt(input.getTxtHarga());
            
            String sql = "INSERT INTO produk (kode_produk,nim,nama_produk,kategori,stok,harga)VALUES('"+kodeProduk+"','"+nim+"','"+nama+"','"+kategori+"','"+Stok+"','"+Harga+"')";
            stmt.execute(sql);
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void EditProduk(EditProduk input,String kodeProduk){
        try{
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            
            String nama = input.getTxtNamaProduk();
            String kategori = input.getComKategori();
            int Stok = Integer.parseInt(input.getTxtStok());
            int Harga = Integer.parseInt(input.getTxtHarga());
            
            String sql = "UPDATE produk SET nama_produk='"
                + nama + "', kategori ='"
                + kategori + "', stok ='"
                + Stok + "', harga ='"
                + Harga + "' WHERE kode_produk ='"
                + kodeProduk + "'";
            
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
                produkList.add(new Product(rs.getString("kode_produk"),rs.getString("nim"),rs.getString("nama_produk"), rs.getString("kategori")
                               ,rs.getInt("stok"),rs.getInt("harga")));   
            }
            
            stmt.close();
            conn.close();
            return produkList;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static List<Product> cariProduk(String nama){
        
        try{
           ArrayList<Product> produkList = new ArrayList<Product>();
           conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
           stmt = conn.createStatement();
                
                
           String sql = "SELECT * FROM produk WHERE nama_produk LIKE '%" + nama + "%' ";
           rs = stmt.executeQuery(sql);
           
           while(rs.next()){
                produkList.add(new Product(rs.getString("kode_produk"),rs.getString("nim"),rs.getString("nama_produk"), rs.getString("kategori")
                               ,rs.getInt("stok"),rs.getInt("harga")));   
            }
                
           
           
           stmt.close();
           conn.close();
           return produkList;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static List<Product> cariProdukKategori(String nama){
        
        try{
           ArrayList<Product> produkList = new ArrayList<Product>();
           conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
           stmt = conn.createStatement();
                
                
           String sql = "SELECT * FROM produk WHERE kategori LIKE '%" + nama + "%' ";
           rs = stmt.executeQuery(sql);
           
           while(rs.next()){
                produkList.add(new Product(rs.getString("kode_produk"),rs.getString("nim"),rs.getString("nama_produk"), rs.getString("kategori")
                               ,rs.getInt("stok"),rs.getInt("harga")));   
            }
                
           
           
           stmt.close();
           conn.close();
           return produkList;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static void deleteData(String kodeProduk){
        try{
             conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             stmt = conn.createStatement();
             
             String sql = "DELETE FROM produk WHERE"
                + " kode_produk = '" + kodeProduk+ "'";
             
             stmt.execute(sql);
             
             stmt.close();
             conn.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
