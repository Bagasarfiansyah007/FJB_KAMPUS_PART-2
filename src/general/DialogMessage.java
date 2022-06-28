/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general;

import javax.swing.JOptionPane;

/**
 *
 * @author AMS
 */
public class DialogMessage {
    
    // Diaolog message;
    public static void dialogFormWarning (String message,String title){
        JOptionPane.showMessageDialog(null, message,
                title,JOptionPane.WARNING_MESSAGE);
    }
    
    public static void dialogFormSucsess (String message,String title){
        JOptionPane.showMessageDialog(null, message,
                title,JOptionPane.INFORMATION_MESSAGE);
    }
    
}
