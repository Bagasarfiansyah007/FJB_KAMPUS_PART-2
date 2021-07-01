package Database;

import Model.CheckoutModel;
import Model.Product;
import Model.UserModel;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class DBconnCheckOutTest {
    
    public DBconnCheckOutTest() {
    }

    @Test
    public void testInsertPayment() {
       // DBconnCheckOut.insertPayment("P07", "1302194007","B01" ,"Agus", "Iphon 20 Pro max +++", 1, 2000);
        List <CheckoutModel> test = DBconnCheckOut.getDataPayment();
        
        String expect = "P07";
        String actual = test.get(6).getIdBayar();
        
        assertEquals(expect,actual);
    }
    
    @Test
    public void testGetDataPayment() {
        List <CheckoutModel> test = DBconnCheckOut.getDataPayment();
        
        String expect = "P07";
        String actual = test.get(6).getIdBayar();
        
        assertEquals(expect,actual);
    }
    
    @Test
    public void testUpdateSaldoPayment() {
        DBconnCheckOut.updateSaldo(1000, "1302194007");
        List <UserModel> test = DBconnUser.GetDataUser();

        int expect = 1000;
        int actual = test.get(5).getSaldo();
        
        assertEquals(expect,actual);
    }
}
