package kr.co.handmk.api.service;

import kr.co.handmk.common.domain.Member;
import kr.co.handmk.common.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceCustom {
    private final MemberRepository memberRepository;

    public void signUp() {

        Member newMember = new Member("민기", "sonmingi135@gmail.com", "알통몬");
        memberRepository.save(newMember);
    }

    public String get(){
        return memberRepository.findById(1L).getName();
    }

}
