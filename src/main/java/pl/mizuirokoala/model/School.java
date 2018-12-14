package pl.mizuirokoala.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "schools")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;

    @NotEmpty
    private String name;

    private String type;

    @OneToMany(mappedBy = "school")
    private List<Division> subject=new ArrayList<>();

    @OneToMany(mappedBy = "school")
    private List<Student> students;

    //next teacher,subject and constructor

}
