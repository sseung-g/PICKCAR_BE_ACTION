package com.pickcar.drivehistory.domain;

import com.pickcar.global.domain.BaseEntity;
import com.pickcar.reservation.domain.Reservation;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "drive_histories")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class DriveHistory extends BaseEntity {

    private Long reservationId;

    @Column(nullable = false)
    private LocalDateTime drivingStartedAt;

    private LocalDateTime drivingEndedAt;

    private Double totalDistance;

    private LocalDateTime totalDrivingTime;
}
