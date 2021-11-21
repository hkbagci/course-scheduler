package tr.com.hkerembagci.coursescheduler.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import tr.com.hkerembagci.coursescheduler.entity.Course;
import tr.com.hkerembagci.coursescheduler.entity.Day;
import tr.com.hkerembagci.coursescheduler.exception.CourseSchedulerException;
import tr.com.hkerembagci.coursescheduler.service.CourseService;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @GetMapping("/getByTeacher")
    public List<Course> getCourseListByTeacher(@RequestParam(required = true) int teacherId) {
        return courseService.findByTeacherId(teacherId);
    }

    @GetMapping("/getByDay")
    public List<Course> getCourseListByDay(@RequestParam(required = true) int dayId) {
        return courseService.findByDay(dayId);
    }

    @GetMapping("/getByDayAndHour")
    public List<Course> getCourseListByDayAndHour(
            @RequestParam(required = true) int dayId,
            @RequestParam(required = true) int hourId) {
        return courseService.findByDayAndHour(dayId, hourId);
    }

    @GetMapping("/getByDayAndHourAndTeacher")
    public List<Course> getCourseListByDayAndHourAndTeacher(
            @RequestParam(required = true) int dayId,
            @RequestParam(required = true) int hourId,
            @RequestParam(required = true) int teacherId) {
        return courseService.findByDayAndHourAndTeacherId(dayId, hourId, teacherId);
    }

    @GetMapping("/getCourseList")
    public List<Course> getCourseList() {
        return courseService.findCourseList();
    }

    @PostMapping("/addCourse")
    public ResponseEntity<String> addCourse(@RequestParam(required = true) Course course) {
        try {
            courseService.save(course);
        } catch (CourseSchedulerException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok("Ders başarıyla kaydedildi.");
    }
}
