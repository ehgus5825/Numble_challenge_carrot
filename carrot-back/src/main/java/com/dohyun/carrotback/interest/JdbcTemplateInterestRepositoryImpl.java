package com.dohyun.carrotback.interest;

import org.springframework.stereotype.Repository;

@Repository
public class JdbcTemplateInterestRepositoryImpl implements InterestRepository{

    @Override
    public int insertInterest(String email, int id) {
        return 0;
    }

    @Override
    public int deleteInterest(String email, int id) {
        return 0;
    }
}
