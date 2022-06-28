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
    private String productCode;
    private String nimSeller;
    private String nameProduct;
    private String categoryProduct;
    private int price;
    private int stok;

    public Product(String productCode,String nimSeller,String nameProduct, String categoryProduct,int stok ,int price) {
        this.productCode = productCode;
        this.nimSeller = nimSeller;
        this.nameProduct = nameProduct;
        this.categoryProduct = categoryProduct;
        this.stok = stok;
        this.price = price;
    }

    public String getNimSeller() {
        return nimSeller;
    }

    public int getStok() {
        return stok;
    }
    
    public String getProductCode() {
        return productCode;
    }

    public String getProducrName() {
        return nameProduct;
    }

    public String getProductCategory() {
        return categoryProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setNimSeller(String nimSeller) {
        this.nimSeller = nimSeller;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
    
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProducrName(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void setProductCategory(String categoryProduct) {
        this.categoryProduct = categoryProduct;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
