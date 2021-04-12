package study.project.studyGroup.member.dto;

import com.querydsl.core.annotations.QueryProjection;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //기본생성자 안만들면 Qbean.newInstance 오류발생
@NoArgsConstructor
public class MemberDto {

    //다들고오는게아니라 username , age만 들고오고 싶어 만든 dto
    private String username;
    private int age;

    @QueryProjection
    public MemberDto(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
