package pl.mizuirokoala.model;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table(name = "marks")
public class Mark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;

    @NotBlank
    private String value;

    private String description;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "subject_id")
    private Subject subject;

    public Mark() {
        super();
    }

    public Mark(String value, String description, Date date) {
        super();
        this.value = value;
        this.description = description;
        this.date = date;
    }

    public Mark(Student student, Subject subject) {
        super();
        this.student = student;
        this.subject = subject;
    }

}