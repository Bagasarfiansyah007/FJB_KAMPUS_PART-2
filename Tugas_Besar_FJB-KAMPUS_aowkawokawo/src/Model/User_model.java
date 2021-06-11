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
public class User_model {

    private String nim;
    private String nama;
    private String fakultas;
    private String noTelpon;
    private String prodi;
    private String Password;
    private int saldo;
    
    // Constructor
    public User_model(String nim, String nama, String fakultas, String noTelpon, String prodi, String Password, int saldo) {
        this.nim = nim;
        this.nama = nama;
        this.fakultas = fakultas;
        this.noTelpon = noTelpon;
        this.prodi = prodi;
        this.Password = Password;
        this.saldo = saldo;
    }
    
    // Setter
    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setNoTelpon(String noTelpon) {
        this.noTelpon = noTelpon;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    
    // Getter
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getFakultas() {
        return fakultas;
    }

    public String getNoTelpon() {
        return noTelpon;
    }

    public String getProdi() {
        return prodi;
    }

    public String getPassword() {
        return Password;
    }

    public int getSaldo() {
        return saldo;
    }
}
