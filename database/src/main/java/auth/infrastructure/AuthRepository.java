package auth.infrastructure;

import auth.domain.Auth;

public interface AuthRepository extends JpaRepository<Auth, Long> {
}
