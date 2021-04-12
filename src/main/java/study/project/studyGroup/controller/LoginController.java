package study.project.studyGroup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import study.project.studyGroup.member.dto.MemberLogin;

@Controller
public class LoginController {


    @GetMapping("/login")
    public String loginPage(Model model){
        model.addAttribute("memberLogin", new MemberLogin());
        return "login/loginPage";
    }

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("memberLogin", new MemberLogin());
        return "address/Sample";
    }

}
