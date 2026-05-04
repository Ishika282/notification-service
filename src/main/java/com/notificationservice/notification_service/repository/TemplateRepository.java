package com.notificationservice.notification_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.notificationservice.notification_service.model.NotificationTemplate;

@Repository
public interface TemplateRepository extends MongoRepository<NotificationTemplate, String> {

}
