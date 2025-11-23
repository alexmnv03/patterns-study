package ru.patterns.factorymethod.practice.notification.simple;

import ru.patterns.factorymethod.practice.notification.simple.factory.EmailFactory;
import ru.patterns.factorymethod.practice.notification.simple.factory.NotificationFactory;
import ru.patterns.factorymethod.practice.notification.simple.factory.PushFactory;
import ru.patterns.factorymethod.practice.notification.simple.factory.SMSFactory;

public class MainSimple {
  public static void main(String[] args) {
    NotificationFactory factory;

    // В реальной ситуации выбор может зависеть от конфигурации, БД, среды и т.д.
    String channel = "SMS";

    switch (channel) {
      case "EMAIL" -> factory = new EmailFactory();
      case "PUSH"  -> factory = new PushFactory();
      default       -> factory = new SMSFactory();
    }

    factory.sendNotification("Ваш заказ успешно оформлен!");
  }
}
