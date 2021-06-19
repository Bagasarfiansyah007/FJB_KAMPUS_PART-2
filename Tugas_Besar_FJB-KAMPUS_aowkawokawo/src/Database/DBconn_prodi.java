/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.Fakultas_model;
import Model.Prodi_model;
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
public class DBconn_prodi {
    static final String DB_URL = "jdbc:mysql://localhost/Fjb_campus";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static List<Prodi_model> GetDataProdi(){
        try{
            ArrayList<Prodi_model> prodiList = new ArrayList<Prodi_model>();
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM prodi";
            rs = stmt.executeQuery(sql);


            while(rs.next()){
                prodiList.add(new Prodi_model(rs.getString("kode_prodi"), rs.getString("kode_fakultas"),rs.getString("nama_prodi")));
            }

            stmt.close();
            conn.close();

            return prodiList;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
