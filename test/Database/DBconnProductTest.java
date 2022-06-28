
package Database;

import Model.Product;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class DBconnProductTest {
    
    public DBconnProductTest() {
    }


    @Test
    public void testInsertProduk() {
        List<Product> test = DBconnProduct.getDataProduct();
        
        String expect = "B16";
        String actual = test.get(6).getProductCode();
        
        assertEquals(expect, actual);
    }

    @Test
    public void testGetDataProduk() {
        List<Product> test = DBconnProduct.getDataProduct();
        
        String expect = "B01";
        String actual = test.get(0).getProductCode();
        
        assertEquals(expect, actual);
    }

    @Test
    public void testCariProduk() {
        List<Product> test = DBconnProduct.searchProduct("Iphon 20 Pro max +++");
        
        String expect = "Iphon 20 Pro max +++";
        String actual = test.get(0).getProducrName();
        
        assertEquals(expect, actual);
    }

    @Test
    public void testCariProdukKategori() {
        List<Product> test = DBconnProduct.searchProductCategory("Elektronik");
        
        String expect = "Elektronik";
        String actual = test.get(0).getProductCategory();
        
        assertEquals(expect, actual);
    }    
}
