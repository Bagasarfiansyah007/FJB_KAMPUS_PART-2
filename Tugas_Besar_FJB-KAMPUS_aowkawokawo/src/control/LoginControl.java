package control;

import Database.DBconnUser;
import Model.UserModel;
import general.ConditionMethod;
import general.DialogMessage;
import java.util.List;
import javax.swing.JOptionPane;
import view.MenuLogin;
import view.LogInGUI;

public class LoginControl <T>{
    
    // Atribute
    T form;
    public List <UserModel> user;
    public int indexLogin;
    RegistrasiControl registrasiControl;

    // Constructor
    public LoginControl(T form){
        user = DBconnUser.getDataUser();
        this.form = form;
    }
    
    public LoginControl(){
        user = DBconnUser.getDataUser();
        this.form = form;
    }
    
    // Main procedure
    public void findDataUserLogin (LogInGUI login,String nim,String password){
        if (ConditionMethod.isAllfieldIsemptyOnlogin(login) == true){
            
            DialogMessage.dialogFormWarning("Tolong isi field nim dan password", "Warning");
            
        } else if (ConditionMethod.isFieldUsernameEmpty(login) == true) {
            
            DialogMessage.dialogFormWarning("Tolong isi field nim", "Warning");
            
        } else if (ConditionMethod.isFieldPasswordEmpty(login) == true) {
            
            DialogMessage.dialogFormWarning("Tolong isi field Password", "Warning");
            
        } else {
            
            boolean find = findAccountCondition(nim,password);
            int index = findAccountIndex(nim,password);
            
            if (find == true ) {
           
                DialogMessage.dialogFormSucsess("sukses Login sebagai " + nim, "Suskses");
                MenuLogin menuHome = new MenuLogin(index);
                login.dispose();
                menuHome.show();
                
            } else {
                
                DialogMessage.dialogFormWarning("Data tidak ditemukan","Warning");
                
            }
        }
    }
    
    // Function
    public boolean findAccountCondition(String nim,String password){
        boolean find = false;
        int index = 0;
        while (find == false & index < user.size()){
            if (nim.intern() == user.get(index).getNim().intern() && 
                password.intern() == user.get(index).getPaswword().intern()){
                find = true;
            }
            index = index + 1;
        }
        return find;
    }
    
    public int findAccountIndex(String nim,String password){
        boolean find = false;
        int index = 0;
        while (find == false & index < user.size()){
            if (nim.intern() == user.get(index).getNim().intern() 
                && password.intern() == user.get(index).getPaswword().intern()){
                find = true;
            }
            index = index + 1;
        }
        return index;
    }
}
