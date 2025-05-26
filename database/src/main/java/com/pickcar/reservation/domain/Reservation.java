package com.pickcar.reservation.domain;

import com.pickcar.auth.domain.User;
import com.pickcar.vehicle.domain.Vehicle;
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
@Builder(toBuilder = true)
@Table(name = "reservations")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Reservation extends BaseEntity {

    private Long userId;

    private Long vehicleId;

    @Column(nullable = false)
    private LocalDateTime rentedAt;

    private LocalDateTime returnedAt;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ReservationStatus status;
}
