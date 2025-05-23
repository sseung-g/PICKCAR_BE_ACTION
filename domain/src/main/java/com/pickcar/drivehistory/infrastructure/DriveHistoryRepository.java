package com.pickcar.drivehistory.infrastructure;

import com.pickcar.drivehistory.domain.DriveHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriveHistoryRepository extends JpaRepository<DriveHistory, Long> {
}
