package com.pickcar.vehicle.infrastructure;

import com.pickcar.vehicle.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}
