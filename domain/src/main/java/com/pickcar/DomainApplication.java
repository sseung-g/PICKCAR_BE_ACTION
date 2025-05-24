package com.pickcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {
        "com.pickcar.auth.domain",
        "com.pickcar.company.domain",
        "com.pickcar.drivehistory.domain",
        "com.pickcar.rental.domain",
        "com.pickcar.reservation.domain",
        "com.pickcar.vehicle.domain"
})
@SpringBootApplication
public class DomainApplication {
    public static void main(String[] args) {
        SpringApplication.run(DomainApplication.class, args);
    }
}
