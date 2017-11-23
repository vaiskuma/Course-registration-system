package kea.project.exam.courseregistrationsystem.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String studentName;
    private String studentUserName;
    private String studentPassword;
    @ManyToOne
    private StudyProgramme studyProgramme;

    private static List<Student> studentList = new ArrayList<>();


//    public Student( String studentName, String studentSurname, String studyProgramme, String studentUserName, String studentPassword) {
////        this.id = id;
//        this.studentName = studentName;
//        this.studentSurname = studentSurname;
//        this.studyProgramme = studyProgramme;
//        this.studentUserName = studentUserName;
//        this.studentPassword = studentPassword;
//
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static void setStudentList(List<Student> studentList) {
        Student.studentList = studentList;
    }

    public String getStudentUserName() {
        return studentUserName;
    }

    public void setStudentUserName(String studentUserName) {
        this.studentUserName = studentUserName;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public StudyProgramme getStudyProgramme() {
        return studyProgramme;
    }

    public void setStudyProgramme(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

//    public static Student getStudentById(int id){
//        List<Student> list = Student.getStudentList();
//
//        Student theOne = new Student("Holla", "Dummy", "dummy@smart.com", "CyberSecurity","Jonas");
//
//        for (int i = 0; i < list.size(); i++) {
//            Student st = list.get(i);
//            if (st.getId() == id) {
//                System.out.println(st);
//                theOne = st;
//                break;
//            }
//        }
//        return theOne;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + studentName + '\'' +
                ", programme='" + studyProgramme + '\'' +
                ", username='" + studentUserName + '\'' +
                ", password='" + studentPassword + '\'' +
                '}';
    }
}
