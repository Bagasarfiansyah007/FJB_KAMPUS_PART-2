
package Model;

/**
 *
 * @author AMS
 */
public class StudyProgramModel {
    private String studyProgramCode;
    private String facultyCode;
    private String studyProgramName;

    public StudyProgramModel(String studyProgramCode, String facultyCode, String studyProgramName) {
        this.studyProgramCode = studyProgramCode;
        this.facultyCode = facultyCode;
        this.studyProgramName = studyProgramName;
    }

    public String getStudyProgramCode() {
        return studyProgramCode;
    }

    public void setStudyProgramCode(String studyProgramCode) {
        this.studyProgramCode = studyProgramCode;
    }

    public String getFacultyCode() {
        return facultyCode;
    }

    public void setFacultyCode(String facultyCode) {
        this.facultyCode = facultyCode;
    }

    public String getStudyProgramName() {
        return studyProgramName;
    }

    public void setStudyProgramName(String studyProgramName) {
        this.studyProgramName = studyProgramName;
    }
    
    
}
