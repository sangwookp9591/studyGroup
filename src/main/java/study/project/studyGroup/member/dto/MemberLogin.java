package study.project.studyGroup.member.dto;


import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter @Setter
public class MemberLogin {

    @NotEmpty(message = " 아이디는 필수 입니다.")
    private String id;
    @NotEmpty(message = " 패스워드는 필수 입니다.")
    private String password;
}
