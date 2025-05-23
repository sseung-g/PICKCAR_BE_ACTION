package com.pickcar.rental.application;

import com.pickcar.rental.domain.Rental;
import com.pickcar.rental.infrastructure.RentalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class RentalService {

    private final RentalRepository rentalRepository;

    @Transactional
    public void create() {
        //TODO : 렌탈 내역 생성
    }

    public Rental getById(Long id) {
        //TODO : 렌탈 ID 기반 조회
        return null;
    }
}
