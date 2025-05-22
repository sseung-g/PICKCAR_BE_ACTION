package rental.domain;

import car.domain.Car;
import java.time.LocalDateTime;

@Entity
@Table(name = "rentals")
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 차와 회사는 연관관계로 설정 (지금은 단순 ID 사용)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "company_id", nullable = false)
    private Long companyId;

    private LocalDateTime rentedAt;

    @Enumerated(EnumType.STRING)
    private RentalStatus rentalStatus;

}
