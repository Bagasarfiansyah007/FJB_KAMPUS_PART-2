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
public class CheckoutModel {

    private String idBayar;
    private String idPembeli;
    private String idProduk;
    private String namaPenjual;
    private String namaProduk;
    private int banyakBeli;
    private int harga;

    public CheckoutModel(String idBayar, String idPembeli, String idProduk, String namaPenjual, String namaProduk, int banyakBeli, int harga) {
        this.idBayar = idBayar;
        this.idPembeli = idPembeli;
        this.idProduk = idProduk;
        this.namaPenjual = namaPenjual;
        this.namaProduk = namaProduk;
        this.banyakBeli = banyakBeli;
        this.harga = harga;
    }

    public String getIdBayar() {
        return idBayar;
    }

    public void setIdBayar(String idBayar) {
        this.idBayar = idBayar;
    }

    public String getIdPembeli() {
        return idPembeli;
    }

    public void setIdPembeli(String idPembeli) {
        this.idPembeli = idPembeli;
    }

    public String getIdProduk() {
        return idProduk;
    }

    public void setIdProduk(String idProduk) {
        this.idProduk = idProduk;
    }

    public String getNamaPenjual() {
        return namaPenjual;
    }

    public void setNamaPenjual(String namaPenjual) {
        this.namaPenjual = namaPenjual;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    public int getBanyakBeli() {
        return banyakBeli;
    }

    public void setBanyakBeli(int banyakBeli) {
        this.banyakBeli = banyakBeli;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    
}
