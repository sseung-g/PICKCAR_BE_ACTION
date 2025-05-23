package com.pickcar.car.application;

import com.pickcar.car.domain.Car;
import com.pickcar.car.infrastructure.CarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CarService {

    private final CarRepository carRepository;

    @Transactional
    public void create(String carPlateNumber) {
        //TODO: Car 생성
    }

    public Car getById(Long id) {
        //TODO: Car id기반 조회
        return null;
    }

}
