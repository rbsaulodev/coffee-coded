package rb.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rb.userdept.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
