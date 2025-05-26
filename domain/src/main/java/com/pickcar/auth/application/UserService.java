package com.pickcar.auth.application;

import com.pickcar.auth.domain.User;
import com.pickcar.auth.domain.UserInfo;
import com.pickcar.auth.domain.UserRole;
import com.pickcar.auth.domain.UserStatus;
import com.pickcar.auth.infrastructure.UserRepository;
import com.pickcar.company.application.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

    private final CompanyService companyService;
    private final UserRepository userRepository;

    @Transactional
    public void create(Long companyId, UserRole role) {

        //FIXME: 리팩토링으로 책임 분리
        if (role.equals(UserRole.SUPER_ADMIN)) {
            throw new IllegalArgumentException("[ERROR] User Can't be a Super Admin");
        }

        User user = User.builder()
                .companyId(1L)      //TODO: 있는지 검사 필요
                .info(new UserInfo("email", "password", "name", "phone")) // FIXME
                .status(UserStatus.ACTIVE)
                .role(role)
                .build();

        userRepository.save(user);
    }

    public User getById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] User Not Found By Id " + id));
    }
}
