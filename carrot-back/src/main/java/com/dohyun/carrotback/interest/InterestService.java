package com.dohyun.carrotback.interest;

public interface InterestService {

    // 상품에 관심 추가
    int addInterest(String email, int id);

    // 상품에 관심 제거
    int removeInterest(String email, int id);
}
