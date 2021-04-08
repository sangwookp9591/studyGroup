package study.project.studyGroup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {


    @GetMapping("/login")
    public ModelAndView loginPage(ModelAndView mav){
        mav.setViewName("login/loginPage");
        return mav;
    }

}
