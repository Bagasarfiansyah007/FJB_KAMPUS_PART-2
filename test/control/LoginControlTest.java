
package control;

import org.junit.Test;
import static org.junit.Assert.*;
import view.LogInGUI;

public class LoginControlTest {
    
    public LoginControlTest() {
    }

    @Test
    public void testFindAccountCondition() {
        LoginControl test = new LoginControl();
        boolean expect = true;
        boolean actual = test.findAccountCondition("1302194007", "12345");
        assertEquals(expect,actual);
    }

    @Test
    public void testFindAccountIndex() {
        LoginControl test = new LoginControl();
        int expect = 6;
        int actual = test.findAccountIndex("1302194007", "12345");
        assertEquals(expect,actual);
    }
    
}
