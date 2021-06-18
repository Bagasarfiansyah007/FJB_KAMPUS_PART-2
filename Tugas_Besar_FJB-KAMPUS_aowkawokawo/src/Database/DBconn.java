/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import Model.User_model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AMS
 */
public class DBconn {
        static final String DB_URL = "jdbc:mysql://localhost/Fjb_campus";
        static final String DB_USER = "root";
        static final String DB_PASS = "";
        static Connection conn;
        static Statement stmt;
        static ResultSet rs;

        public static void InsertData(String nim, String nama, String fakultas, String noTelpon, String prodi, String email, String Password, int saldo){
            try{
                conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                stmt = conn.createStatement();  

                String sql = "INSERT INTO user(nim,nama,fakultas,prodi,email,telephone,password,saldo) VALUES ('"+nim+"','"+nama+"','"+fakultas+"','"+prodi+"','"+email+"','"+noTelpon+"','"+Password+"','"+saldo+"')";
                stmt.execute(sql);
                stmt.close();
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        public static List<User_model> GetData(){
            try{
                    ArrayList<User_model> userList = new ArrayList<User_model>();
                conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                stmt = conn.createStatement();

                String sql = "SELECT * FROM User";
                rs = stmt.executeQuery(sql);


                while(rs.next()){
                    userList.add(new User_model(rs.getString("nim"), rs.getString("nama"), rs.getString("fakultas")
                                    ,rs.getString("telephone"),rs.getString("prodi"),rs.getString("email"),rs.getString("password")
                                    ,rs.getFloat("saldo")));
                }

                stmt.close();
                conn.close();

                return userList;

            }catch(Exception e){
                e.printStackTrace();
                return null;
            }
        }
}
