package study.project.studyGroup.group.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import study.project.studyGroup.group.domain.GroupForm;
import study.project.studyGroup.group.domain.StudyGroup;
import study.project.studyGroup.group.service.GroupService;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;


    @GetMapping("group/groupList")
    public String groupList(Model model){
        List<StudyGroup> groups = groupService.groupList();
        model.addAttribute("groups",groups);
        return "group/groupList";
    }

    @GetMapping("group/new")
    public String createGroup(Model model){
        model.addAttribute("groupForm",new GroupForm());
        return "group/createGroup";
    }


/*    @PostMapping("group/save")
    public String save(Model model){
        List<StudyGroup> groups = groupService.save();
        model.addAttribute("groups",groups);
        return "group/groupList";
    }*/
}
