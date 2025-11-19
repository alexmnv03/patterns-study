package ru.patterns.factorymethod.practice.notification.simple.factory;

import ru.patterns.factorymethod.practice.notification.simple.notice.EmailNotification;
import ru.patterns.factorymethod.practice.notification.simple.notice.Notification;

public class EmailFactory extends NotificationFactory {
  @Override
  public Notification createNotification() {
    return new EmailNotification();
  }
}
