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
import Database.DBconn_user;
import Model.Fakultas_model;
import Model.Prodi_model;
import java.util.List;
import view.LogIn_GUI;

/**
 *
 * @author AMS
 */
public class Registrasi_control {
    public List <User_model> user;
    public List <Fakultas_model> fakultas;
    public List <Prodi_model> prodi;

    Register_GUI registerForm;
    
    public Registrasi_control(Register_GUI register){
        user = DBconn_user.GetDataUser();
        fakultas = DBconn_user.GetDataFakultas() ;
        this.registerForm = register;
    }

    public void isiData(Register_GUI register,String nim, String nama, String fakultas, String noTelpon, String prodi, String email, String Password, int saldo){
        if (isNimEmpty(register) == true){
            dialogFormWarning("Nim masih kosong!","Warning");
        } else if (isTextFieldEmpty(register) == true) { 
            dialogFormWarning ("Ada field yang masih kosong","Warning");
        } else {
            if (isListEmpty(user) == true) {
                DBconn_user.InsertData(register);
                dialogFormSucsess(("sukses memasukan " + nim),"Suskses");
            } else {
                if (cariData(user,nim) == false) {
                    DBconn_user.InsertData(register);
                    dialogFormSucsess(("sukses memasukan " + nim),"Suskses");
                } else {
                    dialogFormWarning(("Data dengan nim " + nim + " Sudah ada"),"Warning");
                }
            }
        }
    }   
    
    
    // All Condition 
    public boolean isNimEmpty (Register_GUI register){
        boolean condition;
        if (register.getTxtNim().isEmpty()){
             condition = true;
        } else {
             condition = false;
        }
        
        return condition;
    }
    
    public boolean isTextFieldEmpty(Register_GUI register) {
        boolean condition;
        String saldoTxt = String.valueOf(register.getTxtSaldo());
        
        if (register.getTxtNama().isEmpty() || register.getTxtPassword().isEmpty() 
                || saldoTxt.isEmpty() || register.getTxtTelphone().isEmpty() || register.getTxtEmail().isEmpty()){
             condition = true;
        } else {
             condition = false;
        }
        
        return condition;
    }
    
    public boolean isListEmpty(List <User_model> user){
        boolean condition;
        if (user.isEmpty()){
             condition = true;
        } else {
             condition = false;
        }
        
        return condition;
    }
    
    public boolean cariData(List cari,String nim){
        boolean exist = false;
        int index = 0;
        while (exist == false && index < user.size()){
            if (nim.intern() == user.get(index).getNim().intern()) {
                exist = true;
            }
            index = index + 1;
        }
        
        return exist;
    }
    
    public boolean cariData(List cari,String nim,String password){
        boolean exist = false;
        int index = 0;
        while (exist == false && index < user.size()){
            if (nim.intern() == user.get(index).getNim().intern() && password.intern() == user.get(index).getPassword().intern()) {
                exist = true;
            }
            index = index + 1;
        }
        
        return exist;
    }
    
    // All Function
    public int cariDataIndex(List cari,String nim,String password){
        boolean exist = false;
        int index = 0;
        while (exist == false && index < user.size()){
            if (nim.intern() == user.get(index).getNim().intern() && password.intern() == user.get(index).getPassword().intern()) {
                exist = true;
            }
            index = index + 1;
        }
        
        return index;
    }
    
    // All Procedure
    public void dialogFormWarning (String message,String titel){
        JOptionPane.showMessageDialog(null, message,
                titel,JOptionPane.WARNING_MESSAGE);
    }
    
    public void dialogFormSucsess (String message,String titel){
        JOptionPane.showMessageDialog(null, message,
                titel,JOptionPane.INFORMATION_MESSAGE);
    }
    
    
}
