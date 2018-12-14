package pl.mizuirokoala.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.security.auth.Subject;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "divisions")
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;

    @NotEmpty
    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;


    @OneToMany(mappedBy = "division", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    List<Student> student = new ArrayList<>();


    @ManyToMany(mappedBy = "division")
    List<Subject> subject = new ArrayList<>();

    
    public Division() {
        super();
    }

    public Division(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }
}