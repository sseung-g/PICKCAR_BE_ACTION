package com.pickcar.auth.application;

import com.pickcar.auth.domain.SuperAdmin;
import com.pickcar.auth.infrastructure.SuperAdminRepository;
import java.time.LocalDateTime;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootTest
class SuperAdminServiceTest {

    @Autowired
    private SuperAdminService superAdminService;

    @Autowired
    private SuperAdminRepository superAdminRepository;

    @Test
    @DisplayName("SuperAdmin이 생성되고, id 기반 조회가 가능하다")
    void t001() {
        superAdminService.create();

        SuperAdmin superAdmin = superAdminService.getById(1L);

        Assertions.assertThat(superAdmin).isNotNull();
        Assertions.assertThat(superAdmin.getCreatedAt())
                .isBetween(LocalDateTime.now().minusMinutes(1), LocalDateTime.now());
    }

    @Test
    @DisplayName("id 기반 조회시, 찾지 못하면 특정 예외가 발생한다")
    void t002() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            superAdminService.getById(0L);
        });
    }

}