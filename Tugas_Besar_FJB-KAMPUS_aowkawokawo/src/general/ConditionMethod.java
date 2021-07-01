/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import Database.DBconnProduk;
import Database.DBconnUser;
import Model.Product;
import Model.UserModel;
import control.ProductControl;
import control.RegistrasiControl;
import java.util.List;
import javax.swing.JOptionPane;
import view.EditProduk;
import view.InputProduk;
import view.LogInGUI;
import view.RegisterGUI;

/**
 *
 * @author AMS
 */
public class ConditionMethod {
    
    // General    
    public static <T> boolean isListEmpty(List <T> list){
        return list.isEmpty();
    }
    
    public static void whenDataIsFind(String cari,ProductControl inputControl,EditProduk inputForm){
        if (!inputControl.findDataCondition(cari)) {
                    
            DialogMessage.dialogFormWarning(("Data dengan kode " + cari + " tidak ada"),"Warning");

        } else {

            DBconnProduk.EditProduk(inputForm,cari);
            DialogMessage.dialogFormSucsess(("sukses mengedit " + cari),"Suskses");
            
        }
    }
    
    public static void whenDataIsFind(List list,String cari,RegistrasiControl inputControl,RegisterGUI inputForm){
        if (!inputControl.findAccountIsAlreadyExist(list,cari)) {
                    
            DBconnUser.InsertData(inputForm);
            DialogMessage.dialogFormSucsess(("sukses memasukan " + cari),"Suskses");
            LogInGUI formLogin = new LogInGUI();
            formLogin.show();
            inputForm.dispose();

        } else {

            DialogMessage.dialogFormWarning(("Data dengan nim " + cari + " Sudah ada"),"Warning");

        }
    }
    
    public static void whenDataIsFind(List <UserModel> listUser,int index,String cari,String nim,ProductControl inputControl,InputProduk inputForm) {
        if (!inputControl.findDataCondition(cari)) {
                    
            nim = listUser.get(index).getNim();
            DBconnProduk.insertProduk(inputForm,cari,nim);
            DialogMessage.dialogFormSucsess(("sukses memasukan " + cari),"Suskses");

        } else {

            DialogMessage.dialogFormWarning(("Data dengan kode " + cari + " Sudah ada"),"Warning");

        }
    }
    
     
    
    // Condition for login form
    public static boolean isAllfieldIsemptyOnlogin(LogInGUI login){
        return login.getUsernameField().isEmpty() && login.getPasswordField().isEmpty();
    }
    
    public static boolean isFieldUsernameEmpty(LogInGUI login){
        return login.getUsernameField().isEmpty();
    }
    
    public static boolean isFieldPasswordEmpty(LogInGUI login){
        return login.getPasswordField().isEmpty();
    }
    
    // Condition for Register form
    public static boolean isFieldNimEmpty (RegisterGUI register){
        return register.getTxtNim().isEmpty();
    }
    
    public static boolean isTextFieldEmpty(RegisterGUI register) {
        return register.getTxtNama().isEmpty() || register.getTxtPassword().isEmpty() || 
                String.valueOf(register.getTxtSaldo()).isEmpty() || register.getTxtTelphone().isEmpty() 
                || register.getTxtEmail().isEmpty();
    }
    
    
    // Condition for Produk Input form
    public static boolean isTextFieldEmpty (InputProduk input){
        return input.getTxtNamaProduk().isEmpty() || input.getTxtHarga().isEmpty() || input.getTxtStok().isEmpty();
    }
    
    public static boolean isTextFieldEmpty (EditProduk input){        
        return input.getTxtNamaProduk().isEmpty() || input.getTxtHarga().isEmpty() || input.getTxtStok().isEmpty();
    }
    
    
    
}
