package dev.arthurvitor.financial.manager.application.context;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.ArrayList;
import java.util.List;

@Component
@RequestScope
public class NotificationContext {
    private final List<String> notifications = new ArrayList<>();

    public void addNotification(String message) {
        notifications.add(message);
    }

    public void addNotification(List<String> message) {
        notifications.addAll(message);
    }

    public List<String> getNotifications() {
        return notifications;
    }

    public boolean hasNotifications(){
        return !notifications.isEmpty();
    }
}
