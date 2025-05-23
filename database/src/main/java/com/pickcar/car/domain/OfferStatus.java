package com.pickcar.car.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum OfferStatus {
    OPERABLE("운행 가능"),
    UNDER_INSPECTION("점검중"),
    DAMAGED("파손됨");

    private final String description;
}
