package tr.com.hkerembagci.coursescheduler.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tr.com.hkerembagci.coursescheduler.entity.Day;
import tr.com.hkerembagci.coursescheduler.entity.Student;
import tr.com.hkerembagci.coursescheduler.service.DayService;
import tr.com.hkerembagci.coursescheduler.service.StudentService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/day")
@RequiredArgsConstructor
public class DayController {

    private final DayService dayService;

    @GetMapping("/getByDayName")
    public Day getByDayName(@RequestParam(required = true) String dayName) {
        return dayService.findByDayName(dayName);
    }

    @GetMapping("/getDayList")
    public List<Day> getDayList() {
        return dayService.findDayList();
    }
}
