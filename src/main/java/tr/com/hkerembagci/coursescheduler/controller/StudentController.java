package tr.com.hkerembagci.coursescheduler.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tr.com.hkerembagci.coursescheduler.entity.Hour;
import tr.com.hkerembagci.coursescheduler.entity.Student;
import tr.com.hkerembagci.coursescheduler.entity.Teacher;
import tr.com.hkerembagci.coursescheduler.service.StudentService;
import tr.com.hkerembagci.coursescheduler.service.TeacherService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/getByStudentNumber")
    public Optional<Student> getStudentById(@RequestParam(required = true) Long studentId) {
        return studentService.findById(Long.valueOf(studentId));
    }

    @GetMapping("/getByNameAndSurname")
    public List<Student> getStudentListByNameAndSurname(
            @RequestParam(required = true) String name,
            @RequestParam(required = true) String surname) {
        return studentService.findByNameAndSurname(name, surname);
    }

    @GetMapping("/getStudentList")
    public List<Student> getStudentList() {
        return studentService.findStudentList();
    }
}
