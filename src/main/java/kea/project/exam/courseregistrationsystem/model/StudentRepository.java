package kea.project.exam.courseregistrationsystem.model;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository <Student, Integer> {
    Student findStudentByStudentName(String studentSurname);

}
