package com.dohyun.carrotback.member;

public interface MemberRepository {

    // 회원 조회
    Member selectMember(String email);

    // 회원 등록
    int insertMember(Member member);

    // 회원 수정
    int updateMember(Member member);

    // 이메일 인증
    // 비밀번호 찾기
    // 아이디 찾기
}
