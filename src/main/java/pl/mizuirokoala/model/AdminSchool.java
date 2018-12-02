package pl.mizuirokoala.model;

import javax.persistence.*;


@Entity
@Table(name = "adminschools")
    public class AdminSchool {
    @Id
    private long id;

    @ManyToOne(fetch = FetchType.EAGER)
    private School school;

    //future
//    @OneToOne(fetch = FetchType.EAGER)
//    @MapsId
//    private UserRole userRole;

    public AdminSchool() {
        super();
    }
}


