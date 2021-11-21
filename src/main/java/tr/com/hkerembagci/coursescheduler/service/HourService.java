package tr.com.hkerembagci.coursescheduler.service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import tr.com.hkerembagci.coursescheduler.entity.Day;
import tr.com.hkerembagci.coursescheduler.entity.Hour;
import tr.com.hkerembagci.coursescheduler.exception.CourseSchedulerException;
import tr.com.hkerembagci.coursescheduler.repository.DayRepository;
import tr.com.hkerembagci.coursescheduler.repository.HourRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Log4j2
public class HourService {

    private final HourRepository hourRepository;

    public Hour findByStartHour(int startHour) {
        return hourRepository.findByStartHour(startHour);
    }

    public Hour findByEndHour(int endHour) {
        return hourRepository.findByEndHour(endHour);
    }

    public List<Hour> findHourList() {
        return hourRepository.findAll();
    }

    public Hour findByStartHourAndEndHour(int startHour, int endHour) {
        return hourRepository.findByStartHourAndEndHour(startHour, endHour);
    }

    public Hour save(Hour hour) throws CourseSchedulerException {
        return hourRepository.save(hour);
    }
}
