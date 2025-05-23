package com.pickcar.auth.application;

import static org.junit.jupiter.api.Assertions.*;

import com.pickcar.auth.domain.SuperAdmin;
import com.pickcar.auth.domain.User;
import com.pickcar.auth.domain.UserRole;
import com.pickcar.auth.infrastructure.UserRepository;
import java.time.LocalDateTime;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootTest
@ActiveProfiles(profiles = "test")
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;
    
    @Test
    @DisplayName("User가 생성되고, ID 기반 조회가 가능합니다")
    void t001() {
        userService.create();

        User user = userService.getById(1L);

        Assertions.assertThat(user).isNotNull();
        Assertions.assertThat(user.getCreatedAt())
                .isBetween(LocalDateTime.now().minusMinutes(1), LocalDateTime.now());
        Assertions.assertThat(user.getRole()).isNotEqualTo(UserRole.SUPER_ADMIN);
    }
    
    @Test
    @DisplayName("ID 기반 조회시, 올바르지 않은 값 입력시 특정 예외가 발생합니다")
    void t002() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> {
            userService.getById(0L);
        });
    }

}