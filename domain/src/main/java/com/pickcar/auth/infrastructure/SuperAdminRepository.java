package com.pickcar.auth.infrastructure;

import com.pickcar.auth.domain.SuperAdmin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuperAdminRepository extends JpaRepository<SuperAdmin, Long> {
}
