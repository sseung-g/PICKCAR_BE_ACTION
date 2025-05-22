package user.infrastructure;

import user.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
