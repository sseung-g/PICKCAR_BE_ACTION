package com.pickcar.car.application;

import com.pickcar.car.domain.Car;
import com.pickcar.car.domain.CarInfo;
import com.pickcar.car.domain.FuelType;
import com.pickcar.car.infrastructure.CarRepository;
import java.time.LocalDateTime;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@Transactional
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
        //FIXME: 제거 필요
        CarInfo testInfo = new CarInfo("model", "color", "licensePlate",
                "carAge", "brandName", FuelType.DIESEL);

        carService.create(testInfo);

        Car car = carService.getById(1L);

        Assertions.assertThat(car).isNotNull();
        Assertions.assertThat(car.getCreatedAt())
                .isBetween(LocalDateTime.now().minusMinutes(1), LocalDateTime.now());
    }

    @Test
    @DisplayName("자동차 번호판이 동일하게 생성되려 한다면, 특정 예외를 반환")
    void t002() {
        //FIXME: 제거 필요
        CarInfo testInfo = new CarInfo("model", "color", "licensePlate",
                "carAge", "brandName", FuelType.DIESEL);

        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            carService.create(testInfo);
            carService.create(testInfo);
        });
    }

    @Test
    @DisplayName("해당 ID를 가진 자동차를 찾지 못한다면 특정 예외를 반환")
    void t003() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            carService.getById(0L);
        });
    }
}