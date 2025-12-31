package ru.patterns.factorymethod.practice.notification.spring.begin.provider;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.patterns.factorymethod.practice.notification.simple.factory.NotificationFactory;

@Component
public class NotificationFactoryProvider {

  private final Map<String, NotificationFactory> factories;

  @Autowired
  public NotificationFactoryProvider(Map<String, NotificationFactory> factories) {
    this.factories = factories;
  }

  public NotificationFactory getFactory(String type) {
    return factories.getOrDefault(type.toLowerCase(), factories.get("sms"));
  }
}
