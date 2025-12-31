package ru.patterns.factorymethod.practice.notification.spring.begin.notice;

import org.springframework.stereotype.Service;
import ru.patterns.factorymethod.practice.notification.simple.notice.Notification;

@Service
public class EmailNotification implements Notification {
  @Override
  public void notifyUser(String message) {
    System.out.println("Отправка Email: " + message);
  }
}
