package pl.mizuirokoala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mizuirokoala.model.Student;

import java.util.List;
import java.util.Set;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Set<Student> findAllBySchoolId(long schoolId);

    Set<Student> findAllBySchoolIdisNullOrSchoolIdIsNot(long schoolId);

    List<Student> findAllByDivisionId(long divisionId);

    List<Student> findAllByDivisionIdIsNull(long divisionId);

}