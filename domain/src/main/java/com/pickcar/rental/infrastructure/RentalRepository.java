package com.pickcar.rental.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import com.pickcar.rental.domain.Rental;

public interface RentalRepository extends JpaRepository<Rental, Long> {
}
