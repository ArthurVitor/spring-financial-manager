package dev.arthurvitor.financial.manager.presentation;

import dev.arthurvitor.financial.manager.application.context.NotificationContext;
import dev.arthurvitor.financial.manager.application.dto.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseApiController {
    private final  NotificationContext notificationContext;

    public BaseApiController(NotificationContext notificationContext) {
        this.notificationContext = notificationContext;
    }

    protected final <T> ResponseEntity<ApiResponse<T>> result(T data) {
        return result(data, HttpStatus.OK);
    }

    protected final <T> ResponseEntity<ApiResponse<T>> result(T data, HttpStatus status) {
        if (!validOperation()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ApiResponse.failure(notificationContext.getNotifications()));
        }

        return ResponseEntity.status(status).body(ApiResponse.sucess(data));
    }

    private boolean validOperation() {
        return !notificationContext.hasNotifications();
    }
}
