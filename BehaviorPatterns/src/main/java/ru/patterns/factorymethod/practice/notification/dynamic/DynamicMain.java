package ru.patterns.factorymethod.practice.notification.dynamic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import ru.patterns.factorymethod.practice.notification.simple.factory.NotificationFactory;

public class DynamicMain {

  public static void main(String[] args) {
    // Загружаем конфигурацию
    Properties config = new Properties();


    String curDirPath = "./BehaviorPatterns/src/main/java/ru/patterns/factorymethod/practice/notification/dynamic/";
    File dir = new File(curDirPath);

    if (!dir.exists() || !dir.isDirectory()) {
      System.out.println("Указанный путь не существует или не является директорией.");
      return;
    }

    listFiles(dir, "");


    try (FileInputStream fis =
             new FileInputStream(curDirPath + "config.properties")) {
      config.load(fis);
    } catch (IOException e) {
      System.out.println("Не удалось загрузить config.properties. Используем значение по умолчанию (SMS).");    }


    String type = config.getProperty("notification.type", "SMS");
    NotificationFactory factory = DynamicFactoryProvider.getFactory(type);

    factory.sendNotification("Ваш заказ №123 успешно доставлен!");
  }

  private static void listFiles(File directory, String indentation) {
    File[] filesAndDirs = directory.listFiles();

    if (filesAndDirs != null && filesAndDirs.length > 0) {
      for (File item : filesAndDirs) {
        if (item.isDirectory()) { // Если элемент — директория
          System.out.println(indentation + "DIR: " + item.getName());
          listFiles(item, indentation + "   "); // Переходим глубже в подпапку
        } else { // Иначе это файл
          System.out.println(indentation + "FILE: " + item.getName());
        }
      }
    }
  }
}
