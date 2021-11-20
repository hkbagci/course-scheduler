package tr.com.hkerembagci.coursescheduler.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String dayName;

    @OneToOne(mappedBy = "day")
    private Schedule schedule;
}
