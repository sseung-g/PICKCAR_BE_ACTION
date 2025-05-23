package com.pickcar.company.application;

import static org.junit.jupiter.api.Assertions.*;

import com.pickcar.company.domain.Company;
import com.pickcar.company.infrastructure.CompanyRepository;
import java.time.LocalDateTime;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
@ActiveProfiles(profiles = "test")
class CompanyServiceTest {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private CompanyRepository companyRepository;

    @Test
    @DisplayName("회사가 생성되고, id 기반 조회가 가능함")
    void t001() {
        companyService.create();

        Company company = companyService.getById(1L);

        Assertions.assertThat(company).isNotNull();
        Assertions.assertThat(company.getCreatedAt())
                .isBetween(LocalDateTime.now().minusMinutes(1), LocalDateTime.now());
    }

    @Test
    @DisplayName("회사의 이름은 같을 수 없음")
    void t002() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy( () -> {
            companyService.create("중복 회사명");
            companyService.create("중복 회사명");
        }).withMessageContaining("회사명");
    }

    @Test
    @DisplayName("회사의 사업자 등록 번호는 같을 수 없음")
    void t003() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy( () -> {
            companyService.create("중복 사업자 번호");
            companyService.create("중복 사업자 번호");
        }).withMessageContaining("사업자 번호");
    }
}