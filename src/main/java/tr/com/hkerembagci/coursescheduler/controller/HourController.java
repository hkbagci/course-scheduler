package tr.com.hkerembagci.coursescheduler.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tr.com.hkerembagci.coursescheduler.entity.Day;
import tr.com.hkerembagci.coursescheduler.entity.Hour;
import tr.com.hkerembagci.coursescheduler.service.DayService;
import tr.com.hkerembagci.coursescheduler.service.HourService;

import java.util.List;

@RestController
@RequestMapping("/hour")
@RequiredArgsConstructor
public class HourController {

    private final HourService hourService;

    @GetMapping("/getByStartHour")
    public Hour getByStartHour(@RequestParam(required = true) int startHour) {
        return hourService.findByStartHour(startHour);
    }

    @GetMapping("/getHourList")
    public List<Hour> getHourList() {
        return hourService.findHourList();
    }
}
