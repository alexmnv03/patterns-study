package ru.patterns.factorymethod.practice.notification.dynamic;

import java.util.HashMap;

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
