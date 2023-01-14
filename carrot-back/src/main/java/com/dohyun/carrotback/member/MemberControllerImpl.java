package com.dohyun.carrotback.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class MemberControllerImpl implements MemberController {

    private final MemberService memberService;

}
