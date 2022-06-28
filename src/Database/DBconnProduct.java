    package Database;

import static Database.DBconnUser.rs;
import Model.Product;
import Model.UserModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import view.EditProduct;
import view.InputProduct;

public class DBconnProduct {
    static final String DB_URL = "jdbc:mysql://localhost/Fjb_campus";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static void insertProduk(InputProduct input,String codeProduct,String nim){
        try{
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();
            
            String nama = input.getTxtNameProduct();
            String kategori = input.getComCategory();
            int Stok = Integer.parseInt(input.getTxtStok());
            int Harga = Integer.parseInt(input.getTxtPrice());
            
            String sql = "INSERT INTO produk (kode_produk,nim,nama_produk,kategori,stok,harga)VALUES('"+codeProduct+"','"+nim+"','"+nama+"','"+kategori+"','"+Stok+"','"+Harga+"')";
            stmt.execute(sql);
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void editProduct(EditProduct input,String codeProduct){
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
                + codeProduct + "'";
            
            stmt.execute(sql);
            stmt.close();
            conn.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static List<Product> getDataProduct(){

        try{
            ArrayList<Product> productList = new ArrayList<Product>();
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM produk";
            rs = stmt.executeQuery(sql);

            while(rs.next()){
                productList.add(new Product(rs.getString("kode_produk"),rs.getString("nim"),rs.getString("nama_produk"), rs.getString("kategori")
                               ,rs.getInt("stok"),rs.getInt("harga")));   
            }
            
            stmt.close();
            conn.close();
            return productList;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static List<Product> searchProduct(String name){
        
        try{
           ArrayList<Product> productList = new ArrayList<Product>();
           conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
           stmt = conn.createStatement();
                
                
           String sql = "SELECT * FROM produk WHERE nama_produk LIKE '%" + name + "%' ";
           rs = stmt.executeQuery(sql);
           
           while(rs.next()){
                productList.add(new Product(rs.getString("kode_produk"),rs.getString("nim"),rs.getString("nama_produk"), rs.getString("kategori")
                               ,rs.getInt("stok"),rs.getInt("harga")));   
            }
                
           
           
           stmt.close();
           conn.close();
           return productList;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static List<Product> searchProductCategory(String name){
        
        try{
           ArrayList<Product> productList = new ArrayList<Product>();
           conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
           stmt = conn.createStatement();
                
                
           String sql = "SELECT * FROM produk WHERE kategori LIKE '%" + name + "%' ";
           rs = stmt.executeQuery(sql);
           
           while(rs.next()){
                productList.add(new Product(rs.getString("kode_produk"),rs.getString("nim"),rs.getString("nama_produk"), rs.getString("kategori")
                               ,rs.getInt("stok"),rs.getInt("harga")));   
            }
                
           
           
           stmt.close();
           conn.close();
           return productList;
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    
    public static void deleteData(String codeProduct){
        try{
             conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
             stmt = conn.createStatement();
             
             String sql = "DELETE FROM produk WHERE"
                + " kode_produk = '" + codeProduct+ "'";
             
             stmt.execute(sql);
             
             stmt.close();
             conn.close();
        } catch (SQLException ex){
            ex.printStackTrace();
        }
    }
}
