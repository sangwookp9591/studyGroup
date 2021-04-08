package study.project.studyGroup.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter @Setter
public class Member {

    @Id
    @Column(name = "member_id")
    private String id;

    private String name;

    @Embedded
    private Address address;

    private String nickName;

    private int age;

    @OneToMany(mappedBy = "member")
    private List<MemberStudyGroup> memberStudyGroups = new ArrayList<>();







}
