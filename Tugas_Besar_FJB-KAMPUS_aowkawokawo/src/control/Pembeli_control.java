/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Database.DBconn_produk;
import Database.DBconn_user;
import Model.Checkout_model;
import Model.Fakultas_model;
import Model.Product;
import Model.User_model;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import view.CheckOut_GUI;
import view.Pembeli_GUI;

public class Pembeli_control {
    public List <Checkout_model> listCheckout;
    public List <User_model> listUser;
    public List <Product> listProduk;
    
    Pembeli_GUI formPembeli;
    CheckOut_GUI formCheckout;
    
    public Pembeli_control(Pembeli_GUI formPembeli){
        listProduk = DBconn_produk.GetDataProduk();
        listUser = DBconn_user.GetDataUser();
        listCheckout = new ArrayList<Checkout_model>();
        this.formPembeli = formPembeli;
    }
    
    public Pembeli_control(CheckOut_GUI formCheckout){
        listProduk = DBconn_produk.GetDataProduk();
        listUser = DBconn_user.GetDataUser();
        listCheckout = new ArrayList<Checkout_model>();
        this.formCheckout = formCheckout;
    }
    
    public void isiDataCheckout(int index,int alamatLogin){
        String kodeBayar = "";
        kodeBayar = inputIdListBayar(kodeBayar);
        String nim = listUser.get(alamatLogin).getNim();
        String namaPenjual = cariNamaPenjual(index);
        String kodeProduk = listProduk.get(index).getKode_product();
        String namaProduk = listProduk.get(index).getNama();
        int banyakBeli = 1;
        int harga = listProduk.get(index).getHarga();
        
        listCheckout.add(new Checkout_model(kodeBayar,nim,kodeProduk,namaPenjual,namaProduk,banyakBeli,harga));
        dialogFormSucsess("Produk " + namaProduk + " Berhasil ditambahkan","sukses");
    }
    
    public String inputIdListBayar(String kodeBayar){
        if (listCheckout.size() == 0) {
            kodeBayar = "P01";
        } else {
            String currentData = listCheckout.get(listCheckout.size()-1).getIdBayar();
            int hitung;
            if (Integer.parseInt(currentData.substring(2)) == 9) {
                hitung = 1 + Integer.parseInt(currentData.substring(1));
                kodeBayar = "P" + String.valueOf(hitung);
            } else if (Integer.parseInt(currentData.substring(1)) > 9){
                hitung = 1 + Integer.parseInt(currentData.substring(1));
                kodeBayar = "P" + String.valueOf(hitung);
            }else {
                hitung = 1 + Integer.parseInt(currentData.substring(2));
                kodeBayar = "P0" + String.valueOf(hitung);
            }
        }
   
        return kodeBayar;
    }
    
    public String cariNamaPenjual(int index){
        int i = 0;
        String namaPenjual;
        while (listProduk.get(index).getNim().intern() != listUser.get(i).getNim().intern()) {
            i = i + 1;
        }
        if (listProduk.get(index).getNim().intern() == listUser.get(i).getNim().intern()) {
            namaPenjual = listUser.get(i).getNama();
        } else {
            namaPenjual = "Tidak ditemukan";
        }
        
        return namaPenjual;
    }
    
    public int CariIndexProduk(String kode){
        int i = 0;
        while (listProduk.get(i).getKode_product().intern() != kode.intern()) {
            i = i + 1;
        }
        return i; 
    }
    
    // Diaolog message;
    public void dialogFormWarning (String message,String titel){
        JOptionPane.showMessageDialog(null, message,
                titel,JOptionPane.WARNING_MESSAGE);
    }
    
    public void dialogFormSucsess (String message,String titel){
        JOptionPane.showMessageDialog(null, message,
                titel,JOptionPane.INFORMATION_MESSAGE);
    }
}
