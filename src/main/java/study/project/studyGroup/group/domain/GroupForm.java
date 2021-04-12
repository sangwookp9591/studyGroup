package study.project.studyGroup.group.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class GroupForm {

    private String title;
    private String content;
    private String category;
}
