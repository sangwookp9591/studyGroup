package study.project.studyGroup.member.repository;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import study.project.studyGroup.member.domain.Member;
import study.project.studyGroup.member.dto.MemberDto;

import java.util.List;


@Repository
public interface MemberRepository extends JpaRepository<Member,String> ,MemberRepositoryCustom{

    List<Member> findByName(String name);
}

