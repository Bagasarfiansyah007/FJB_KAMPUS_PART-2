package control;

import Database.DBconnProduct;
import Model.Product;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import view.BuyerGUI;

/**
 *
 * @author AMS
 */
public class ProductControlTest {
    
    public ProductControlTest() {
    }


    @Test
    public void testCodeInput() {
        ProductControl control = new ProductControl();
        BuyerGUI form = new BuyerGUI(0,null);
        
        String expected = "B18";
        String actual = control.inputCodeProduct("");
        
        assertEquals(expected,actual);
    }

    @Test
    public void testSearchProduct() {
        ProductControl control = new ProductControl();
        
        String expected = "Iphon 20 Pro max +++";
        List <Product> test = DBconnProduct.searchProduct(expected);
        String actual = test.get(0).getProducrName();
        
        assertEquals(expected,actual);
        
    }
    
    @Test
    public void testSearchProductCategory() {
        ProductControl control = new ProductControl();
        
        String expected = "Elektronik";
        List <Product> test = DBconnProduct.searchProductCategory("Elektronik");
        String actual = test.get(0).getProductCategory();
        
        assertEquals(expected,actual);
        
    }

    
}
