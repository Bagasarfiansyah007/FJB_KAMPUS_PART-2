/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Database.DBconn_fakultas;
import Database.DBconn_prodi;
import Model.User_model;
import java.util.ArrayList;
import java.util.List;
import Database.DBconn_user;
import Model.Fakultas_model;
import Model.Prodi_model;
/**
 *
 * @author AMS
 */
public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<Prodi_model> myObj = new ArrayList<Prodi_model>();
        
        myObj =  DBconn_prodi.GetDataProdi();
        
        for(Prodi_model Item : myObj){
            System.out.println("Nim      : " + Item.getKodeProdi());
            System.out.println("Nama     : " + Item.getKodeFakultas());
            System.out.println("Fakultas : " + Item.getNamaProdi());
        }
        
        
        
    }
}
