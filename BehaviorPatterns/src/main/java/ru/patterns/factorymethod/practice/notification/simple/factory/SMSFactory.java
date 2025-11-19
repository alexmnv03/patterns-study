package ru.patterns.factorymethod.practice.notification.simple.factory;

import ru.patterns.factorymethod.practice.notification.simple.notice.Notification;
import ru.patterns.factorymethod.practice.notification.simple.notice.SMSNotification;

public class SMSFactory extends NotificationFactory {
  @Override
  public Notification createNotification() {
    return new SMSNotification();
  }
}