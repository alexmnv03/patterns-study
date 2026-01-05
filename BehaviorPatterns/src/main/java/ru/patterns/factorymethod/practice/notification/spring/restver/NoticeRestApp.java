package ru.patterns.factorymethod.practice.notification.spring.restver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
    "ru.patterns.factorymethod.practice.notification.spring.begin.notice",
    "ru.patterns.factorymethod.practice.notification.spring.begin.factory",
    "ru.patterns.factorymethod.practice.notification.spring.restver"})
public class NoticeRestApp {

  public static void main(String[] args) {
    SpringApplication.run(NoticeRestApp.class, args);
  }
}
