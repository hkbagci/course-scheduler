package tr.com.hkerembagci.coursescheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.hkerembagci.coursescheduler.entity.Course;
import tr.com.hkerembagci.coursescheduler.entity.Teacher;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByTeacherId(int teacherId);
    List<Course> findByDay(int dayId);
    List<Course> findByDayAndHour(int dayId, int hourId);
    List<Course> findByDayAndHourAndTeacherId(int dayId, int hourId, int teacherId);
}
