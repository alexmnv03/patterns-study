package ru.patterns.factorymethod.practice.notification.spring.restver.controller;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.patterns.factorymethod.practice.notification.simple.factory.NotificationFactory;
import ru.patterns.factorymethod.practice.notification.simple.notice.Notification;
import ru.patterns.factorymethod.practice.notification.spring.restver.provider.NotificationFactoryProvider;

@RestController
@RequestMapping("/api")
public class NotificationApiController {

  private final NotificationFactoryProvider factoryProvider;

  public NotificationApiController(NotificationFactoryProvider factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

  //Получение списка доступных типов уведомлений
  @GetMapping("/types")
  public List<String> getNotificationTypes() {
    return null;
    //return factoryProvider.getAvailableTypes();
  }

  //Отправка уведомления выбранного типа
  @GetMapping("/send")
  public String send(
      @RequestParam String type,
      @RequestParam String message) {

    NotificationFactory factory = factoryProvider.getFactory(type);
    Notification notification = factory.createNotification();
    notification.notifyUser(message);

    return "Notification sent via " + type.toUpperCase();
  }
}
