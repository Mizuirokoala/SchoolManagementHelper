package pl.mizuirokoala.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private long id;

    @ManyToMany
    private List<Division> divisions = new ArrayList<>();

    @OneToMany(mappedBy = "students")
    List<Mark> marks = new ArrayList<>();

    @ManyToMany
    private String school;

    }