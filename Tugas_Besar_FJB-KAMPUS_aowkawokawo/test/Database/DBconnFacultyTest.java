
package Database;

import Model.FakultasModel;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class DBconnFacultyTest {
    
    public DBconnFacultyTest() {

    }


    @Test
    public void testGetDataFakultas() {
        List<FakultasModel> test = DBconnFaculty.GetDataFakultas();
        
        String expect = "Fakultas Informatika";
        String actual = test.get(0).getNameFaculty();
        
        assertEquals(expect, actual);
    }
    
}
