package tr.com.hkerembagci.coursescheduler.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "day_id", referencedColumnName = "id")
    private Day day;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "hour_id", referencedColumnName = "id")
    private Hour hour;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id", referencedColumnName = "student_number")
    private Student student;
}
