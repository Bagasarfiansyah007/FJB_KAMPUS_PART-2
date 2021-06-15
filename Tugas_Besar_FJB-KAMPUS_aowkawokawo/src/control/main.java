/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Model.User_model;
import java.util.ArrayList;
import java.util.List;
import Database.DBconn;
/**
 *
 * @author AMS
 */
public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<User_model> myObj = new ArrayList<User_model>();
        
        myObj =  DBconn.GetData();
        
        for(User_model Item : myObj){
            System.out.println("Nim      : " + Item.getNim());
            System.out.println("Nama     : " + Item.getNama());
            System.out.println("Fakultas : " + Item.getFakultas());
        }
        
        
        
    }
}
