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
public class Fakultas_model {
    private String id_fakultas;
    private String nama;
    private String kode_prodi;

    public Fakultas_model(String id_fakultas, String nama) {
        this.id_fakultas = id_fakultas;
        this.nama = nama;
        this.kode_prodi = kode_prodi;
    }

    public String getId_fakultas() {
        return id_fakultas;
    }

    public void setId_fakultas(String id_fakultas) {
        this.id_fakultas = id_fakultas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKode_prodi() {
        return kode_prodi;
    }

    public void setKode_prodi(String kode_prodi) {
        this.kode_prodi = kode_prodi;
    }
    
    
}
