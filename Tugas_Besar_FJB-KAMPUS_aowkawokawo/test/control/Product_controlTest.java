package control;

import Database.DBconnProduct;
import Model.Product;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import view.PembeliGUI;

/**
 *
 * @author AMS
 */
public class Product_controlTest {
    
    public Product_controlTest() {
    }


    @Test
    public void testCodeInput() {
        ProductControl control = new ProductControl();
        PembeliGUI form = new PembeliGUI(0,null);
        
        String expected = "B18";
        String actual = control.inputKodeProduk("");
        
        assertEquals(expected,actual);
    }

    @Test
    public void testSearchProduct() {
        ProductControl control = new ProductControl();
        
        String expected = "Iphon 20 Pro max +++";
        List <Product> test = DBconnProduct.cariProduk(expected);
        String actual = test.get(0).getNama();
        
        assertEquals(expected,actual);
        
    }
    
    @Test
    public void testSearchProductCategory() {
        ProductControl control = new ProductControl();
        
        String expected = "Elektronik";
        List <Product> test = DBconnProduct.cariProdukKategori("Elektronik");
        String actual = test.get(0).getKategori();
        
        assertEquals(expected,actual);
        
    }

    
}
