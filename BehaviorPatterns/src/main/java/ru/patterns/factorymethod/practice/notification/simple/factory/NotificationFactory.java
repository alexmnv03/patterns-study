package ru.patterns.factorymethod.practice.notification.simple.factory;

import ru.patterns.factorymethod.practice.notification.simple.notice.Notification;

public abstract class NotificationFactory {
  // Фабричный метод
  public abstract Notification createNotification();

  // Общая логика для всех фабрик
  public void sendNotification(String message) {
    Notification notification = createNotification();
    notification.notifyUser(message);
  }
}