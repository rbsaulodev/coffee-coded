package rb.usermanagement;

import rb.usermanagement.model.User;
import rb.usermanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final UserService userService;

    @Autowired
    public DataLoader(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Criando usuários iniciais
        User user1 = new User();
        user1.setName("John Doe");
        user1.setEmail("john.doe@example.com");

        User user2 = new User();
        user2.setName("Jane Smith");
        user2.setEmail("jane.smith@example.com");

        User user3 = new User();
        user3.setName("Alice Johnson");
        user3.setEmail("alice.johnson@example.com");

        // Salvando usuários no banco de dados
        userService.createUser(user1);
        userService.createUser(user2);
        userService.createUser(user3);
    }
}
