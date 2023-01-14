package com.dohyun.carrotback.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Member login(String email) {
        return memberRepository.selectMember(email);
    }

    @Override
    public int emailduplCheck(String email) {
        return 0;
    }

    @Override
    public int join(Member member) {
        return memberRepository.insertMember(member);
    }

    @Override
    public int setProfile(Member member) {
        return memberRepository.updateMember(member);
    }

    @Override
    public Member getProfile(String email) {
        return memberRepository.selectMember(email);
    }
}
