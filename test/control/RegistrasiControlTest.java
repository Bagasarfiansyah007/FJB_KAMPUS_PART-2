package control;

import Database.DBconnUser;
import Model.UserModel;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class RegistrasiControlTest {
    
    public RegistrasiControlTest() {
    }

    @Test
    public void testFindAccountIsAlreadyExist() {
        RegistrasiControl test = new RegistrasiControl(null);
        List <UserModel> list = DBconnUser.getDataUser();  
        
        boolean expect = true;
        boolean actual = test.findAccountIsAlreadyExist(list, "1302194007");
        assertEquals(expect,actual);
    }
    
}
