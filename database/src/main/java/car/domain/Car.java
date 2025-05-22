package car.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private String color;

    @Column(nullable = false)
    private String licensePlate;

    @Column(nullable = false)
    private String carAge;

    @Column(nullable = false)
    private String brandName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Fuel fuelType;

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

