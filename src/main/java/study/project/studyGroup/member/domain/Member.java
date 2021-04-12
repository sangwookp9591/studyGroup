package study.project.studyGroup.member.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import study.project.studyGroup.group.domain.MemberStudyGroup;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter @Setter
@ToString(of = {"id","name","password","phoneNumber","email","gender"}) //team 이런것은 들어가면안된다 왓다리갓다리한다.
public class Member {

    @Id
    @Column(name = "member_id")
    private String id;

    private String name;

/*    @Embedded
    private Address address;*/

/*    private String nickName;*/

    private String password;
    private String phoneNumber;

    private String email;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Member(String id, String name, String password, String phoneNumber, String email, Gender gender) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.gender = gender;
    }

    @OneToMany(mappedBy = "member")
    private List<MemberStudyGroup> memberStudyGroups = new ArrayList<>();







}
