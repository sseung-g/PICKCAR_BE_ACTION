package com.rental.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import rental.domain.Rental;

public interface RentalRepository extends JpaRepository<Rental, Long> {
}
