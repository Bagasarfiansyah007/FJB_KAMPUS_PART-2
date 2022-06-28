package Model;

/**
 *
 * @author AMS
 */
public class CheckoutModel {

    private String idPayment;
    private String nimPayment;
    private String idProduct;
    private String nameSeller;
    private String nameProduct;
    private int totalProductBuy;
    private int Price;

    public CheckoutModel(String idPayment, String nimPayment, String idProduct, String nameSeller, String nameProduct, int totalProductBuy, int Price) {
        this.idPayment = idPayment;
        this.nimPayment = nimPayment;
        this.idProduct = idProduct;
        this.nameSeller = nameSeller;
        this.nameProduct = nameProduct;
        this.totalProductBuy = totalProductBuy;
        this.Price = Price;
    }

    public String getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(String idPayment) {
        this.idPayment = idPayment;
    }

    public String getNimPayment() {
        return nimPayment;
    }

    public void setNimPayment(String nimPayment) {
        this.nimPayment = nimPayment;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameSeller() {
        return nameSeller;
    }

    public void setNameSeller(String nameSeller) {
        this.nameSeller = nameSeller;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getTotalProductBuy() {
        return totalProductBuy;
    }

    public void setTotalProductBuy(int totalProductBuy) {
        this.totalProductBuy = totalProductBuy;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }
    
    
}
