package com.pickcar.drivehistory.application;

import com.pickcar.drivehistory.domain.DriveHistory;
import com.pickcar.drivehistory.infrastructure.DriveHistoryRepository;
import com.pickcar.drivehistory.presentation.dto.request.DriveHistoryCreateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class DriveHistoryService {

    private final DriveHistoryRepository driveHistoryRepository;

    @Transactional
    public void create(DriveHistoryCreateRequest request) {
        //TODO: 유효성 검사, request 계산 시기 고려 필요
        DriveHistory history = DriveHistory.builder()
                .reservationId(request.reservationId())
                .drivingStartedAt(request.drivingStartedAt())
                .drivingEndedAt(request.drivingEndedAt())
                .totalDrivingTime(request.totalDrivingTime())
                .totalDistance(request.totalDistance())
                .build();

        driveHistoryRepository.save(history);
    }

    public DriveHistory getById(Long id) {
        return driveHistoryRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] DriveHistory Not Found By Id " + id));
    }
}
