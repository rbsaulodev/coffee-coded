package rb.usermanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rb.usermanagement.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
