package com.pickcar.reservation.application;

import com.pickcar.reservation.domain.Reservation;
import com.pickcar.reservation.domain.ReservationStatus;
import com.pickcar.reservation.infrastructure.ReservationRepository;
import com.pickcar.reservation.presentation.dto.request.ReservationCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public void create(ReservationCreateRequest request) {
        //TODO: 유효성 검사 필요
        Reservation reservation = Reservation.builder()
                .userId(request.userId())
                .vehicleId(request.vehicleId())
                .rentedAt(request.rentedAt())
                .returnedAt(null)                        //FIXME: 반납 시기를 정하기 VS 반납 했을때를 기록하기
                .status(ReservationStatus.RESERVED)     //FIXME: Default로 "예약" 상태로 생성?
                .build();

        reservationRepository.save(reservation);
    }

    public Reservation getById(Long id) {
        return reservationRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] Reservation Not Found By Id " + id));
    }
}
