package tr.com.hkerembagci.coursescheduler.service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import tr.com.hkerembagci.coursescheduler.entity.Hour;
import tr.com.hkerembagci.coursescheduler.entity.Student;
import tr.com.hkerembagci.coursescheduler.entity.Teacher;
import tr.com.hkerembagci.coursescheduler.exception.CourseSchedulerException;
import tr.com.hkerembagci.coursescheduler.repository.StudentRepository;
import tr.com.hkerembagci.coursescheduler.repository.TeacherRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Log4j2
public class StudentService {

    private final StudentRepository studentRepository;

    public Optional<Student> findById(Long studentId) {
        return studentRepository.findById(studentId);
    }

    public List<Student> findByNameAndSurname(String name, String surname) {
        return studentRepository.findByNameAndSurname(name, surname);
    }

    public List<Student> findStudentList() {
        return studentRepository.findAll();
    }

    public Student save(Student student) throws CourseSchedulerException {
        return studentRepository.save(student);
    }
}
