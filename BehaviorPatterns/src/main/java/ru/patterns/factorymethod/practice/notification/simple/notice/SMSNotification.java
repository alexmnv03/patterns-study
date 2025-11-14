package ru.patterns.factorymethod.practice.notification.simple.notice;

public class SMSNotification implements Notification {
  @Override
  public void notifyUser(String message) {
    System.out.println("📱 Отправка SMS: " + message);
  }
}