package com.notificationservice.notification_service.model;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "notification_preferences")
public class NotificationPreference {

    @Id
    private String id;

    private String userId;

    private boolean emailEnabled;

    private boolean smsEnabled;

    private boolean pushEnabled;
    
    private Map<String, Boolean> channels;

    private LocalDateTime updatedAt;
}
