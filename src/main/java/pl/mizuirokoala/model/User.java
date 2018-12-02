package pl.mizuirokoala.model;

import org.hibernate.annotations.SQLInsert;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank
    @Size(min = 5,max = 26)
    @Column(unique = true)
    private String login;

    @NotBlank
    @Size(min = 5,max = 34)
    private String password;

    @NotEmpty
    @Email
    @Column(unique = true)
    private String email;

    @NotBlank(message = "white characters forbidden")
    @NotEmpty
    private String firstName;

    @NotBlank(message = "white characters forbidden")
    @NotEmpty
    private String lastName;

    public User(String login, String password, String email, String firstName, String lastName) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}