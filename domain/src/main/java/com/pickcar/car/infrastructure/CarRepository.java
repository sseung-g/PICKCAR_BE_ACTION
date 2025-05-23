package com.pickcar.car.infrastructure;

import com.pickcar.car.domain.Car;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
    Optional<Car> findByInfo_LicensePlate(String licensePlate);
}
