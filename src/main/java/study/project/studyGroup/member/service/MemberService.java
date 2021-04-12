package study.project.studyGroup.member.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import study.project.studyGroup.member.domain.Member;
import study.project.studyGroup.member.dto.MemberLogin;
import study.project.studyGroup.member.repository.MemberRepository;


import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;

    @Transactional //jpa의 모든 데이터 변경이나 로직은 트랜잭션 안에서 다일어나야한다.
    public String join(Member member){
        validateDuplicateMember(member);//중복 회원 검증
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        //EXCEPTION
        List<Member> findMembers = memberRepository.findByName(member.getName());
        if(!findMembers.isEmpty()){
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }

    public Member findOne(String memberId){
        return memberRepository.findById(memberId).get();
    }

    public List<Member> memberList(){
        return memberRepository.findAll();
    }

    public boolean login(MemberLogin memberLogin) {
        Member member = memberRepository.findById(memberLogin.getId()).get();
        if(member.getId().equals(memberLogin.getId()) && member.getPassword().equals(memberLogin.getPassword())){
            return true;
        }else{
            return false;
        }
    }
}
