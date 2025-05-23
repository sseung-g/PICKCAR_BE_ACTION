package com.pickcar.car.application;

import com.pickcar.car.domain.Car;
import com.pickcar.car.domain.CarInfo;
import com.pickcar.car.domain.OfferStatus;
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
    public void create(CarInfo info) {

//        //FIXME: 책임 분리 필요
        if(hasLicensePlateAlready(info.getLicensePlate())) {
            throw new IllegalArgumentException("[ERROR] 동일한 번호판을 사용하는 자동차가 이미 존재합니다.");
        }

        //FIXME : 전체적으로 하드코딩 금지
        Car car = Car.builder()
                .info(info)
                .hasGps(true)
                .isRented(false)
                .isActive(true)
                .offerStatus(OfferStatus.OPERABLE)
                .build();

        carRepository.save(car);
    }

    public Car getById(Long id) {
        return carRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] Car Not Found By Id " + id));
    }

    private boolean hasLicensePlateAlready(String licensePlate) {
        return carRepository.findByInfo_LicensePlate(licensePlate).isPresent();
    }
}
