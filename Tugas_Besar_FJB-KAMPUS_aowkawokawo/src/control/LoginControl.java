package control;

import Database.DBconn_user;
import Model.UserModel;
import general.conditionMethod;
import general.dialogMessage;
import java.util.List;
import javax.swing.JOptionPane;
import view.LogInAkunGUI;
import view.LogInGUI;

public class LoginControl <T>{
    
    // Atribute
    T form;
    public List <UserModel> user;
    public int indexLogin;
    RegistrasiControl registrasiControl;

    // Constructor
    public LoginControl(T form){
        user = DBconn_user.GetDataUser();
        this.form = form;
    }
    
    public LoginControl(){
        user = DBconn_user.GetDataUser();
        this.form = form;
    }
    
    // Main procedure
    public void cekDataUserLogin (LogInGUI login,String nim,String password){
        if (conditionMethod.isAllfieldIsemptyOnlogin(login) == true){
            
            dialogMessage.dialogFormWarning("Tolong isi field nim dan password", "Warning");
            
        } else if (conditionMethod.isFieldUsernameEmpty(login) == true) {
            
            dialogMessage.dialogFormWarning("Tolong isi field nim", "Warning");
            
        } else if (conditionMethod.isFieldPasswordEmpty(login) == true) {
            
            dialogMessage.dialogFormWarning("Tolong isi field Password", "Warning");
            
        } else {
            
            boolean find = findAccountCondition(nim,password);
            int index = findAccountIndex(nim,password);
            
            if (find == true ) {
           
                dialogMessage.dialogFormSucsess("sukses Login sebagai " + nim, "Suskses");
                LogInAkunGUI menuHome = new LogInAkunGUI(index);
                login.dispose();
                menuHome.show();
                
            } else {
                
                dialogMessage.dialogFormWarning("Data tidak ditemukan","Warning");
                
            }
        }
    }
    
    // Function
    public boolean findAccountCondition(String nim,String password){
        boolean find = false;
        int index = 0;
        while (find == false & index < user.size()){
            if (nim.intern() == user.get(index).getNim().intern() && password.intern() == user.get(index).getPassword().intern()){
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
            if (nim.intern() == user.get(index).getNim().intern() && password.intern() == user.get(index).getPassword().intern()){
                find = true;
            }
            index = index + 1;
        }
        return index;
    }
}
