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
public class Product {
    private String kode_product;
    private String nama;
    private String kategori;
    private int harga;

    public Product(String kode_product, String nama, String kategori, int harga) {
        this.kode_product = kode_product;
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
    }

    public String getKode_product() {
        return kode_product;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public int getHarga() {
        return harga;
    }

    public void setKode_product(String kode_product) {
        this.kode_product = kode_product;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    
}
