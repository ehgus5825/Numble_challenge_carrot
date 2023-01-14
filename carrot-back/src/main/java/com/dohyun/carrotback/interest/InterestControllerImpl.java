package com.dohyun.carrotback.interest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class InterestControllerImpl implements InterestController {

    private final InterestService interestService;


}
