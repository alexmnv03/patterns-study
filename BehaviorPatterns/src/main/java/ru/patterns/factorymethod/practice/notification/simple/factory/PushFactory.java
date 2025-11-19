package ru.patterns.factorymethod.practice.notification.simple.factory;

import ru.patterns.factorymethod.practice.notification.simple.notice.Notification;
import ru.patterns.factorymethod.practice.notification.simple.notice.PushNotification;

public class PushFactory extends NotificationFactory {
  @Override
  public Notification createNotification() {
    return new PushNotification();
  }
}