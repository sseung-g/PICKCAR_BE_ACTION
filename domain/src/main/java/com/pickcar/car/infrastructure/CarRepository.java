package com.pickcar.car.infrastructure;

import com.pickcar.car.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
