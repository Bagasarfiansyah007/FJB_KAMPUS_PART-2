/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author AMS
 */
public class FacultyModel {
    private String idFaculty;
    private String nameFaculty;
    private String studyProgramCode;

    public FacultyModel(String idFaculty, String nameFaculty) {
        this.idFaculty = idFaculty;
        this.nameFaculty = nameFaculty;
        this.studyProgramCode = studyProgramCode;
    }

    public String getIdFaculty() {
        return idFaculty;
    }

    public void setIdFaculty(String idFaculty) {
        this.idFaculty = idFaculty;
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }

    public String getStudyProgramCode() {
        return studyProgramCode;
    }

    public void setStudyProgramCode(String studyProgramCode) {
        this.studyProgramCode = studyProgramCode;
    }
    
    
}
