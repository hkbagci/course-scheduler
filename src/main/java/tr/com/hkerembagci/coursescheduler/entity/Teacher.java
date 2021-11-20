package tr.com.hkerembagci.coursescheduler.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String surname;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lesson_type_id", referencedColumnName = "id")
    private LessonType lessonType;

    @OneToOne(mappedBy = "teacher")
    private Schedule schedule;
}
