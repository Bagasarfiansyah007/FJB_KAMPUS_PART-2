/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import Database.DBconnProduct;
import Database.DBconnUser;
import Model.Product;
import Model.UserModel;
import control.ProductControl;
import control.RegistrasiControl;
import java.util.List;
import javax.swing.JOptionPane;
import view.EditProduct;
import view.InputProduct;
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
    
    public static void whenDataIsFind(String find,ProductControl inputControl,EditProduct inputForm){
        if (!inputControl.findDataCondition(find)) {
                    
            DialogMessage.dialogFormWarning(("Data dengan kode " + find + " tidak ada"),"Warning");

        } else {

            DBconnProduct.editProduct(inputForm,find);
            DialogMessage.dialogFormSucsess(("sukses mengedit " + find),"Suskses");
            
        }
    }
    
    public static void whenDataIsFind(List list,String find,RegistrasiControl inputControl,RegisterGUI inputForm){
        if (!inputControl.findAccountIsAlreadyExist(list,find)) {
                    
            DBconnUser.insertData(inputForm);
            DialogMessage.dialogFormSucsess(("sukses memasukan " + find),"Suskses");
            LogInGUI formLogin = new LogInGUI();
            formLogin.show();
            inputForm.dispose();

        } else {

            DialogMessage.dialogFormWarning(("Data dengan nim " + find + " Sudah ada"),"Warning");

        }
    }
    
    public static void whenDataIsFind(List <UserModel> listUser,int index,String find,String nim,ProductControl inputControl,InputProduct inputForm) {
        if (!inputControl.findDataCondition(find)) {
                    
            nim = listUser.get(index).getNim();
            DBconnProduct.insertProduk(inputForm,find,nim);
            DialogMessage.dialogFormSucsess(("sukses memasukan " + find),"Suskses");

        } else {

            DialogMessage.dialogFormWarning(("Data dengan kode " + find + " Sudah ada"),"Warning");

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
        return register.getTxtName().isEmpty() || register.getTxtPassword().isEmpty() || 
                String.valueOf(register.getTxtSaldo()).isEmpty() || register.getTxtTelphone().isEmpty() 
                || register.getTxtEmail().isEmpty();
    }
    
    
    // Condition for Produk Input form
    public static boolean isTextFieldEmpty (InputProduct input){
        return input.getTxtNameProduct().isEmpty() || input.getTxtPrice().isEmpty() || input.getTxtStok().isEmpty();
    }
    
    public static boolean isTextFieldEmpty (EditProduct input){        
        return input.getTxtNamaProduk().isEmpty() || input.getTxtHarga().isEmpty() || input.getTxtStok().isEmpty();
    }
    
    
    
}
