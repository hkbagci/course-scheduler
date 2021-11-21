package tr.com.hkerembagci.coursescheduler.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;

    @ManyToOne(optional = false)
    @JoinColumn(name = "lesson_type_id")
    private LessonType lessonType;

    @OneToMany(mappedBy = "teacher")
    @JsonIgnore
    private List<Course> courseList;
}
