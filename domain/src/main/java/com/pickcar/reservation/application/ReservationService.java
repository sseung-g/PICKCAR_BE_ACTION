package com.pickcar.reservation.application;

import com.pickcar.reservation.domain.Reservation;
import com.pickcar.reservation.infrastructure.ReservationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationService {
    
    private final ReservationRepository reservationRepository;
    
    public void create() {
        //TODO: 예약 생성
    }
    
    public Reservation getById(Long id) {
        //TODO: ID 기반 조회
        return null;
    }
}
