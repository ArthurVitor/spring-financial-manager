package dev.arthurvitor.financial.manager.application.dto;

import lombok.Getter;

import java.util.Collections;
import java.util.List;

@Getter
public class ApiResponse<T> {
    private final T data;
    private final boolean isSuccess;
    private final List<String> notifications;

    private ApiResponse(T data, boolean isSuccess, List<String> notifications) {
        this.data = data;
        this.isSuccess = isSuccess;
        this.notifications = notifications;
    }

    public static <T> ApiResponse<T> sucess(T data){
        return new ApiResponse<>(data, true, Collections.emptyList());
    }

    public static <T> ApiResponse<T> failure(List<String> notifications) {
        return new ApiResponse<>(null, false, notifications);
    }
}
