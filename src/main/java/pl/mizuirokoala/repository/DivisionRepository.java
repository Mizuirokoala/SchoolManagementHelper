package pl.mizuirokoala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mizuirokoala.model.Division;
import pl.mizuirokoala.model.School;

import java.util.List;

public interface DivisionRepository extends JpaRepository<Division,Long> {
List<Division> findAllBySchoolId(long schoolId);
List<Division> findAllBySchool(School school);
List<Division> findAllBySchoolIdIsNull(long schoolId);


}
