package com.pickcar.reservation.presentation.dto.request;

import java.time.LocalDateTime;

//FIXME: "예약을 하다" 에 걸맞는 네이밍 필요
public record ReservationCreateRequest(
        Long userId,
        Long vehicleId,
        LocalDateTime rentedAt
) {
}
