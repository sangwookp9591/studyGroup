package study.project.studyGroup.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import study.project.studyGroup.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member,String> {

}
