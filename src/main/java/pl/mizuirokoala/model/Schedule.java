package pl.mizuirokoala.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.time.DayOfWeek;
import java.util.HashMap;
import java.util.Map;

@Entity
@Table(name = "schedules")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private DayOfWeek day;

    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division division;

        @ManyToMany
    private Map<Integer, Subject> daySubject = new HashMap<Integer, Subject>();
}
