package study.project.studyGroup.group.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.project.studyGroup.group.domain.StudyGroup;

@Repository
public interface GroupRepository extends JpaRepository<StudyGroup,String> {
}
