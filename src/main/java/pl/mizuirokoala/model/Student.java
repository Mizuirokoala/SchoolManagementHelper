package pl.mizuirokoala.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private long id;


    @OneToMany(mappedBy = "students")
    List<Mark> marks = new ArrayList<>();

    @ManyToMany
    private String school;

    @ManyToOne
    @JoinColumn(name = "division_id")
    private Division division;

//    @ManyToMany
//    private List<Division> divisions = new ArrayList<>();

    @OneToMany(mappedBy = "student", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    List<Mark> mark = new ArrayList<>();


    public Student() {
        super();
    }

//and next konst..
}