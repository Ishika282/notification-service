package com.notificationservice.notification_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.notificationservice.notification_service.model.Notification;

@Repository
public interface NotificationRepository extends MongoRepository<Notification, String> {

}
