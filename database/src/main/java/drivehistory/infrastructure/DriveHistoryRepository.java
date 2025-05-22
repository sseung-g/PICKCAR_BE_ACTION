package drivehistory.infrastructure;

import drivehistory.domain.DriveHistory;

public interface DriveHistoryRepository extends JpaRepository<DriveHistory, Long> {
}
