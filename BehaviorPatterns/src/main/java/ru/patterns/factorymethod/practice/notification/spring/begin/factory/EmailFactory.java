package ru.patterns.factorymethod.practice.notification.spring.begin.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.patterns.factorymethod.practice.notification.simple.factory.NotificationFactory;
import ru.patterns.factorymethod.practice.notification.simple.notice.EmailNotification;
import ru.patterns.factorymethod.practice.notification.simple.notice.Notification;

@Component("emailF")
public class EmailFactory extends NotificationFactory {

  private final EmailNotification emailNotification;

  @Autowired
  public EmailFactory(EmailNotification emailNotification) {
    this.emailNotification = emailNotification;
  }

  @Override
  public Notification createNotification() {
    return emailNotification;
  }
}
