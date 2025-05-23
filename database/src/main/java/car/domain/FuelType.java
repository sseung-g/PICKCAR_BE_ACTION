package car.domain;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum FuelType {
    LPG("LPG"),
    PETROL("휘발유"),
    DIESEL("경유"),
    ELECTRIC("전기");

    private final String description;
}
