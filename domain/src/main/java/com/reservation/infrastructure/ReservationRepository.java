package com.reservation.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import reservation.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
