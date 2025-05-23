package com.pickcar.auth.application;

import com.pickcar.auth.domain.User;
import com.pickcar.auth.infrastructure.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void create() {
        //TODO: 유저 생성 기능 구현
    }

    public User getById(Long id) {
        //TODO: ID 기반 조회 기능 구현

        return null;
    }
}
