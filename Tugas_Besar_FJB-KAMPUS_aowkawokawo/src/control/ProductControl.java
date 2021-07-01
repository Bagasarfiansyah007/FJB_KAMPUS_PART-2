package control;

import Database.DBconnFaculty;
import Database.DBconnStudyProgram;
import Database.DBconnProduct;
import Database.DBconnUser;
import Model.Product;
import Model.UserModel;
import general.ConditionMethod;
import general.DialogMessage;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import view.ListOfStuff;
import view.EditProduct;
import view.InputProduct;
import view.BuyerGUI;
import view.RegisterGUI;

public class ProductControl <T>{
    
    // Atribut
    public List <Product> listProduk;
    public List <Product> listProdukCari;
    public List <UserModel> listUser;
    T form;
    
    
    // Constructor
    public ProductControl(T form){
        listProduk = DBconnProduct.GetDataProduk();
        listUser = DBconnUser.GetDataUser();
        this.form = form;
    }
    
    public ProductControl(){
        listProduk = DBconnProduct.GetDataProduk();
        listUser = DBconnUser.GetDataUser();
        this.form = form;
    }
    

    
    // Main Procedure
    public void GetDataProduk(ListOfStuff formDaftaBarang,int index){
        formDaftaBarang.modelTable.getDataVector().removeAllElements();
        formDaftaBarang.modelTable.fireTableDataChanged();
        
        try{
            
           Object[] tabel = new Object[5];
           inputDataTable (formDaftaBarang,listProduk,listUser,tabel,index);
        
        }catch(Exception e){
            DialogMessage.dialogFormWarning("Data Kosong dan belum masuk","warning");
        }
    }
    
    public void GetDataProduk(BuyerGUI pembeli){
        pembeli.modelTable.getDataVector().removeAllElements();
        pembeli.modelTable.fireTableDataChanged();
        
        try{
            
           Object[] tabel = new Object[5];
           inputDataTable (pembeli,listProduk,tabel);

        }catch(Exception e){
            DialogMessage.dialogFormWarning("Data Kosong dan belum masuk","warning");
        }
    }
    
    public void searchProduct(BuyerGUI pembeli,String nama){
        pembeli.modelTable.getDataVector().removeAllElements();
        pembeli.modelTable.fireTableDataChanged();
        
        try{
            
           listProdukCari = DBconnProduct.cariProduk(nama);
           Object[] tabel = new Object[5];
           inputDataTable (pembeli,listProdukCari,tabel);
                
        }catch(Exception e){
            DialogMessage.dialogFormWarning("Data Kosong dan belum masuk","warning");
        }
    }
    
    public void searchProductCategory(BuyerGUI pembeli,String nama){
        pembeli.modelTable.getDataVector().removeAllElements();
        pembeli.modelTable.fireTableDataChanged();
        
        try{
            
           listProdukCari = DBconnProduct.cariProdukKategori(nama);
           Object[] tabel = new Object[5];
           inputDataTable (pembeli,listProdukCari,tabel);
                
        }catch(Exception e){
            System.out.println("Data Kosong dan belum masuk");
            DialogMessage.dialogFormWarning("Data Kosong dan belum masuk","warning");
        }
    }
    
    public void inputProductData(InputProduct input,int index){
        String kodeProduk = "";
        String nim = "";
        
        if (ConditionMethod.isTextFieldEmpty(input) == true) {
            
            DialogMessage.dialogFormWarning ("Ada field yang masih kosong","Warning");
        
        } else {
            
            if (ConditionMethod.isListEmpty(listProduk) == true) {
                
                kodeProduk = inputKodeProduk(kodeProduk);
                nim = listUser.get(index).getNim();
                DBconnProduct.insertProduk(input,kodeProduk,nim);
                DialogMessage.dialogFormSucsess(("sukses memasukan " + kodeProduk),"Suskses");
            
            } else {
                
                kodeProduk = inputKodeProduk(kodeProduk);
                ConditionMethod.whenDataIsFind(listUser,index,kodeProduk,nim,this,input);
                
            }
        }
    }
    
    public void EditDataBarang(EditProduct input,int index){
        String kodeProduk = "";
        
        if (ConditionMethod.isTextFieldEmpty(input) == true) { 
            
            DialogMessage.dialogFormWarning ("Ada field yang masih kosong","Warning");
            
        } else {
            if (ConditionMethod.isListEmpty(listProduk) == true) {
                
                kodeProduk = listProduk.get(index).getKode_product();
                DBconnProduct.EditProduk(input,kodeProduk);
                DialogMessage.dialogFormSucsess(("sukses memasukan " + kodeProduk),"Suskses");
                
            } else {
                
                kodeProduk = listProduk.get(index).getKode_product();
                ConditionMethod.whenDataIsFind(kodeProduk,this,input);
                
            }
        }
    }
    
    public void deleteProductData(ListOfStuff form,int index) {
        String kodeProduk = "";
        kodeProduk = form.modelTable.getValueAt(form.getTableProduk().getSelectedRow(),0).toString();
        if (findDataCondition(kodeProduk) == false) {
            DialogMessage.dialogFormWarning(("Data dengan kode " + kodeProduk + " tidak ada"),"Warning");
        } else {
            DBconnProduct.deleteData(kodeProduk);
            form.getDialogShow().dispose();
            listProduk = DBconnProduct.GetDataProduk();
            GetDataProduk(form,index);
            DialogMessage.dialogFormSucsess(("sukses menghapus " + kodeProduk),"Suskses");
        }
    }
    
    
    
    // Function & Procedure
    
    public void inputDataTable (ListOfStuff form,List <Product> list,List <UserModel> list2,Object[] tabel,int index) {
        for (int i = 0 ; i < list.size();i++){
           if (list.get(i).getNim().intern() == list2.get(index).getNim().intern()) {
               tabel[0] = list.get(i).getKode_product();
               tabel[1] = list.get(i).getNama();
               tabel[2] = list.get(i).getKategori();
               tabel[3] = list.get(i).getStok();
               tabel[4] = list.get(i).getHarga();
               form.modelTable.addRow(tabel);
           }
        }
    }
    
    public void inputDataTable (BuyerGUI form,List <Product> list,Object[] tabel) {
        for (int i = 0 ; i < list.size();i++){
           tabel[0] = list.get(i).getKode_product();
           tabel[1] = list.get(i).getNama();
           tabel[2] = list.get(i).getKategori();
           tabel[3] = list.get(i).getStok();
           tabel[4] = list.get(i).getHarga();
           form.modelTable.addRow(tabel);
        }
    }
  
    public String inputKodeProduk (String kodeProduk){
        String currentData = listProduk.get(listProduk.size()-1).getKode_product();
        int hitung;
        if (Integer.parseInt(currentData.substring(2)) == 9) {
            hitung = 1 + Integer.parseInt(currentData.substring(1));
            kodeProduk = "B" + String.valueOf(hitung);
        } else if (Integer.parseInt(currentData.substring(1)) > 9){
            hitung = 1 + Integer.parseInt(currentData.substring(1));
            kodeProduk = "B" + String.valueOf(hitung);
        }else {
            hitung = 1 + Integer.parseInt(currentData.substring(2));
            kodeProduk = "B0" + String.valueOf(hitung);
        }

        return kodeProduk;
    }
    
    public int findDatatIndex(String kodeProduk){
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
    
    public boolean findDataCondition(String kodeProduk){
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

}
