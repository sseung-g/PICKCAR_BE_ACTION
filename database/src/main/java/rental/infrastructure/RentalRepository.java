package rental.infrastructure;

import rental.domain.Rental;

public interface RentalRepository extends JpaRepository<Rental, Long> {
}
