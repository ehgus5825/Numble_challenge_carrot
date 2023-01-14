package com.dohyun.carrotback.interest;

public interface InterestRepository {

    // 상품에 관심 추가
    int insertInterest(String email, int id);

    // 상품에 관심 제거
    int deleteInterest(String email, int id);

}
