package tr.com.hkerembagci.coursescheduler.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tr.com.hkerembagci.coursescheduler.entity.Course;
import tr.com.hkerembagci.coursescheduler.entity.CourseStudent;
import tr.com.hkerembagci.coursescheduler.entity.Day;
import tr.com.hkerembagci.coursescheduler.service.CourseService;
import tr.com.hkerembagci.coursescheduler.service.CourseStudentService;

import java.util.List;

@RestController
@RequestMapping("/courseStudent")
@RequiredArgsConstructor
public class CourseStudentController {

    private final CourseStudentService courseStudentService;

    @GetMapping("/getByCourse")
    public List<CourseStudent> getStudentListByCourse(@RequestParam(required = true) int courseId) {
        return courseStudentService.findByCourse(courseId);
    }

    @GetMapping("/getByStudent")
    public List<CourseStudent> getCourseListByStudent(@RequestParam(required = true) int studentId) {
        return courseStudentService.findByStudent(studentId);
    }

    @GetMapping("/getCourseStudentList")
    public List<CourseStudent> getCourseStudentList() {
        return courseStudentService.findCourseStudentList();
    }
}
