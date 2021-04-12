package study.project.studyGroup.member.dto;

import lombok.Getter;
import lombok.Setter;
import study.project.studyGroup.member.domain.Gender;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class MemberForm {
    @NotEmpty(message = "아이디는 필수 입니다.")
    private String id;
    @NotEmpty(message = "회원 이름은 필수 입니다.")
    private String name;
    @NotEmpty(message = "패스워드는 필수 입니다.")
    private String password;

    private String phoneNumber;

    private String email;

    private Gender gender;

}
