/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author AMS
 */
public class UserModel {

    private String nim;
    private String Name;
    private String faculty;
    private String telphoneNumber;
    private String studyProgram;
    private String email;
    private String Paswword;
    private int saldo;
    
    // Constructor
    public UserModel
    (
        String nim, 
        String Name, 
        String faculty, 
        String telphoneNumber, 
        String studyProgram, 
        String email, 
        String Paswword, 
        int saldo
    ) {
        this.nim = nim;
        this.Name = Name;
        this.faculty = faculty;
        this.telphoneNumber = telphoneNumber;
        this.studyProgram = studyProgram;
        this.email = email;
        this.Paswword = Paswword;
        this.saldo = saldo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    
    // Setter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setNoTelphone(String telphoneNumber) {
        this.telphoneNumber = telphoneNumber;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    public void setPaswword(String password) {
        this.Paswword = Paswword;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    // Getter
    public String getNim() {
        return nim;
    }

    public String getName() {
        return Name;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getNoTelphone() {
        return telphoneNumber;
    }

    public String getStudyProgram() {
        return studyProgram;
    }

    public String getPaswword() {
        return Paswword;
    }

    public int getSaldo() {
        return saldo;
    }
}
