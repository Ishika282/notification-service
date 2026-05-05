package com.notificationservice.notification_service.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.notificationservice.notification_service.enums.NotificationStatus;
import com.notificationservice.notification_service.enums.NotificationType;
import com.notificationservice.notification_service.model.Notification;

@Repository
public interface NotificationRepository extends MongoRepository<Notification, String> {
    
    Page<Notification> findByUserId(String userId, Pageable pageable);

    Page<Notification> findByUserIdAndStatus(String userId, NotificationStatus status, Pageable pageable);

    Page<Notification> findByUserIdAndType(String userId, NotificationType type, Pageable pageable);

}
