package tr.com.hkerembagci.coursescheduler.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.com.hkerembagci.coursescheduler.entity.Course;
import tr.com.hkerembagci.coursescheduler.entity.Student;
import tr.com.hkerembagci.coursescheduler.entity.Teacher;
import tr.com.hkerembagci.coursescheduler.exception.CourseSchedulerException;
import tr.com.hkerembagci.coursescheduler.service.CourseService;
import tr.com.hkerembagci.coursescheduler.service.TeacherService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/teacher")
@RequiredArgsConstructor
public class TeacherController {

    private final TeacherService teacherService;

    @GetMapping("/getById")
    public Optional<Teacher> getTeacherById(@RequestParam(required = true) int teacherId) {
        return teacherService.findById(Long.valueOf(teacherId));
    }

    @GetMapping("/getByNameAndSurname")
    public List<Teacher> getTeacherByNameAndSurname(
            @RequestParam(required = true) String name,
            @RequestParam(required = true) String surname) {
        return teacherService.findByNameAndSurname(name, surname);
    }

    @GetMapping("/getTeacherList")
    public List<Teacher> getTeacherList() {
        return teacherService.findTeacherList();
    }
}
