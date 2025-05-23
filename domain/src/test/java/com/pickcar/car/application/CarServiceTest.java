package com.pickcar.car.application;

import com.pickcar.car.domain.Car;
import com.pickcar.car.infrastructure.CarRepository;
import java.time.LocalDateTime;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles(profiles = "test")
class CarServiceTest {

    @Autowired
    private CarService carService;

    @Autowired
    private CarRepository carRepository;


    @Test
    @DisplayName("자동차가 생성되고, Id 기반 조회가 가능")
    void t001() {
        carService.create("가123");

        Car car = carService.getById(1L);

        Assertions.assertThat(car).isNotNull();
        Assertions.assertThat(car.getCreatedAt())
                .isBetween(LocalDateTime.now().minusMinutes(1), LocalDateTime.now());
    }

    @Test
    @DisplayName("자동차 번호판이 동일하게 생성되려 한다면, 특정 예외를 반환")
    void t002() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            carService.create("가123");
            carService.create("가123");
        });
    }
}