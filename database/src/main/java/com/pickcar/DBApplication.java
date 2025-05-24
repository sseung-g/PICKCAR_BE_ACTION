package com.pickcar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class DBApplication {
    //FIXME: DB 모듈에 Application이 필요한가? (최초 1회는 실행?)
    public static void main(String[] args) {
        SpringApplication.run(DBApplication.class, args);
    }
}
