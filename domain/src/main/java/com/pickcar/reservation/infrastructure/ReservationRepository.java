package com.pickcar.reservation.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pickcar.reservation.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
