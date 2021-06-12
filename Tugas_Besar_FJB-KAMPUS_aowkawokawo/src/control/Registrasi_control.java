/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Model.User_model;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.Register_GUI;

/**
 *
 * @author AMS
 */
public class Registrasi_control {
    ArrayList<User_model> user;
    Register_GUI registerForm;
    
    public Registrasi_control(Register_GUI register){
        user = new ArrayList<User_model>();
        this.registerForm = register;
    }
    
    public void isiData(Register_GUI register,String nim, String nama, String fakultas, String noTelpon, String prodi, String Password, int saldo){
        String saldoTxt = String.valueOf(register.getTxtSaldo());
        
        if (register.getTxtNim().isEmpty()){
            JOptionPane.showMessageDialog(null, "Nim masih kosong!",
                "Warning",JOptionPane.WARNING_MESSAGE);
        } else if (register.getTxtNama().isEmpty() || register.getTxtFakultas().isEmpty() || register.getTxtPassword().isEmpty() 
                || register.getTxtProdi().isEmpty() || saldoTxt.isEmpty() || register.getTxtTelphone().isEmpty()) { 
            JOptionPane.showMessageDialog(null, "Ada field yang masih kosong",
                "Warning",JOptionPane.WARNING_MESSAGE);
        } else {
            if (user.isEmpty()) {
                user.add(new User_model(register.getTxtNim(),register.getTxtNama(),register.getTxtFakultas(),
                        register.getTxtTelphone(),register.getTxtProdi(),register.getTxtPassword(),register.getTxtSaldo()));
                JOptionPane.showMessageDialog(null, "sukses memasukan " + user.get(user.size() - 1).getNim(),
                "Suskses",JOptionPane.INFORMATION_MESSAGE);
            } else {
                if (cariData(user,nim) == false) {
                    user.add(new User_model(register.getTxtNim(),register.getTxtNama(),register.getTxtFakultas(),
                        register.getTxtTelphone(),register.getTxtProdi(),register.getTxtPassword(),register.getTxtSaldo()));
                        JOptionPane.showMessageDialog(null, "sukses memasukan " + user.get(user.size() - 1).getNim(),
                        "Suskses",JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Data dengan nim " + user.get(cariDataIndex(user,nim)).getNim() + " sudah ada !",
                        "Warning",JOptionPane.WARNING_MESSAGE);
                }
            }
            
        }
    }
    
    public boolean cariData(ArrayList cari,String nim){
        boolean exist = false;
        int index = 0;
        while (exist == false && index < user.size()){
            if (nim.intern() == user.get(index).getNim()) {
                exist = true;
            }
            index = index + 1;
        }
        
        return exist;
    }
    
    public int cariDataIndex(ArrayList cari,String nim){
        boolean exist = false;
        int index = 0;
        while (exist == false && index < user.size()){
            if (nim.intern() == user.get(index).getNim()) {
                exist = true;
            }
            index = index + 1;
        }
        
        return index;
    }
    
   
}
