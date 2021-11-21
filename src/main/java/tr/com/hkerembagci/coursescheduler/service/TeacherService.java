package tr.com.hkerembagci.coursescheduler.service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import tr.com.hkerembagci.coursescheduler.entity.Course;
import tr.com.hkerembagci.coursescheduler.entity.Student;
import tr.com.hkerembagci.coursescheduler.entity.Teacher;
import tr.com.hkerembagci.coursescheduler.exception.CourseSchedulerException;
import tr.com.hkerembagci.coursescheduler.repository.CourseRepository;
import tr.com.hkerembagci.coursescheduler.repository.TeacherRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Log4j2
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public Optional<Teacher> findById(Long teacherId) {
        return teacherRepository.findById(teacherId);
    }

    public List<Teacher> findByNameAndSurname(String name, String surname) {
        return teacherRepository.findByNameAndSurname(name, surname);
    }

    public List<Teacher> findTeacherList() {
        return teacherRepository.findAll();
    }

    public Teacher save(Teacher teacher) throws CourseSchedulerException {
        return teacherRepository.save(teacher);
    }
}
