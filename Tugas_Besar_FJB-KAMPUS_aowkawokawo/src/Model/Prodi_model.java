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
public class Prodi_model {
    private String kode_prodi;
    private String kode_fakultas;
    private String nama_prodi;

    public Prodi_model(String kode_prodi, String kode_fakultas, String nama_prodi) {
        this.kode_prodi = kode_prodi;
        this.kode_fakultas = kode_fakultas;
        this.nama_prodi = nama_prodi;
    }

    public String getKodeProdi() {
        return kode_prodi;
    }

    public void setKodeProdi(String kode_prodi) {
        this.kode_prodi = kode_prodi;
    }

    public String getKodeFakultas() {
        return kode_fakultas;
    }

    public void setKodeFakultas(String kode_fakultas) {
        this.kode_fakultas = kode_fakultas;
    }

    public String getNamaProdi() {
        return nama_prodi;
    }

    public void setNamaProdi(String nama_prodi) {
        this.nama_prodi = nama_prodi;
    }
    
    
}
