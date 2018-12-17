package pl.mizuirokoala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mizuirokoala.model.School;

public interface SchoolRepository  extends JpaRepository<School,Long> {

}

