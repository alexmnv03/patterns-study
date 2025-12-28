package ru.patterns.factorymethod.practice.notification.spring.begin.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.patterns.factorymethod.practice.notification.simple.factory.NotificationFactory;
import ru.patterns.factorymethod.practice.notification.simple.notice.Notification;
import ru.patterns.factorymethod.practice.notification.simple.notice.PushNotification;

@Component("pushF")
public class PushFactory extends NotificationFactory {

  private final PushNotification pushNotification;

  @Autowired
  public PushFactory(PushNotification pushNotification) {
    this.pushNotification = pushNotification;
  }

  @Override
  public Notification createNotification() {
    return pushNotification;
  }
}
