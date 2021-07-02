
package Database;

import Model.StudyProgramModel;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;


public class DBconnStudyProgramTest {
    
    public DBconnStudyProgramTest() {
    }

    @Test
    public void testGetDataProdi() {
        List<StudyProgramModel> test = DBconnStudyProgram.getDataStudyProgram();
        
        String expect = "S1 Informatika";
        String actual = test.get(1).getStudyProgramName();
        
        assertEquals(expect, actual);
    }
    
}
