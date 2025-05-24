package com.pickcar.vehicle.domain;

import com.pickcar.global.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@AllArgsConstructor
@Table(name = "vehicles")
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Vehicle extends BaseEntity {

    @Embedded
    private VehicleInfo info;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private VehicleStatus status;

    @Column(nullable = false)
    private Boolean hasGps;

    @Column(nullable = false)
    private Boolean isRented;

    @Column(nullable = false)
    private Boolean isActive;

}

