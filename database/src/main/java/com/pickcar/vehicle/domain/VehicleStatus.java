package com.pickcar.vehicle.domain;

public enum VehicleStatus {
    OPERABLE("운행 가능"),
    UNDER_INSPECTION("점검중"),
    DAMAGED("파손됨");

    private final String description;

    VehicleStatus(String description) {
        this.description = description;
    }
}
