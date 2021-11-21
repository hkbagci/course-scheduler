package tr.com.hkerembagci.coursescheduler.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Hour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int startHour;
    private int endHour;

    @OneToMany(mappedBy = "hour")
    @JsonIgnore
    private List<Course> courseList;
}
