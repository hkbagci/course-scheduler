package tr.com.hkerembagci.coursescheduler.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class LessonType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String lessonName;

    @OneToMany(mappedBy = "lessonType")
    @JsonIgnore
    private List<Teacher> teacherList;

}
