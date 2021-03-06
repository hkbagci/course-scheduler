package tr.com.hkerembagci.coursescheduler.service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import tr.com.hkerembagci.coursescheduler.entity.Course;
import tr.com.hkerembagci.coursescheduler.entity.CourseStudent;
import tr.com.hkerembagci.coursescheduler.entity.Day;
import tr.com.hkerembagci.coursescheduler.entity.Student;
import tr.com.hkerembagci.coursescheduler.exception.CourseSchedulerException;
import tr.com.hkerembagci.coursescheduler.repository.CourseRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Log4j2
public class CourseService {

    private final CourseRepository courseRepository;

    public List<Course> findByTeacherId(int teacherId) {
        return courseRepository.findByTeacherId(teacherId);
    }

    public List<Course> findByDay(int dayId) {
        return courseRepository.findByDay(dayId);
    }

    public List<Course> findByDayAndHour(int dayId, int hourId) {
        return courseRepository.findByDayAndHour(dayId, hourId);
    }

    public List<Course> findByDayAndHourAndTeacherId(int dayId, int hourId, int teacherId) {
        return courseRepository.findByDayAndHourAndTeacherId(dayId, hourId, teacherId);
    }

    public List<Course> findCourseList() {
        return courseRepository.findAll();
    }

    public Course save(Course course) throws CourseSchedulerException {
        final List<Course> courseList = findByDayAndHour(Math.toIntExact(course.getDay().getId()), Math.toIntExact(course.getHour().getId()));
        if (!courseList.isEmpty()) {
            throw new CourseSchedulerException("Aynı gün ve saat başka bir kurs bulunmaktadır. Lütfen başka bir gün ve/veya saat seçiniz.");
        }
        return courseRepository.save(course);
    }
}
