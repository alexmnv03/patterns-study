package ru.patterns.factorymethod.practice.notification.spring.restver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.patterns.factorymethod.practice.notification.simple.factory.NotificationFactory;
import ru.patterns.factorymethod.practice.notification.simple.notice.Notification;
import ru.patterns.factorymethod.practice.notification.spring.restver.provider.NotificationFactoryProvider;

@RestController
@RequestMapping("/notice-send")
public class NotificationController {

  private final NotificationFactoryProvider factoryProvider;

  public NotificationController(NotificationFactoryProvider factoryProvider) {
    this.factoryProvider = factoryProvider;
  }

//  @GetMapping
  public String send(
//      @RequestParam(defaultValue = "SMS") String type,
//      @RequestParam(defaultValue = "Hello!") String message
)
{

  String type = "SMS";
  String message = "SMS";
    System.out.println("Start send");
    NotificationFactory factory = factoryProvider.getFactory(type);
    Notification notification = factory.createNotification();
    notification.notifyUser(message);

    return "Notification sent via " + type.toUpperCase();
  }

  @GetMapping
  public String sends() {
    String type = "SMS";
    String message = "SMS";
    System.out.println("Start send");
    NotificationFactory factory = factoryProvider.getFactory(type);
    Notification notification = factory.createNotification();
    notification.notifyUser(message);

    return "Notification sent via " + type.toUpperCase();
  }

}
