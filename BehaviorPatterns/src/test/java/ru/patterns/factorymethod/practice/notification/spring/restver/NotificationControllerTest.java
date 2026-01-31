package ru.patterns.factorymethod.practice.notification.spring.restver;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class NotificationControllerTest {


  @Autowired
  private MockMvc mockMvc;

  @Test
  void testEmailNotification() throws Exception {
    mockMvc.perform(get("/send")
            .param("type", "EMAIL")
            .param("message", "Hello via Email"))
        .andExpect(status().isOk())
        .andExpect(content().string("Notification sent via EMAIL"));
  }

  @Test
  void testSmsNotification() throws Exception {
    mockMvc.perform(get("/send")
            .param("type", "SMS")
            .param("message", "Hi via SMS"))
        .andExpect(status().isOk())
        .andExpect(content().string("Notification sent via SMS"));
  }

  @Test
  void testPushNotification() throws Exception {
    mockMvc.perform(get("/send")
            .param("type", "PUSH")
            .param("message", "Push Works"))
        .andExpect(status().isOk())
        .andExpect(content().string("Notification sent via PUSH"));
  }

  @Test
  void testDefaultNotification() throws Exception {
    mockMvc.perform(get("/send")
            .param("message", "Default channel"))
        .andExpect(status().isOk())
        .andExpect(content().string("Notification sent via SMS"));
  }
}
