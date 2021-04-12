package study.project.studyGroup.member.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import study.project.studyGroup.member.domain.Member;
import study.project.studyGroup.member.dto.MemberLogin;
import study.project.studyGroup.member.repository.MemberRepository;

import javax.persistence.EntityManager;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberServiceTest {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private MemberService memberService;

    @Autowired
    private EntityManager em;
    @Test
    public void 로그인(){
       Member member = new Member();
       member.setId("asdAS");
       member.setPassword("ASD");

       memberService.join(member);

       MemberLogin memberLogin = new MemberLogin();
       memberLogin.setId("asdAS");
       memberLogin.setPassword("ASD");

       boolean login = memberService.login(memberLogin);

        System.out.println("login = " + login); 
    }
}