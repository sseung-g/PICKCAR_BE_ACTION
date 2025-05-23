package com.pickcar.car.domain;

import com.pickcar.global.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@AllArgsConstructor
@Table(name = "cars")
@SuperBuilder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Car extends BaseEntity {

    @Embedded
    private CarInfo info;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private OfferStatus offerStatus;

    @Column(nullable = false)
    private Boolean hasGps;

    @Column(nullable = false)
    private Boolean isRented;

    @Column(nullable = false)
    private Boolean isActive;

}

