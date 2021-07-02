/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Model.UserModel;
import control.LoginControl;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class LogIn_GUITest {
    
    public LogIn_GUITest() {
    }


    @Test
    public void testGetAccount() {
        LogInGUI login = new LogInGUI();
        LoginControl control = new LoginControl();
        List <UserModel> tabel = control.user;
        
        String[] excepted = {"1302194007", "12345"};
        String[] execute = {"1302194007", "12345"};
        String[] actual = findAccountCondition(execute,tabel);
        assertEquals(excepted,actual);
    }
    
    @Test
    public void testGetAccountIndex() {
        LogInGUI login = new LogInGUI();
        LoginControl control = new LoginControl();
        List <UserModel> tabel = control.user;
        
        int excepted = 5;
        int actual = findAccountIndex("1302194007","12345",tabel);
        assertEquals(excepted,actual);
    }
    
    // Funtion
    public String[] findAccountCondition(String[] execute,List <UserModel> list){
        boolean find = false;
        int index = 0;
        String[] accountFind = new String[2];
        while (find == false & index < list.size()){
            if (execute[0].intern() == list.get(index).getNim().intern() 
                && execute[1].intern() == list.get(index).getPaswword().intern()){
                find = true;
                accountFind[0] = list.get(index).getNim().intern();
                accountFind[1] = list.get(index).getPaswword().intern();
            }
            index = index + 1;
        }
        return accountFind;
    }
    
    public int findAccountIndex(String nim,String password,List <UserModel> user){
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
