package pl.mizuirokoala.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mizuirokoala.model.Mark;

import java.util.List;

public interface MarkRepository extends JpaRepository<Mark, Long> {


    List<Mark> findAllBySubjectId(long subjectId);
}