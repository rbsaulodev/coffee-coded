package rb.usermanagement.service;

import rb.usermanagement.model.User;
import java.util.List;

// Padrão Facade
public interface UserService {
    User createUser(User user);
    List<User> getAllUsers();
}