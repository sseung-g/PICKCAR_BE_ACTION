package com.pickcar.drivehistory.presentation.dto.request;

import java.time.LocalDateTime;

public record DriveHistoryCreateRequest(
        Long reservationId,
        LocalDateTime drivingStartedAt,
        LocalDateTime drivingEndedAt,
        LocalDateTime totalDrivingTime,
        Double totalDistance
) {
}
