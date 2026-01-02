package ru.patterns.factorymethod.practice.notification.spring.begin.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.patterns.factorymethod.practice.notification.simple.factory.NotificationFactory;
import ru.patterns.factorymethod.practice.notification.simple.notice.Notification;
import ru.patterns.factorymethod.practice.notification.spring.begin.notice.SmsNotification;

@Component("smsF")
public class SmsFactory extends NotificationFactory {

  private final SmsNotification smsNotification;

  @Autowired
  public SmsFactory(SmsNotification smsNotification) {
    this.smsNotification = smsNotification;
  }

  @Override
  public Notification createNotification() {
    return smsNotification;
  }
}
