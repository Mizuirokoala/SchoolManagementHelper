package pl.mizuirokoala.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_role")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;

    @Column(name="user_role")
    private String userRole;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    public UserRole() {
        super();
    }

    private boolean enabled = false;

    public UserRole(String username, String userRole, User user, School school) {
        super();
        this.username = username;
        this.userRole = userRole;
        this.user = user;
        this.school = school;
        this.enabled = false;
    }

    //TODO: 07.12.18 later add that...
//    public static List<String> getRolesForSelect() {
//        List<String> allRoles = new ArrayList<>();
//        allRoles.add("ROLE_ADMIN");
//        allRoles.add("ROLE_USER");
//        allRoles.add("ROLE_SCHOOLADMIN");
//        allRoles.add("ROLE_TEACHER");
//        allRoles.add("ROLE_STUDENT");
//        allRoles.add("ROLE_PARENT");
//        return allRoles;
//    }

}