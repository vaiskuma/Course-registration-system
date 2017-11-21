package kea.project.exam.courseregistrationsystem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudyProgramme {

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private Integer id;
    private String studyProgrammeTitle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudyProgrammeTitle() {
        return studyProgrammeTitle;
    }

    public void setStudyProgrammeTitle(String studyProgrammeTitle) {
        this.studyProgrammeTitle = studyProgrammeTitle;
    }
}
