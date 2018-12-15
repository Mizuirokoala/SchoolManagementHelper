package pl.mizuirokoala.model;


import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.hibernate.validator.constraints.Email;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    private long id;

    @LazyCollection(LazyCollectionOption.FALSE)
    @ManyToMany(mappedBy = "teacher")
    List<Subject> subject = new ArrayList<>();

    @ManyToOne(fetch = FetchType.EAGER)
    private School school;

    //next time UserRole

    @Email
    private String email;

    public Teacher() {
        super();
    }

    //need konstr but first UserRole
}
