package com.pickcar.drivehistory.application;

import com.pickcar.DomainApplication;
import com.pickcar.drivehistory.domain.DriveHistory;
import com.pickcar.drivehistory.infrastructure.DriveHistoryRepository;
import com.pickcar.drivehistory.presentation.dto.request.DriveHistoryCreateRequest;
import java.time.LocalDateTime;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@ActiveProfiles(profiles = "test")
@SpringBootTest(classes = DomainApplication.class)
class DriveHistoryServiceTest {

    @Autowired
    private DriveHistoryService driveHistoryService;

    @Autowired
    private DriveHistoryRepository driveHistoryRepository;

    @Test
    @DisplayName("운행 일지가 생성되고, ID 기반 조회가 가능함")
    void t001() {
        LocalDateTime now = LocalDateTime.now();
        DriveHistoryCreateRequest testRequest = new DriveHistoryCreateRequest(1L, now, now, now, 1.23D);
        driveHistoryService.create(testRequest);

        DriveHistory history = driveHistoryService.getById(1L);

        Assertions.assertThat(history).isNotNull();
        Assertions.assertThat(history.getCreatedAt())
                .isBetween(java.time.LocalDateTime.now().minusMinutes(1), java.time.LocalDateTime.now());
    }

    @Test
    @DisplayName("ID 기반 조회시, 잘못된 ID 요청인 경우 특정 예외가 발생함")
    void t002() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            driveHistoryService.getById(0L);
        }).withMessageContaining("DriveHistory Not Found By Id");
    }
}