package pl.mizuirokoala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mizuirokoala.model.School;
import pl.mizuirokoala.model.Teacher;

import java.util.List;
import java.util.Set;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {

    Set<Teacher> findAllBySchoolId(long schoolId);

    // fint all if Id is null or schoolId is not defined Set<Teacher> findAl
    List<Teacher> findAllBySchool(School school);
}
