package study.project.studyGroup.group.domain;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Notice {

    @Id
    @GeneratedValue
    @Column(name = "notice_id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "study_group_id")
    private StudyGroup studyGroup;


}
