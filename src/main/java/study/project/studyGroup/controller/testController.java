package study.project.studyGroup.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.project.studyGroup.domain.Member;

@RestController
@Slf4j
public class testController {

    //Logger log = loggerFactory.getLogger(HomeController.class)
    @RequestMapping("/")
    public String home() {
        log.info("home controller");
        return "home";
    }


    @GetMapping("/members/new")
    public String createForm(Model model){ //Model -> 컨트롤러에서 view로 넘어갈떄 attribute를 넘김
        model.addAttribute("memberForm",new Member());
        //빈 MemberForm을 드고가는이유?
        //빈화면이라서 아무것도 없을 수도 있지만 validation을 해주기떄문에 들고간다.
        return "members/createMemberForm";
    }
}
