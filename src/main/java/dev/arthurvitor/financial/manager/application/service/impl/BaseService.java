package dev.arthurvitor.financial.manager.application.service.impl;

import dev.arthurvitor.financial.manager.application.context.NotificationContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class BaseService {
    @Autowired()
    private NotificationContext notificationContext;

    public void notify(String message) {
        this.notificationContext.addNotification(message);
    }

    public void notify(List<String> message) {
        this.notificationContext.addNotification(message);
    }
}
