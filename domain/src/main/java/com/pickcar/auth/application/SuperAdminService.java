package com.pickcar.auth.application;

import com.pickcar.auth.domain.SuperAdmin;
import com.pickcar.auth.domain.UserInfo;
import com.pickcar.auth.domain.UserStatus;
import com.pickcar.auth.infrastructure.SuperAdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SuperAdminService {

    private final SuperAdminRepository superAdminRepository;

    public void create() {
        SuperAdmin superAdmin = SuperAdmin.builder()
                .info(new UserInfo("email", "password", "name", "phoneNumber")) //FIXME
                .status(UserStatus.ACTIVE)
                .build();

        superAdminRepository.save(superAdmin);
    }

    public SuperAdmin getById(Long id) {
        return superAdminRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("[ERROR] Super Admin Not Found By Id :" + id));
    }

}
