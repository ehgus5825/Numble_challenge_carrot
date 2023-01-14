package com.dohyun.carrotback.member;

import org.springframework.stereotype.Repository;

@Repository
public class JdbcTemplateMemberRepository implements MemberRepository {

    @Override
    public Member selectMember(String email) {
        return null;
    }

    @Override
    public int insertMember(Member member) {
        return 0;
    }

    @Override
    public int updateMember(Member member) {
        return 0;
    }
}
