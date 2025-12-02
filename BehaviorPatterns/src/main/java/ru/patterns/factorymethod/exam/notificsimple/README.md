# Экзамен по паттерну абстрактная фабрика простая реализация

задание для экзамена

1. Пусть у нас есть система уведомлений (notifications), которая должна уметь отправлять сообщения пользователю по разным каналам — Email, SMS, Push.

Мы заранее не знаем, какой именно тип уведомления потребуется, и хотим, чтобы наш основной код (например, сервис уведомлений) не зависел от конкретных классов уведомлений.

Для этого применим Фабричный метод.
Вот структура проекта
notice
├── Notification.java
├──	EmailNotification.java
├── SMSNotification.java
├── PushNotification.java
│
factory
├── NotificationFactory.java
├── EmailFactory.java
├── SMSFactory.java
├── PushFactory.java
│
├── NotificationFactoryProvider.java
├── NotificationService.java
│
└── NotificationApplication.java

2. Вариант подключения через проперти

Немного улучшим наш пример вынесем в проперти описание нужного типа провайдера и получения его от туда

3. 