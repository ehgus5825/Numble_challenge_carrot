package com.dohyun.carrotback.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    // 시작화면 (js)
    @GetMapping
    String m0(){
        return null;
    }

    // 시작화면(시작하기) -> 회원가입 (js)
    @PostMapping
    String m1(){
        return null;
    }

    // 로그인(로그인) -> 로그인
    @PostMapping
    String m2(){
        return null;
    }

    // 로그아웃(로그아웃) -> 시작화면
    @GetMapping
    String m3(){
        return null;
    }

    // 중복체크

    // 회원가입

    // 비밀번호 찾기

    // 아이디 찾기

    // 이메일 인증

    // 마이페이지

    // 프로필 수정

}
