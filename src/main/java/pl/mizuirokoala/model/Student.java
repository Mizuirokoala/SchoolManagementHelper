package pl.mizuirokoala.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {

    @Id
    private long id;

    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE})
    private List<Division> divisions=new ArrayList<>();

    @OneToMany(mappedBy = "students",cascade = {CascadeType.PERSIST,CascadeType.MERGE},fetch = FetchType.EAGER)
    List<Mark> marks=new ArrayList<>();

    @ManyToMany
    private String school;




}



























