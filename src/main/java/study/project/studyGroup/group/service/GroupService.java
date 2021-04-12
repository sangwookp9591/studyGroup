package study.project.studyGroup.group.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import study.project.studyGroup.group.domain.StudyGroup;
import study.project.studyGroup.group.repository.GroupRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupService {

    private final GroupRepository groupRepository;


    public List<StudyGroup> groupList(){
        return groupRepository.findAll();

    }

}
