package study.project.studyGroup.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import study.project.studyGroup.domain.Member;
import study.project.studyGroup.repository.MemberRepository;


import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MemberService {

    private final MemberRepository memberRepository;


    @Transactional
    public String join(Member member){
        //회원 중복 체크
        validateDuplicateMember(member);
        
        //회원 저장
        memberRepository.save(member);
        return member.getId();
    }

    //회원 중복 체크
    private void validateDuplicateMember(Member member){
        Optional<Member> memberId = memberRepository.findById(member.getId());
      /*  if(!memberId.isEmpty()){
            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }*/
    }


    public Member findOne(String memberId){
        return memberRepository.findById(memberId).get();
    }

    public List<Member> memberList(){
        return memberRepository.findAll();
    }
}
