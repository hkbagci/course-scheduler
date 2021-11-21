package tr.com.hkerembagci.coursescheduler.service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import tr.com.hkerembagci.coursescheduler.entity.Hour;
import tr.com.hkerembagci.coursescheduler.entity.LessonType;
import tr.com.hkerembagci.coursescheduler.exception.CourseSchedulerException;
import tr.com.hkerembagci.coursescheduler.repository.HourRepository;
import tr.com.hkerembagci.coursescheduler.repository.LessonTypeRepository;

import java.util.List;

@Service
@AllArgsConstructor
@Log4j2
public class LessonTypeService {

    private final LessonTypeRepository lessonTypeRepository;

    public LessonType findByLessonName(String lessonName) {
        return lessonTypeRepository.findByLessonName(lessonName);
    }

    public List<LessonType> findLessonTypeList() {
        return lessonTypeRepository.findAll();
    }

    public LessonType save(LessonType hour) throws CourseSchedulerException {
        return lessonTypeRepository.save(hour);
    }
}
