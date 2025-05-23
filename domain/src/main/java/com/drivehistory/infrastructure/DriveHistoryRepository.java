package com.drivehistory.infrastructure;

import drivehistory.domain.DriveHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriveHistoryRepository extends JpaRepository<DriveHistory, Long> {
}
