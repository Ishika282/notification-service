package com.notificationservice.notification_service.model;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.notificationservice.notification_service.enums.NotificationChannel;
import com.notificationservice.notification_service.enums.NotificationType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "notification_templates")
public class NotificationTemplate {

    @Id
    private String id;

    private NotificationChannel channel;

    private NotificationType notificationType;

    private String subject;

    private String body;

    private boolean isActive;

    private LocalDateTime createdAt;
}
