package tr.com.hkerembagci.coursescheduler.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentNumber;

    private String name;
    private String surname;
    private String address;

    @Transient
    private List<Map<Teacher, Integer>> teacherLessonHourList;

    @OneToMany(mappedBy = "student")
    Set<CourseStudent> registrationSet;
}
