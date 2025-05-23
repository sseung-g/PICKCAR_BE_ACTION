package com.pickcar.car.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CarInfo {

    private String model;

    private String color;

    @Column(nullable = false, unique = true)
    private String licensePlate;

    private String carAge;

    private String brandName;

    @Enumerated(EnumType.STRING)
    private FuelType fuelType;
}
