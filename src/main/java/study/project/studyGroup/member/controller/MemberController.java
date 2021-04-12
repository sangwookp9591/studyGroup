package study.project.studyGroup.member.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import study.project.studyGroup.member.domain.Member;
import study.project.studyGroup.member.dto.MemberForm;
import study.project.studyGroup.member.dto.MemberLogin;
import study.project.studyGroup.member.service.MemberService;


import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;


    @GetMapping("/member/new")
    public String join(Model model){
        model.addAttribute("memberForm",new MemberForm());
        //빈 MemberForm을 드고가는이유?
        //빈화면이라서 아무것도 없을 수도 있지만 validation을 해주기떄문에 들고간다.
        return "join/joinPage";
    }

    @PostMapping("/member/login")
    public String login(MemberLogin memberLogin, Model model, HttpSession session){
        boolean loginFlag = memberService.login(memberLogin);

        log.info("loginFlag : "+loginFlag);
        if(loginFlag){
            session.setAttribute("user_Id",memberLogin.getId());
            return "main/mainPage";
        }else{
            model.addAttribute("memberLogin", new MemberLogin());
            return "join/joinPage";
        }
    }

    @PostMapping("/member/join")
    public String join(@Valid MemberForm form, BindingResult result){
        if( result.hasErrors()){
            return "join/joinPage";
        }

        Member member = new Member(form.getId(),form.getName(),form.getPassword(),form.getEmail(),form.getPhoneNumber(),form.getGender());

        log.info(member.toString());
        memberService.join(member);
        return "redirect:/login";
    }


    @GetMapping("/member/memberList")
    public String memberList(Model model){
        List<Member> members = memberService.memberList();
        model.addAttribute("members",members);
        return "members/memberList";
    }


}
