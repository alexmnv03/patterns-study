package ru.patterns.factorymethod.practice.notification.dynamic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import ru.patterns.factorymethod.practice.notification.simple.factory.NotificationFactory;

public class DynamicMain {

  public static void main(String[] args) {
    // Загружаем конфигурацию
    Properties config = new Properties();
    try (FileInputStream fis = new FileInputStream("config.properties")) {
      config.load(fis);
    } catch (IOException e) {
      System.out.println("⚠️ Не удалось загрузить config.properties. Используем значение по умолчанию (SMS).");
    }

    String type = config.getProperty("notification.type", "SMS");
    NotificationFactory factory = DynamicFactoryProvider.getFactory(type);

    factory.sendNotification("Ваш заказ №123 успешно доставлен!");
  }

}
