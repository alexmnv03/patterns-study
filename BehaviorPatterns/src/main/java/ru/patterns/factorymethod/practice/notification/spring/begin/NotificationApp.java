package ru.patterns.factorymethod.practice.notification.spring.begin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.patterns.factorymethod.practice.notification.spring.begin.service.NotificationService;

@SpringBootApplication
public class NotificationApp implements CommandLineRunner {

  private final NotificationService notificationService;

  public NotificationApp(NotificationService notificationService) {
    this.notificationService = notificationService;
  }

  public static void main(String[] args) {
    SpringApplication.run(NotificationApp.class, args);
  }

  @Override
  public void run(String... args) {
    notificationService.send("Ваш заказ успешно обработан!");
  }
}
