package reservation.infrastructure;

import reservation.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
