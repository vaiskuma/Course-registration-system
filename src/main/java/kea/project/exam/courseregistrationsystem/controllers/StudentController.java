package kea.project.exam.courseregistrationsystem.controllers;


import kea.project.exam.courseregistrationsystem.model.Student;
import kea.project.exam.courseregistrationsystem.model.StudentRepository;
import kea.project.exam.courseregistrationsystem.model.StudyProgramme;
import kea.project.exam.courseregistrationsystem.persistence.StudyProgrammeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {


    @Autowired
    StudentRepository sr;
    @Autowired
    private StudyProgrammeRepository studyProgrammeRepository;


    @GetMapping("/")
    public ModelAndView homepageload (){

        Iterable<StudyProgramme> studyProgrammeIterable = studyProgrammeRepository.findAll();
        ModelAndView mv = new ModelAndView("index");
        mv.getModel().put("programmes", studyProgrammeIterable);
        return mv;
    }



    @GetMapping("/registerStudents")
    public ModelAndView registerStudents(

            @RequestParam(name = "studentFirstName", defaultValue = "NO_NAME")
                    String studentName,
            @RequestParam(name = "studentProgramme", defaultValue = "NO_PROGRAMME")
                    int studentProgramme,
            @RequestParam(name = "studentUsername", defaultValue = "NO_USERNAME")
                    String studentUserName,
            @RequestParam(name = "studentPassword", defaultValue = "NO_PASSWORD")
                    String studentPassword) {

        StudyProgramme studprog = studyProgrammeRepository.findById(studentProgramme);


        Student student = new Student();
        student.setStudentName(studentName);
        student.setStudyProgramme(studprog);
        student.setStudentUserName(studentUserName);
        student.setStudentPassword(studentPassword);

        sr.save(student);

        List<Student> myList = new ArrayList<>();
        Iterable<Student> is = sr.findAll();
        is.forEach((S) -> {
            myList.add(S);
        });
        student.setStudentList(myList);
        System.out.println(myList);



        ModelAndView modelAndView = new ModelAndView("student");
        modelAndView.getModel().put("studentslist", student.getStudentList());
        modelAndView.getModel().put("student", student);


        return modelAndView;

    }


}
