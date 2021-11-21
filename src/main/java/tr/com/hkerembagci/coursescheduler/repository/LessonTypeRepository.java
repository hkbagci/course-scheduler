package tr.com.hkerembagci.coursescheduler.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tr.com.hkerembagci.coursescheduler.entity.Hour;
import tr.com.hkerembagci.coursescheduler.entity.LessonType;

@Repository
public interface LessonTypeRepository extends JpaRepository<LessonType, Long> {
    LessonType findByLessonName(String lessonName);
}
