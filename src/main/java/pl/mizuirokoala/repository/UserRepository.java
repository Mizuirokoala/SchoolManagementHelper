package pl.mizuirokoala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mizuirokoala.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findOneByUsername(String username);

    User findByEmail(String email);

    boolean existByEmail(String email);

    boolean existByUsername(String username);


}


