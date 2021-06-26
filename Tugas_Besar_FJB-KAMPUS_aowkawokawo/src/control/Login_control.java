package control;

import Database.DBconn_user;
import Model.User_model;
import java.util.List;
import javax.swing.JOptionPane;
import view.LogInAkun_GUI;
import view.LogIn_GUI;

public class Login_control {
    LogIn_GUI loginForm;
    LogInAkun_GUI menuPilihan;
    public List <User_model> user;
    
    public int indexLogin;
    Registrasi_control registrasiControl;

    public Login_control(LogIn_GUI loginForm){
        user = DBconn_user.GetDataUser();
        this.loginForm = loginForm;
    }
    
    public Login_control(LogInAkun_GUI menuPilihan){
        user = DBconn_user.GetDataUser();
        this.menuPilihan = menuPilihan;
    }
    
    public void cekDataUserLogin (LogIn_GUI login,String nim,String password){
        if (login.getUsernameField().isEmpty() && login.getPasswordField().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Tolong isi field nim dan password",
                "Warning",JOptionPane.WARNING_MESSAGE);
            
        } else if (login.getUsernameField().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tolong isi field nim",
                "Warning",JOptionPane.WARNING_MESSAGE);
        } else if (login.getPasswordField().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Tolong isi field Password",
                "Warning",JOptionPane.WARNING_MESSAGE);
        } else {
            boolean ketemu = false;
            int index = 0;
            while (ketemu == false & index < user.size()){
                if (nim.intern() == user.get(index).getNim().intern() && password.intern() == user.get(index).getPassword().intern()){
                    ketemu = true;
                }
                index = index + 1;
            }
            if (ketemu == true ) {
                JOptionPane.showMessageDialog(null, "sukses Login sebagai " + nim,
                        "Suskses",JOptionPane.INFORMATION_MESSAGE);
                loginForm.dispose();
                LogInAkun_GUI menuHome = new LogInAkun_GUI(index);
                menuHome.show();
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan",
                "Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    
    
    /**public static void main(String[] args) {
        // TODO code application logic here
        
        Login_control myObj = new Login_control();
        
        for(User_model Item : myObj.user){
            System.out.println("Nim      : " + Item.getNim());
            System.out.println("Nama     : " + Item.getNama());
            System.out.println("Fakultas : " + Item.getFakultas());
        }
        
        
        
    }**/
}
