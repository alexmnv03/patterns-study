package ru.patterns.factorymethod.practice.notification.dynamic;

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
    NotificationFactory factory = NotificationFactoryProvider.getFactory(type);

    factory.sendNotification("Ваш заказ №123 успешно доставлен!");
  }

}
