/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import static Database.DBconnUser.conn;
import Model.FacultyModel;
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
public class DBconnFaculty {
    static final String DB_URL = "jdbc:mysql://localhost/Fjb_campus";
    static final String DB_USER = "root";
    static final String DB_PASS = "";
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static List<FacultyModel> getDataFakultas(){
        try{
            ArrayList<FacultyModel> facultyList = new ArrayList<FacultyModel>();
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM Fakultas";
            rs = stmt.executeQuery(sql);


            while(rs.next()){
                facultyList.add(new FacultyModel(rs.getString("kode_fakultas"), rs.getString("nama_fakultas")));
            }

            stmt.close();
            conn.close();

            return facultyList;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
