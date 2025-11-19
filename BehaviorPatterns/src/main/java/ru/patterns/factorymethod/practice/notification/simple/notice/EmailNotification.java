package ru.patterns.factorymethod.practice.notification.simple.notice;

public class EmailNotification implements Notification {
  @Override
  public void notifyUser(String message) {
    System.out.println("Отправка Email: " + message);
  }
}
