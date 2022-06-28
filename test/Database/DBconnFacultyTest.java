
package Database;

import Model.FacultyModel;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class DBconnFacultyTest {
    
    public DBconnFacultyTest() {

    }


    @Test
    public void testGetDataFakultas() {
        List<FacultyModel> test = DBconnFaculty.getDataFakultas();
        
        String expect = "Fakultas Informatika";
        String actual = test.get(0).getNameFaculty();
        
        assertEquals(expect, actual);
    }
    
}
