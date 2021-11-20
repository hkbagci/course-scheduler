package tr.com.hkerembagci.coursescheduler.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class LessonType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String lessonName;

    @OneToOne(mappedBy = "lessonType")
    private Teacher teacher;

}
