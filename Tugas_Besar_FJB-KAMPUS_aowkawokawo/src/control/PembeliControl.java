/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Database.DBconnCheckOut;
import Database.DBconnProduk;
import Database.DBconnUser;
import Model.CheckoutModel;
import Model.FakultasModel;
import Model.Product;
import Model.UserModel;
import general.DialogMessage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import view.CheckOutGUI;
import view.DaftarBarang;
import view.HistoryGUI;
import view.PembeliGUI;

public class PembeliControl <T>{
    
    // Attribute
    public List <CheckoutModel> listCheckout;
    public List <CheckoutModel> listCheckoutDb;
    public List <UserModel> listUser;
    public List <Product> listProduk;
    PembeliGUI formPembeli;
    CheckOutGUI formCheckout;
    HistoryGUI formHistory;
    
    
    // Controller
    public PembeliControl(T form){
        listProduk = DBconnProduk.GetDataProduk();
        listUser = DBconnUser.GetDataUser();
        listCheckout = new ArrayList<CheckoutModel>();
        listCheckoutDb = DBconnCheckOut.getDataPayment();
        this.formPembeli = formPembeli;
    }
    
    
    
    // Main procedure
    public void inserListCheckout(int index,int alamatLogin){
        String kodeBayar = "";
        kodeBayar = inputIdListBayar(kodeBayar);
        String nim = listUser.get(alamatLogin).getNim();
        String namaPenjual = findNameSeller(index);
        String kodeProduk = listProduk.get(index).getKode_product();
        String namaProduk = listProduk.get(index).getNama();
        int banyakBeli = 1;
        int harga = listProduk.get(index).getHarga();
        
        listCheckout.add(new CheckoutModel(kodeBayar,nim,kodeProduk,namaPenjual,namaProduk,banyakBeli,harga));
        DialogMessage.dialogFormSucsess("Produk " + namaProduk + " Berhasil ditambahkan","sukses");
    }
    
    public void GetDataProduk(HistoryGUI formHistory,int index){
        formHistory.modelTable.getDataVector().removeAllElements();
        formHistory.modelTable.fireTableDataChanged();
        
        try{
            
           Object[] tabel = new Object[6];
           inputDataTable(formHistory,listCheckoutDb,listUser,tabel,index);
        
        }catch(Exception e){
            DialogMessage.dialogFormWarning("Data Kosong dan belum masuk","warning");
        }
    }
    
    public void inputDataTable (HistoryGUI form,List <CheckoutModel> list,List <UserModel> list2,Object[] tabel,int index) {
        for (int i = 0 ; i < list.size();i++){
           if (list.get(i).getIdPembeli().intern() == list2.get(index).getNim().intern()) {
               tabel[0] = list.get(i).getIdBayar();
               tabel[1] = list.get(i).getIdProduk();
               tabel[2] = list.get(i).getNamaPenjual();
               tabel[3] = list.get(i).getNamaProduk();
               tabel[4] = list.get(i).getBanyakBeli();
               tabel[5] = list.get(i).getHarga();
               form.modelTable.addRow(tabel);
           }
        }
    }

    public void insertDatabase(int index,int alamatLogin,List <CheckoutModel> listCheckout){
        String kodeBayar = "";
        kodeBayar = listCheckout.get(index).getIdBayar();
        String nim = listUser.get(alamatLogin).getNim();
        String kodeProduk = listCheckout.get(index).getIdProduk();
        String namaPenjual = findNameSeller(index);
        String namaProduk = listCheckout.get(index).getNamaProduk();
        int banyakBeli = listCheckout.get(index).getBanyakBeli();
        int harga = listCheckout.get(index).getHarga();
        
        DBconnCheckOut.insertPayment(kodeBayar, nim, kodeProduk, namaPenjual, namaProduk, banyakBeli, harga);
        DialogMessage.dialogFormSucsess("Produk " + namaProduk + " Berhasil Dibeli","sukses");
    }
    
    
    
    
    public String inputIdListBayar(String kodeBayar){
        String currentData = "";
        if (listCheckout.size() == 0) {
            currentData = listCheckoutDb.get(listCheckoutDb.size()-1).getIdBayar();
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
        } else {
            currentData = listCheckout.get(listCheckout.size()-1).getIdBayar();
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
    
    public String findNameSeller(int index){
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
    
    public int findeIndexProduct(String kode){
        int i = 0;
        while (listProduk.get(i).getKode_product().intern() != kode.intern()) {
            i = i + 1;
        }
        return i; 
    }
    
    
}
