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
import view.Register_GUI;

/**
 *
 * @author AMS
 */
public class DBconn_user {
        static final String DB_URL = "jdbc:mysql://localhost/Fjb_campus";
        static final String DB_USER = "root";
        static final String DB_PASS = "";
        static Connection conn;
        static Statement stmt;
        static ResultSet rs;

        public static void InsertData(Register_GUI register){
            try{
                conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                stmt = conn.createStatement();  
                
                String nim = register.getTxtNim();
                String nama = register.getTxtNama();
                String fakultas = register.getComboFakultas();
                String noTelpon = register.getTxtTelphone();
                String prodi = register.getComboProdi();
                String email = register.getTxtEmail();
                String Password = register.getTxtPassword(); 
                int saldo = register.getTxtSaldo();
                
                String sql = "INSERT INTO user(nim,nama,fakultas,prodi,email,telephone,password,saldo) VALUES ('"+nim+"','"+nama+"','"+fakultas+"','"+prodi+"','"+email+"','"+noTelpon+"','"+Password+"','"+saldo+"')";
                
                stmt.execute(sql);
                stmt.close();
                conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        public static List<User_model> GetDataUser(){
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