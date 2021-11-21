package tr.com.hkerembagci.coursescheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.hkerembagci.coursescheduler.entity.Day;
import tr.com.hkerembagci.coursescheduler.entity.Student;

import java.util.List;

@Repository
public interface DayRepository extends JpaRepository<Day, Long> {
    Day findByDayName(String name);
}
