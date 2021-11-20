package tr.com.hkerembagci.coursescheduler.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Hour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int hour;

    @OneToOne(mappedBy = "hour")
    private Schedule schedule;
}
