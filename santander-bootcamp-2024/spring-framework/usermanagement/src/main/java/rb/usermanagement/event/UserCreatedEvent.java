package rb.usermanagement.event;

import lombok.Getter;
import rb.usermanagement.model.User;
import org.springframework.context.ApplicationEvent;

@Getter
// Padrão Observer
public class UserCreatedEvent extends ApplicationEvent {
    private final User user;

    public UserCreatedEvent(Object source, User user) {
        super(source);
        this.user = user;
    }
}
