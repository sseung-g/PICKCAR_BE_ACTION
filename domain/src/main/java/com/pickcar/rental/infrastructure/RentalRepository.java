package com.pickcar.rental.infrastructure;

import com.pickcar.rental.domain.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Long> {
}
