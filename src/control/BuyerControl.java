/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Database.DBconnCheckOut;
import Database.DBconnProduct;
import Database.DBconnUser;
import Model.CheckoutModel;
import Model.FacultyModel;
import Model.Product;
import Model.UserModel;
import general.DialogMessage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import view.CheckOutGUI;
import view.ListOfStuff;
import view.HistoryGUI;
import view.BuyerGUI;

public class BuyerControl <T>{
    
    // Attribute
    public List <CheckoutModel> listCheckout;
    public List <CheckoutModel> listCheckoutDb;
    public List <UserModel> listUser;
    public List <Product> listProduk;
    BuyerGUI formPembeli;
    CheckOutGUI formCheckout;
    HistoryGUI formHistory;
    
    
    // Controller
    public BuyerControl(T form){
        listProduk = DBconnProduct.getDataProduct();
        listUser = DBconnUser.getDataUser();
        listCheckout = new ArrayList<CheckoutModel>();
        listCheckoutDb = DBconnCheckOut.getDataPayment();
        this.formPembeli = formPembeli;
    }
    
    
    
    // Main procedure
    public void inserListCheckout(int index,int alamatLogin){
        String codePayment = "";
        codePayment = inputIdListBayar(codePayment);
        String nim = listUser.get(alamatLogin).getNim();
        String sellerName = findNameSeller(index);
        String productCode = listProduk.get(index).getProductCode();
        String productName = listProduk.get(index).getProducrName();
        int allProductBuy = 1;
        int price = listProduk.get(index).getPrice();
        
        listCheckout.add(new CheckoutModel(codePayment,nim,productCode,sellerName,productName,allProductBuy,price));
        DialogMessage.dialogFormSucsess("Produk " + productName + " Berhasil ditambahkan","sukses");
    }
    
    public void getDataProduct(HistoryGUI formHistory,int index){
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
           if (list.get(i).getNimPayment().intern() == list2.get(index).getNim().intern()) {
               tabel[0] = list.get(i).getIdPayment();
               tabel[1] = list.get(i).getIdProduct();
               tabel[2] = list.get(i).getNameSeller();
               tabel[3] = list.get(i).getNameProduct();
               tabel[4] = list.get(i).getTotalProductBuy();
               tabel[5] = list.get(i).getPrice();
               form.modelTable.addRow(tabel);
           }
        }
    }

    public void insertDatabase(int index,int alamatLogin,List <CheckoutModel> listCheckout){
        String codePayment = "";
        codePayment = listCheckout.get(index).getIdPayment();
        String nim = listUser.get(alamatLogin).getNim();
        String productCode = listCheckout.get(index).getIdProduct();
        String sellerName = findNameSeller(index);
        String productName = listCheckout.get(index).getNameProduct();
        int allProductBuy = listCheckout.get(index).getTotalProductBuy();
        int price = listCheckout.get(index).getPrice();
        
        DBconnCheckOut.insertPayment(codePayment, nim, productCode, sellerName, productName, allProductBuy, price);
        DialogMessage.dialogFormSucsess("Produk " + productName + " Berhasil Dibeli","sukses");
    }
    
    
    
    
    public String inputIdListBayar(String codePayment){
        String currentData = "";
        if (listCheckout.size() == 0) {
            currentData = listCheckoutDb.get(listCheckoutDb.size()-1).getIdPayment();
            int hitung;
            if (Integer.parseInt(currentData.substring(2)) == 9) {
                hitung = 1 + Integer.parseInt(currentData.substring(1));
                codePayment = "P" + String.valueOf(hitung);
            } else if (Integer.parseInt(currentData.substring(1)) > 9){
                hitung = 1 + Integer.parseInt(currentData.substring(1));
                codePayment = "P" + String.valueOf(hitung);
            }else {
                hitung = 1 + Integer.parseInt(currentData.substring(2));
                codePayment = "P0" + String.valueOf(hitung);
            }
        } else {
            currentData = listCheckout.get(listCheckout.size()-1).getIdPayment();
            int hitung;
            if (Integer.parseInt(currentData.substring(2)) == 9) {
                hitung = 1 + Integer.parseInt(currentData.substring(1));
                codePayment = "P" + String.valueOf(hitung);
            } else if (Integer.parseInt(currentData.substring(1)) > 9){
                hitung = 1 + Integer.parseInt(currentData.substring(1));
                codePayment = "P" + String.valueOf(hitung);
            }else {
                hitung = 1 + Integer.parseInt(currentData.substring(2));
                codePayment = "P0" + String.valueOf(hitung);
            }
        }
   
        return codePayment;
    }
    
    public String findNameSeller(int index){
        int i = 0;
        String sellerName;
        while (listProduk.get(index).getNimSeller().intern() != listUser.get(i).getNim().intern()) {
            i = i + 1;
        }
        if (listProduk.get(index).getNimSeller().intern() == listUser.get(i).getNim().intern()) {
            sellerName = listUser.get(i).getName();
        } else {
            sellerName = "Tidak ditemukan";
        }
        
        return sellerName;
    }
    
    public int findeIndexProduct(String kode){
        int i = 0;
        while (listProduk.get(i).getProductCode().intern() != kode.intern()) {
            i = i + 1;
        }
        return i; 
    }
    
    
}
