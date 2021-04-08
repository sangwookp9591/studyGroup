package study.project.studyGroup.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StudyGroup {

    @Id
    @GeneratedValue
    @Column(name = "study_group_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "studyGroup")
    private List<MemberStudyGroup> memberStudyGroups = new ArrayList<>();

    private String leaderId;

    @Enumerated(EnumType.STRING)
    private GroupStatus status;


    @OneToOne(mappedBy = "studyGroup")
    private Notice notice;

}
