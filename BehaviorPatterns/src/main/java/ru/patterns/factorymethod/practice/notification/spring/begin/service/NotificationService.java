package ru.patterns.factorymethod.practice.notification.spring.begin.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.patterns.factorymethod.practice.notification.simple.factory.NotificationFactory;
import ru.patterns.factorymethod.practice.notification.spring.begin.provider.NotificationFactoryProvider;

@Service
public class NotificationService {

  private final NotificationFactoryProvider factoryProvider;

  @Value("${notification.type}")
  private String notificationType;

  public NotificationService(NotificationFactoryProvider factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  public void send(String message) {
    NotificationFactory factory = factoryProvider.getFactory(notificationType);
    factory.createNotification().notifyUser(message);
  }
}
