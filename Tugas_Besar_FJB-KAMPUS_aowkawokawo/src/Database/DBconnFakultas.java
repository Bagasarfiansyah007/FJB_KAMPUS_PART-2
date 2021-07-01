/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import static Database.DBconnUser.conn;
import Model.FakultasModel;
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
public class DBconnFakultas {
    static final String DB_URL = "jdbc:mysql://localhost/Fjb_campus";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static List<FakultasModel> GetDataFakultas(){
        try{
            ArrayList<FakultasModel> fakultasList = new ArrayList<FakultasModel>();
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM Fakultas";
            rs = stmt.executeQuery(sql);


            while(rs.next()){
                fakultasList.add(new FakultasModel(rs.getString("kode_fakultas"), rs.getString("nama_fakultas")));
            }

            stmt.close();
            conn.close();

            return fakultasList;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
