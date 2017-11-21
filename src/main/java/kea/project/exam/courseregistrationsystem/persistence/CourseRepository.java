package kea.project.exam.courseregistrationsystem.persistence;

import kea.project.exam.courseregistrationsystem.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,Integer> {
}
