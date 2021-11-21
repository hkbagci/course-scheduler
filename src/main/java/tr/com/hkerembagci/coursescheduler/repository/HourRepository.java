package tr.com.hkerembagci.coursescheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.hkerembagci.coursescheduler.entity.Day;
import tr.com.hkerembagci.coursescheduler.entity.Hour;

@Repository
public interface HourRepository extends JpaRepository<Hour, Long> {
    Hour findByStartHour(int startHour);
    Hour findByEndHour(int endHour);
    Hour findByStartHourAndEndHour(int startHour, int endHour);
}
