package tr.com.hkerembagci.coursescheduler.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tr.com.hkerembagci.coursescheduler.entity.Course;
import tr.com.hkerembagci.coursescheduler.entity.CourseStudent;
import tr.com.hkerembagci.coursescheduler.entity.Day;
import tr.com.hkerembagci.coursescheduler.entity.Student;
import tr.com.hkerembagci.coursescheduler.exception.CourseSchedulerException;
import tr.com.hkerembagci.coursescheduler.repository.CourseRepository;
import tr.com.hkerembagci.coursescheduler.repository.CourseStudentRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseStudentService {

    private final CourseStudentRepository courseStudentRepository;

    public List<CourseStudent> findByCourse(int courseId) {
        return courseStudentRepository.findByCourse(courseId);
    }

    public List<CourseStudent> findByStudent(int studentId) {
        return courseStudentRepository.findByStudent(studentId);
    }

    public List<CourseStudent> findCourseStudentList() {
        return courseStudentRepository.findAll();
    }

    public CourseStudent save(CourseStudent courseStudent) {
        return courseStudentRepository.save(courseStudent);
    }

    public void chooseCourse(Course course, Student student) throws CourseSchedulerException {
        CourseStudent courseStudent = new CourseStudent();
        courseStudent.setCourse(course);
        courseStudent.setStudent(student);
        courseStudentRepository.save(courseStudent);
    }
}
