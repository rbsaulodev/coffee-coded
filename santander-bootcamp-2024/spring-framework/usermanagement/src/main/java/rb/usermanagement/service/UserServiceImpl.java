package rb.usermanagement.service;

import rb.usermanagement.event.UserCreatedEvent;
import rb.usermanagement.model.User;
import rb.usermanagement.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
// Padrão Singleton (padrão do Spring para @Service), Proxy (@Transactional)
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final ApplicationEventPublisher eventPublisher;

    // Padrão Dependency Injection
    @Autowired
    public UserServiceImpl(UserRepository userRepository, ApplicationEventPublisher eventPublisher) {
        this.userRepository = userRepository;
        this.eventPublisher = eventPublisher;
    }

    @Override
    @Transactional
    public User createUser(User user) {
        User savedUser = userRepository.save(user);
        // Padrão Observer
        eventPublisher.publishEvent(new UserCreatedEvent(this, savedUser));
        return savedUser;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
