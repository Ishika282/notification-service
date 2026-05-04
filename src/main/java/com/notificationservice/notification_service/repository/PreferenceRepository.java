package com.notificationservice.notification_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.notificationservice.notification_service.model.NotificationPreference;

@Repository
public interface PreferenceRepository extends MongoRepository<NotificationPreference, String> {

}
