package ru.patterns.factorymethod.practice.notification.dynamic;

import java.util.HashMap;
import java.util.Map;
import ru.patterns.factorymethod.practice.notification.simple.factory.EmailFactory;
import ru.patterns.factorymethod.practice.notification.simple.factory.NotificationFactory;
import ru.patterns.factorymethod.practice.notification.simple.factory.PushFactory;
import ru.patterns.factorymethod.practice.notification.simple.factory.SMSFactory;

public class DynamicFactoryProvider {

  private static final Map<String, NotificationFactory> factories = new HashMap<>();

  static {
    factories.put("EMAIL", new EmailFactory());
    factories.put("SMS", new SMSFactory());
    factories.put("PUSH", new PushFactory());
  }

  public static NotificationFactory getFactory(String type) {
    return factories.getOrDefault(type.toUpperCase(), new SMSFactory());
  }
}
