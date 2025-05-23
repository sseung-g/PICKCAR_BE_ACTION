package com.pickcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//FIXME: Application 실행 위치
@EntityScan(basePackages = {
        "**.domain"         //FIXME: 와일드 카드 경로 부적절 가능성 있음
})
@EnableJpaAuditing
@SpringBootApplication
public class DomainApplication {
    public static void main(String[] args) {
        SpringApplication.run(DomainApplication.class, args);
    }
}
