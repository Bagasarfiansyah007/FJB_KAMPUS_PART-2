
package Database;

import Model.UserModel;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class DBconnUserTest {
    
    public DBconnUserTest() {
    }

    @Test   
    public void testGetDataUser() {
        List<UserModel> test = DBconnUser.getDataUser();
        
        String expect = "1302194073";
        String actual = test.get(5).getNim();
        
        assertEquals(expect, actual);
    }
    
}
