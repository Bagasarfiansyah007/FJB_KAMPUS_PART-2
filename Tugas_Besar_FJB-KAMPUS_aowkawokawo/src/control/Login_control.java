package control;

import Model.User_model;
import java.util.ArrayList;
import static java.util.Collections.list;
import view.Login_GUI;

public class Login_control {
    public ArrayList<User_model> user;
    public Login_GUI formLogin;
    
    public Login_control(){
      
        formLogin = new Login_GUI(this);
        formLogin.show();
    }
    
     public void Login(String nim, String password){
     
     }
}
