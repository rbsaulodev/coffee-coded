package rb.usermanagement.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
// Padrão Observer
public class UserCreatedEventListener {

    @EventListener
    public void handleUserCreatedEvent(UserCreatedEvent event) {
        System.out.println("User created: " + event.getUser().getName());
    }
}
