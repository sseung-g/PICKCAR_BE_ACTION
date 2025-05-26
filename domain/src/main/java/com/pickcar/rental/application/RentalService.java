package com.pickcar.rental.application;

import com.pickcar.rental.domain.Rental;
import com.pickcar.rental.domain.RentalStatus;
import com.pickcar.rental.infrastructure.RentalRepository;
import java.time.LocalDateTime;
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
        /*
        FIXME: 하드코딩이 아닌 DTO 값으로 정해져야 하며, 연관 ID는 실존 여부, 조건 확인이 필요
         예를 들어, 회사와 자동차는 실제로 존재해야 하며, 자동차가 대여중인 경우 대여할 수 없고, 회사와는 계약이 진행중이어야 함
         */
        Rental rental = Rental.builder()
                .vehicleId(1L)
                .companyId(1L)
                .rentedAt(LocalDateTime.now())
                .status(RentalStatus.RENTED)
                .build();

        rentalRepository.save(rental);
    }

    public Rental getById(Long id) {
        return rentalRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] Rental Not Found By Id " + id));
    }
}
