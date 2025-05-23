package com.pickcar.auth.application;

import com.pickcar.auth.domain.User;
import com.pickcar.auth.domain.UserInfo;
import com.pickcar.auth.domain.UserRole;
import com.pickcar.auth.domain.UserStatus;
import com.pickcar.auth.infrastructure.UserRepository;
import com.pickcar.company.application.CompanyService;
import com.pickcar.company.domain.Company;
import com.pickcar.company.domain.ContractStatus;
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
    public void create(Long companyId, UserRole userRole) {

        User user = User.builder()
                .company(companyService.create())   // FIXME: find by companyId
                .info(new UserInfo("email", "password", "name", "phone")) // FIXME
                .status(UserStatus.ACTIVE)
                .role(userRole)
                .build();

        userRepository.save(user);
    }

    public User getById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] User Not Found By Id " + id));
    }
}
