/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Database.DBconnFakultas;
import Database.DBconnProdi;
import Model.UserModel;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.RegisterGUI;
import Database.DBconn_user;
import Model.FakultasModel;
import Model.ProdiModel;
import general.conditionMethod;
import general.dialogMessage;
import java.util.List;
import view.LogInGUI;

/**
 *
 * @author AMS
 */
public class RegistrasiControl {
    public List <UserModel> user;
    public List <FakultasModel> fakultas;
    public List <ProdiModel> prodi;

    RegisterGUI registerForm;
    
    // Constructor
    public RegistrasiControl(RegisterGUI register){
        user = DBconn_user.GetDataUser();
        fakultas = DBconnFakultas.GetDataFakultas() ;
        prodi = DBconnProdi.GetDataProdi();
        this.registerForm = register;
    }

    // Main procedure
    public void isiData(RegisterGUI register){
        if (conditionMethod.isFieldNimEmpty(register)){
            
            dialogMessage.dialogFormWarning("Nim masih kosong!","Warning");
            
        } else if (conditionMethod.isTextFieldEmpty(register)) { 
            
            dialogMessage.dialogFormWarning ("Ada field yang masih kosong","Warning");
            
        } else {
            
            String nim = register.getTxtNim();
            
            if (conditionMethod.isListEmpty(user)) {
                
                DBconn_user.InsertData(register);
                dialogMessage.dialogFormSucsess(("sukses memasukan " + nim),"Suskses");
                
            } else {
                
                conditionMethod.whenDataIsFind(user,nim,this,register);
            
            }
            
        }
    }   
    
    // Function
    public boolean findAccountIsAlreadyExist(List find,String nim){
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
    
    
}
