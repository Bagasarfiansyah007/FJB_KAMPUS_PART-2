/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Model.User_model;
import java.util.ArrayList;
import java.util.List;
import Database.DBconn_user;
import Model.Fakultas_model;
/**
 *
 * @author AMS
 */
public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Fakultas_model> myObj = new ArrayList<Fakultas_model>();
        
        myObj =  DBconn_user.GetDataFakultas();
        
        for(Fakultas_model Item : myObj){
            System.out.println("Nim      : " + Item.getId_fakultas());
            System.out.println("Nama     : " + Item.getNama());
            System.out.println("Fakultas : " + Item.getKode_prodi());
        }
        
        
        
    }
}
