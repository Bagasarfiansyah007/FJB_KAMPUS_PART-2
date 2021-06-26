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
import view.InputProduk;
/**
 *
 * @author AMS
 */
public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        InputProduk formInputProduk = new InputProduk(1);
        Product_control produk = new Product_control(formInputProduk);
        
        String currentData = produk.listProduk.get(produk.listProduk.size()-1).getKode_product();
        int hitung = 1 + Integer.parseInt(currentData.substring(1));
        System.out.println("nilai : "+ hitung);
        
    }
}
