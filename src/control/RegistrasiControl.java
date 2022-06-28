/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Database.DBconnFaculty;
import Database.DBconnStudyProgram;
import Model.UserModel;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.RegisterGUI;
import Database.DBconnUser;
import Model.FacultyModel;
import Model.StudyProgramModel;
import general.ConditionMethod;
import general.DialogMessage;
import java.util.List;
import view.LogInGUI;

/**
 *
 * @author AMS
 */
public class RegistrasiControl {
    public List <UserModel> user;
    public List <FacultyModel> fakultas;
    public List <StudyProgramModel> prodi;

    RegisterGUI registerForm;
    
    // Constructor
    public RegistrasiControl(RegisterGUI register){
        user = DBconnUser.getDataUser();
        fakultas = DBconnFaculty.getDataFakultas();
        prodi = DBconnStudyProgram.getDataStudyProgram();
        this.registerForm = register;
    }

    // Main procedure
    public void isiData(RegisterGUI register){
        if (ConditionMethod.isFieldNimEmpty(register)){
            
            DialogMessage.dialogFormWarning("Nim masih kosong!","Warning");
            
        } else if (ConditionMethod.isTextFieldEmpty(register)) { 
            
            DialogMessage.dialogFormWarning ("Ada field yang masih kosong","Warning");
            
        } else {
            
            String nim = register.getTxtNim();
            
            if (ConditionMethod.isListEmpty(user)) {
                
                DBconnUser.insertData(register);
                DialogMessage.dialogFormSucsess(("sukses memasukan " + nim),"Suskses");
                
            } else {
                
                ConditionMethod.whenDataIsFind(user,nim,this,register);
            
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
