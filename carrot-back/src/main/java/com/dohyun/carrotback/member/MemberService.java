package com.dohyun.carrotback.member;

import org.springframework.stereotype.Service;

public interface MemberService {

    // 로그인
    // - 이메일, 비밀번호로 로그인 여부 확인
    // - 세션 사용? 쿠키 사용?
    // - 로그인 기억 기간 : 1달, 로그아웃 전까지
    Member login(String email);

    // 중복확인
    int emailduplCheck(String email);

    // 회원가입
    // - 이메일, 비밀번호, 이름, 휴대전화, 닉네임으로 등록
    // - 차후에 이메일 인증 기능 추가
    int join(Member member);

    // 프로필 수정 ( 닉네임, 사진 )
    int setProfile(Member member);

    // 마이페이지
    // - 회원 사진, 닉네임 조회
    Member getProfile(String email);
    
    // 이메일 인증
    // 비밀번호 찾기
    // 아이디 찾기
}
