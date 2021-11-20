package tr.com.hkerembagci.coursescheduler.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Data
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int student_number;

    private String name;
    private String surname;
    private String address;

    @Transient
    private List<Map<Teacher, Integer>> teacherLessonHourList;

    @OneToOne(mappedBy = "student")
    private Schedule schedule;
}
