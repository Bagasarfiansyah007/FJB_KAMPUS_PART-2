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
public class Checkout_model {
    int no = 0;
    private String no_order;
    private int total_harga;

    public int getNo() {
        return no;
    }

    public String getNo_order() {
        return no_order;
    }

    public int getTotal_harga() {
        return total_harga;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setNo_order(String no_order) {
        this.no_order = no_order;
    }

    public void setTotal_harga(int total_harga) {
        this.total_harga = total_harga;
    }
    
    
}
