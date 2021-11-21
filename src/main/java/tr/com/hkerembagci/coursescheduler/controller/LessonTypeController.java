package tr.com.hkerembagci.coursescheduler.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tr.com.hkerembagci.coursescheduler.entity.Day;
import tr.com.hkerembagci.coursescheduler.entity.LessonType;
import tr.com.hkerembagci.coursescheduler.service.DayService;
import tr.com.hkerembagci.coursescheduler.service.LessonTypeService;

import java.util.List;

@RestController
@RequestMapping("/lessonType")
@RequiredArgsConstructor
public class LessonTypeController {

    private final LessonTypeService lessonTypeService;

    @GetMapping("/getByLessonTypeName")
    public LessonType getByLessonTypeName(@RequestParam(required = true) String lessonTypeName) {
        return lessonTypeService.findByLessonName(lessonTypeName);
    }

    @GetMapping("/getLessonTypeList")
    public List<LessonType> getLessonTypeList() {
        return lessonTypeService.findLessonTypeList();
    }
}
