package pl.mizuirokoala.model;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;

    @NotBlank
    private String name;

    private String description;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    List<Division> division = new ArrayList<>();

    @OneToMany(mappedBy = "subject", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    List<Mark> mark = new ArrayList<>();

    public Subject() {
        super();
    }

    public Subject(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }
}