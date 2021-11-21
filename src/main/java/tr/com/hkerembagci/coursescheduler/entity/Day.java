package tr.com.hkerembagci.coursescheduler.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String dayName;

    @OneToMany(mappedBy = "day")
    @JsonIgnore
    private List<Course> courseList;
}
