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
    public List <Product> listProduct;
    public List <Product> listProductSearch;
    public List <UserModel> listUser;
    T form;
    
    
    // Constructor
    public ProductControl(T form){
        listProduct = DBconnProduct.getDataProduct();
        listUser = DBconnUser.getDataUser();
        this.form = form;
    }
    
    public ProductControl(){
        listProduct = DBconnProduct.getDataProduct();
        listUser = DBconnUser.getDataUser();
        this.form = form;
    }
    

    
    // Main Procedure
    public void getDataProduct(ListOfStuff formDaftaBarang,int index){
        formDaftaBarang.modelTable.getDataVector().removeAllElements();
        formDaftaBarang.modelTable.fireTableDataChanged();
        
        try{
            
           Object[] tabel = new Object[5];
           inputDataTable (formDaftaBarang,listProduct,listUser,tabel,index);
        
        }catch(Exception e){
            DialogMessage.dialogFormWarning("Data Kosong dan belum masuk","warning");
        }
    }
    
    public void getDataProduct(BuyerGUI buyyer){
        buyyer.modelTable.getDataVector().removeAllElements();
        buyyer.modelTable.fireTableDataChanged();
        
        try{
            
           Object[] tabel = new Object[5];
           inputDataTable (buyyer,listProduct,tabel);

        }catch(Exception e){
            DialogMessage.dialogFormWarning("Data Kosong dan belum masuk","warning");
        }
    }
    
    public void searchProduct(BuyerGUI buyyer,String name){
        buyyer.modelTable.getDataVector().removeAllElements();
        buyyer.modelTable.fireTableDataChanged();
        
        try{
            
           listProductSearch = DBconnProduct.searchProduct(name);
           Object[] tabel = new Object[5];
           inputDataTable (buyyer,listProductSearch,tabel);
                
        }catch(Exception e){
            DialogMessage.dialogFormWarning("Data Kosong dan belum masuk","warning");
        }
    }
    
    public void searchProductCategory(BuyerGUI buyyer,String name){
        buyyer.modelTable.getDataVector().removeAllElements();
        buyyer.modelTable.fireTableDataChanged();
        
        try{
            
           listProductSearch = DBconnProduct.searchProductCategory(name);
           Object[] tabel = new Object[5];
           inputDataTable (buyyer,listProductSearch,tabel);
                
        }catch(Exception e){
            System.out.println("Data Kosong dan belum masuk");
            DialogMessage.dialogFormWarning("Data Kosong dan belum masuk","warning");
        }
    }
    
    public void inputProductData(InputProduct input,int index){
        String codeProduct = "";
        String nim = "";
        
        if (ConditionMethod.isTextFieldEmpty(input) == true) {
            
            DialogMessage.dialogFormWarning ("Ada field yang masih kosong","Warning");
        
        } else {
            
            if (ConditionMethod.isListEmpty(listProduct) == true) {
                
                codeProduct = inputCodeProduct(codeProduct);
                nim = listUser.get(index).getNim();
                DBconnProduct.insertProduk(input,codeProduct,nim);
                DialogMessage.dialogFormSucsess(("sukses memasukan " + codeProduct),"Suskses");
            
            } else {
                
                codeProduct = (codeProduct);
                ConditionMethod.whenDataIsFind(listUser,index,codeProduct,nim,this,input);
                
            }
        }
    }
    
    public void editDataProduct(EditProduct input,int index){
        String codeProduct = "";
        
        if (ConditionMethod.isTextFieldEmpty(input) == true) { 
            
            DialogMessage.dialogFormWarning ("Ada field yang masih kosong","Warning");
            
        } else {
            if (ConditionMethod.isListEmpty(listProduct) == true) {
                
                codeProduct = listProduct.get(index).getProductCode();
                DBconnProduct.editProduct(input,codeProduct);
                DialogMessage.dialogFormSucsess(("sukses memasukan " + codeProduct),"Suskses");
                
            } else {
                
                codeProduct = listProduct.get(index).getProductCode();
                ConditionMethod.whenDataIsFind(codeProduct,this,input);
                
            }
        }
    }
    
    public void deleteProductData(ListOfStuff form,int index) {
        String codeProduct = "";
        codeProduct = form.modelTable.getValueAt(form.getTableProduct().getSelectedRow(),0).toString();
        if (findDataCondition(codeProduct) == false) {
            DialogMessage.dialogFormWarning(("Data dengan kode " + codeProduct + " tidak ada"),"Warning");
        } else {
            DBconnProduct.deleteData(codeProduct);
            form.getDialogShow().dispose();
            listProduct = DBconnProduct.getDataProduct();
            getDataProduct(form,index);
            DialogMessage.dialogFormSucsess(("sukses menghapus " + codeProduct),"Suskses");
        }
    }
    
    
    
    // Function & Procedure
    
    public void inputDataTable (ListOfStuff form,List <Product> list,List <UserModel> list2,Object[] tabel,int index) {
        for (int i = 0 ; i < list.size();i++){
           if (list.get(i).getNimSeller().intern() == list2.get(index).getNim().intern()) {
               tabel[0] = list.get(i).getProductCode();
               tabel[1] = list.get(i).getProducrName();
               tabel[2] = list.get(i).getProductCategory();
               tabel[3] = list.get(i).getStok();
               tabel[4] = list.get(i).getPrice();
               form.modelTable.addRow(tabel);
           }
        }
    }
    
    public void inputDataTable (BuyerGUI form,List <Product> list,Object[] tabel) {
        for (int i = 0 ; i < list.size();i++){
           tabel[0] = list.get(i).getProductCode();
           tabel[1] = list.get(i).getProducrName();
           tabel[2] = list.get(i).getProductCategory();
           tabel[3] = list.get(i).getStok();
           tabel[4] = list.get(i).getPrice();
           form.modelTable.addRow(tabel);
        }
    }
  
    public String inputCodeProduct (String codeProduct){
        String currentData = listProduct.get(listProduct.size()-1).getProductCode();
        int hitung;
        if (Integer.parseInt(currentData.substring(2)) == 9) {
            hitung = 1 + Integer.parseInt(currentData.substring(1));
            codeProduct = "B" + String.valueOf(hitung);
        } else if (Integer.parseInt(currentData.substring(1)) > 9){
            hitung = 1 + Integer.parseInt(currentData.substring(1));
            codeProduct = "B" + String.valueOf(hitung);
        }else {
            hitung = 1 + Integer.parseInt(currentData.substring(2));
            codeProduct = "B0" + String.valueOf(hitung);
        }

        return codeProduct;
    }
    
    public int findDatatIndex(String codeProduct){
        boolean exist = false;
        int index = 0;
        while (exist == false && index < listProduct.size()){
            if (codeProduct.intern() == listProduct.get(index).getProductCode().intern()) {
                exist = true;
            }
            index = index + 1;
        }
        
        return index;
    }
    
    public boolean findDataCondition(String codeProduct){
        boolean exist = false;
        int index = 0;
        while (exist == false && index < listProduct.size()){
            if (codeProduct.intern() == listProduct.get(index).getProductCode().intern()) {
                exist = true;
            }
            index = index + 1;
        }
        
        return exist;
    }

}
