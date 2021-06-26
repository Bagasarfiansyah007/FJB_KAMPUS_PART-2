package control;

import Database.DBconn_fakultas;
import Database.DBconn_prodi;
import Database.DBconn_produk;
import Database.DBconn_user;
import Model.Product;
import Model.User_model;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import view.DaftarBarang;
import view.EditProduk;
import view.InputProduk;
import view.Pembeli_GUI;
import view.Register_GUI;

public class Product_control {
    public List <Product> listProduk;
    public List <Product> listProdukCari;
    public List <User_model> listUser;
    
    DaftarBarang formDaftaBarang;
    InputProduk formInputProduk;
    Pembeli_GUI formMenuPembeli;
    EditProduk formEditProduk;
    
    // Constructor
    public Product_control(DaftarBarang formDaftaBarang){
        listProduk = DBconn_produk.GetDataProduk();
        listUser = DBconn_user.GetDataUser();
        this.formDaftaBarang = formDaftaBarang;
    }
    
    public Product_control(InputProduk formInputProduk){
        listProduk = DBconn_produk.GetDataProduk();
        listUser = DBconn_user.GetDataUser();
        this.formInputProduk = formInputProduk;
    }
    
    public Product_control(EditProduk formEditProduk){
        listProduk = DBconn_produk.GetDataProduk();
        listUser = DBconn_user.GetDataUser();
        this.formEditProduk = formEditProduk;
    }
    
    public Product_control(Pembeli_GUI formMenuPembeli){
        listProduk = DBconn_produk.GetDataProduk();
        this.formMenuPembeli = formMenuPembeli;
    }

    // Function & Procedure
    public void GetDataProduk(DaftarBarang formDaftaBarang,int index){
        formDaftaBarang.modelTable.getDataVector().removeAllElements();
        formDaftaBarang.modelTable.fireTableDataChanged();
        
        try{
           Object[] obj = new Object[5];
           for (int i = 0 ; i < listProduk.size();i++){
               if (listProduk.get(i).getNim().intern() == listUser.get(index).getNim().intern()) {
                   obj[0] = listProduk.get(i).getKode_product();
                   obj[1] = listProduk.get(i).getNama();
                   obj[2] = listProduk.get(i).getKategori();
                   obj[3] = listProduk.get(i).getStok();
                   obj[4] = listProduk.get(i).getHarga();
                   formDaftaBarang.modelTable.addRow(obj);
               }
           }
        }catch(Exception e){
            System.out.println("Data Kosong dan belum masuk");
            dialogFormWarning("Data Kosong dan belum masuk","warning");
        }
    }
    
    public void GetDataProduk(Pembeli_GUI pembeli){
        pembeli.modelTable.getDataVector().removeAllElements();
        pembeli.modelTable.fireTableDataChanged();
        
        try{
           Object[] obj = new Object[5];
           for (int i = 0 ; i < listProduk.size();i++){
               obj[0] = listProduk.get(i).getKode_product();
               obj[1] = listProduk.get(i).getNama();
               obj[2] = listProduk.get(i).getKategori();
               obj[3] = listProduk.get(i).getStok();
               obj[4] = listProduk.get(i).getHarga();
               pembeli.modelTable.addRow(obj);
           }
        }catch(Exception e){
            System.out.println("Data Kosong dan belum masuk");
            dialogFormWarning("Data Kosong dan belum masuk","warning");
        }
    }
    
    public void cariBarang(Pembeli_GUI pembeli,String nama){
        pembeli.modelTable.getDataVector().removeAllElements();
        pembeli.modelTable.fireTableDataChanged();
        
        try{
           listProdukCari = DBconn_produk.cariProduk(nama);
           Object[] obj = new Object[5];
           for (int i = 0 ; i < listProdukCari.size();i++){
               obj[0] = listProdukCari.get(i).getKode_product();
               obj[1] = listProdukCari.get(i).getNama();
               obj[2] = listProdukCari.get(i).getKategori();
               obj[3] = listProdukCari.get(i).getStok();
               obj[4] = listProdukCari.get(i).getHarga();
               pembeli.modelTable.addRow(obj);
           }
                
        }catch(Exception e){
            System.out.println("Data Kosong dan belum masuk");
            dialogFormWarning("Data Kosong dan belum masuk","warning");
        }
    }
    
    public void cariBarangKategori(Pembeli_GUI pembeli,String nama){
        pembeli.modelTable.getDataVector().removeAllElements();
        pembeli.modelTable.fireTableDataChanged();
        
        try{
           listProdukCari = DBconn_produk.cariProdukKategori(nama);
           Object[] obj = new Object[5];
           for (int i = 0 ; i < listProdukCari.size();i++){
               obj[0] = listProdukCari.get(i).getKode_product();
               obj[1] = listProdukCari.get(i).getNama();
               obj[2] = listProdukCari.get(i).getKategori();
               obj[3] = listProdukCari.get(i).getStok();
               obj[4] = listProdukCari.get(i).getHarga();
               pembeli.modelTable.addRow(obj);
           }
                
        }catch(Exception e){
            System.out.println("Data Kosong dan belum masuk");
            dialogFormWarning("Data Kosong dan belum masuk","warning");
        }
    }
    
    public void isiDataBarang(InputProduk input,int index){
        String kodeProduk = "";
        
        if (isFieldEmpty(input) == true) { 
            dialogFormWarning ("Ada field yang masih kosong","Warning");
        } else {
            if (isListEmpty(listProduk) == true) {
                inputKodeProduk(kodeProduk);
                DBconn_produk.insertProduk(input,kodeProduk,listUser.get(index).getNim());
                dialogFormSucsess(("sukses memasukan " + kodeProduk),"Suskses");
            } else {
                kodeProduk = inputKodeProduk(kodeProduk);
                if (cariData(listProduk,kodeProduk) == false) {
                    DBconn_produk.insertProduk(input,kodeProduk,listUser.get(index).getNim());
                    dialogFormSucsess(("sukses memasukan " + kodeProduk),"Suskses");
                } else {
                    dialogFormWarning(("Data dengan kode " + kodeProduk + " Sudah ada"),"Warning");
                }
            }
        }
    }
    
    public void EditDataBarang(EditProduk input,int index){
        String kodeProduk = "";
        
        if (isFieldEmpty(input) == true) { 
            dialogFormWarning ("Ada field yang masih kosong","Warning");
        } else {
            if (isListEmpty(listProduk) == true) {
                kodeProduk = listProduk.get(index).getKode_product();
                DBconn_produk.EditProduk(input,kodeProduk);
                dialogFormSucsess(("sukses memasukan " + kodeProduk),"Suskses");
            } else {
                kodeProduk = listProduk.get(index).getKode_product();
                if (cariData(listProduk,kodeProduk) == false) {
                    dialogFormWarning(("Data dengan kode " + kodeProduk + " tidak ada"),"Warning");
                } else {
                    DBconn_produk.EditProduk(input,kodeProduk);
                    dialogFormSucsess(("sukses mengedit " + kodeProduk),"Suskses");
                }
            }
        }
    }
    
    public boolean cariData(List cari,String kodeProduk){
        boolean exist = false;
        int index = 0;
        while (exist == false && index < listProduk.size()){
            if (kodeProduk.intern() == listProduk.get(index).getKode_product().intern()) {
                exist = true;
            }
            index = index + 1;
        }
        
        return exist;
    }
    
    public int cariDataIndex(String kodeProduk){
        boolean exist = false;
        int index = 0;
        while (exist == false && index < listProduk.size()){
            if (kodeProduk.intern() == listProduk.get(index).getKode_product().intern()) {
                exist = true;
            }
            index = index + 1;
        }
        
        return index;
    }
    
    public String inputKodeProduk (String kodeProduk){
        String currentData = listProduk.get(listProduk.size()-1).getKode_product();
        int hitung = 1 + Integer.parseInt(currentData.substring(2));
        kodeProduk = "B000" + String.valueOf(hitung);
        
        return kodeProduk;
    }
    
    // All Condition
    public boolean isFieldEmpty (InputProduk input){
        boolean condition;
        if (input.getTxtNamaProduk().isEmpty() || input.getTxtHarga().isEmpty() || input.getTxtStok().isEmpty()){
             condition = true;
        } else {
             condition = false;
        }
        
        return condition;
    }
    
    public boolean isFieldEmpty (EditProduk input){
        boolean condition;
        if (input.getTxtNamaProduk().isEmpty() || input.getTxtHarga().isEmpty() || input.getTxtStok().isEmpty()){
             condition = true;
        } else {
             condition = false;
        }
        
        return condition;
    }
    
    public boolean isListEmpty(List <Product> produk){
        boolean condition;
        if (produk.isEmpty()){
             condition = true;
        } else {
             condition = false;
        }
        
        return condition;
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
