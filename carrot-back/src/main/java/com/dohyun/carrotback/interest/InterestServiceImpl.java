package com.dohyun.carrotback.interest;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InterestServiceImpl implements InterestService {

    private final InterestRepository interestRepository;

    @Override
    public int addInterest(String email, int id) {
        return interestRepository.insertInterest(email, id);
    }

    @Override
    public int removeInterest(String email, int id) {
        return interestRepository.deleteInterest(email, id);
    }
}
