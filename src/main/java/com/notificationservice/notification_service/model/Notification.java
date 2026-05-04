package com.notificationservice.notification_service.model;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.notificationservice.notification_service.enums.NotificationChannel;
import com.notificationservice.notification_service.enums.NotificationStatus;
import com.notificationservice.notification_service.enums.NotificationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data               // generates getters, setters, toString, equals
@NoArgsConstructor  // genarets no-arguments constructor
@AllArgsConstructor // generates all-arguments constructor
@Document(collection = "notifications")
public class Notification {

    @Id
    private String id;

    private int notificationId;

    private String userId;

    private NotificationType notificationType;

    private NotificationChannel notificationChannel;

    private String title;

    private String message;

    private NotificationStatus status;

    private Map<String, Object> metadata;

    private int retryCount;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime readAt;

    
}
