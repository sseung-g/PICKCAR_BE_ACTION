package com.pickcar.auth.infrastructure;

import com.pickcar.auth.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
