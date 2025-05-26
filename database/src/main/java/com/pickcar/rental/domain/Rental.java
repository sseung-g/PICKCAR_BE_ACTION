package com.pickcar.rental.domain;

import com.pickcar.vehicle.domain.Vehicle;
import com.pickcar.company.domain.Company;
import com.pickcar.global.domain.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@AllArgsConstructor
@Table(name = "rentals")
@Builder(toBuilder = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Rental extends BaseEntity {

    private Long vehicleId;

    private Long companyId;

    @Column(nullable = false)
    private LocalDateTime rentedAt;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private RentalStatus status;

}
