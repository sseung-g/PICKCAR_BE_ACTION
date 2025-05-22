package drivehistory.domain;

import java.time.LocalDateTime;

@Entity
@Table(name = "drive_histories")
public class DriveHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long linkedReservationId;

    private LocalDateTime drivingStartedAt;

    private LocalDateTime drivingEndedAt;

    private Double totalDistance;

    private LocalDateTime totalDrivingTime;
}
