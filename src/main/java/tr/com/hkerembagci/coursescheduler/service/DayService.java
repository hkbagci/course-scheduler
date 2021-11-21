package tr.com.hkerembagci.coursescheduler.service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import tr.com.hkerembagci.coursescheduler.entity.Day;
import tr.com.hkerembagci.coursescheduler.entity.Student;
import tr.com.hkerembagci.coursescheduler.exception.CourseSchedulerException;
import tr.com.hkerembagci.coursescheduler.repository.DayRepository;
import tr.com.hkerembagci.coursescheduler.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Log4j2
public class DayService {

    private final DayRepository dayRepository;

    public Day findByDayName(String dayName) {
        return dayRepository.findByDayName(dayName);
    }

    public List<Day> findDayList() {
        return dayRepository.findAll();
    }

    public Day save(Day day) throws CourseSchedulerException {
        return dayRepository.save(day);
    }
}
