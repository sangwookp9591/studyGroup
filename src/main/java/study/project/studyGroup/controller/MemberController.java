package study.project.studyGroup.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import study.project.studyGroup.domain.Member;
import study.project.studyGroup.service.MemberService;


import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MemberController {


    private final MemberService memberService;

    @GetMapping("/member/memberList.do")
    public String memberList(Model model){
        Member testMember =  new Member();
        testMember.setId("testId3");
        testMember.setAge(30);
        testMember.setName("상욱");
        String joinId = memberService.join(testMember);
        log.info("회원가입 여부 : "+joinId);
        List<Member> members = memberService.memberList();
        log.info("회원 조회 : "+ members.toString());
        model.addAttribute("members",members);

        return "studyGroups/groupList";

    }

}
