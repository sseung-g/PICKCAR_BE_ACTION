package car.infrastructure;

import car.domain.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
}
