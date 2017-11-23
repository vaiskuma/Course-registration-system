package kea.project.exam.courseregistrationsystem.model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Course {

    @GeneratedValue(strategy= GenerationType.AUTO)
    @Id
    private Integer id;
    private String titleDanish;
    private String titleEnglish;
    private int semester;
    private String classCode;
    @ManyToOne
    private StudyProgramme studyProgramme;
    private boolean mandatory;
    private int ects;
    private boolean courseLanguage;
    private int minimumStudents;
    private int expectedStudents;
    private int maximumStudents;
    private String prerequisites;
    private String learningOutcome;
    private String content;
    private String learningActivities;
    private String examForm;
    private String mandatoryvalue;
    private String courseLanuageValue;
    @ManyToMany
    private List<Teacher> teachers;


    public String getMandatoryvalue() {
        return mandatoryvalue;
    }

    public void setMandatoryvalue(String mandatoryvalue) {
        this.mandatoryvalue = mandatoryvalue;
    }

    public String getCourseLanuageValue() {
        return courseLanuageValue;
    }

    public void setCourseLanuageValue(String courseLanuageValue) {
        this.courseLanuageValue = courseLanuageValue;
    }

//    public Teacher getTeacher() {
//        return teacher;
//    }
//
//    public void setTeacher(Teacher teacher) {
//        this.teacher = teacher;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitleDanish() {
        return titleDanish;
    }

    public void setTitleDanish(String titleDanish) {
        this.titleDanish = titleDanish;
    }

    public String getTitleEnglish() {
        return titleEnglish;
    }

    public void setTitleEnglish(String titleEnglish) {
        this.titleEnglish = titleEnglish;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public StudyProgramme getStudyProgramme() {
        return studyProgramme;
    }

    public void setStudyProgramme(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

    public boolean isMandatory() {
        return mandatory;
    }

    public void setMandatory(boolean mandatory) {
        this.mandatory = mandatory;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public boolean isCourseLanguage() {
        return courseLanguage;
    }

    public void setCourseLanguage(boolean courseLanguage) {
        this.courseLanguage = courseLanguage;
    }

    public int getMinimumStudents() {
        return minimumStudents;
    }

    public void setMinimumStudents(int minimumStudents) {
        this.minimumStudents = minimumStudents;
    }

    public int getExpectedStudents() {
        return expectedStudents;
    }

    public void setExpectedStudents(int expectedStudents) {
        this.expectedStudents = expectedStudents;
    }

    public int getMaximumStudents() {
        return maximumStudents;
    }

    public void setMaximumStudents(int maximumStudents) {
        this.maximumStudents = maximumStudents;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public String getLearningOutcome() {
        return learningOutcome;
    }

    public void setLearningOutcome(String learningOutcome) {
        this.learningOutcome = learningOutcome;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLearningActivities() {
        return learningActivities;
    }

    public void setLearningActivities(String learningActivities) {
        this.learningActivities = learningActivities;
    }

    public String getExamForm() {
        return examForm;
    }

    public void setExamForm(String examForm) {
        this.examForm = examForm;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
