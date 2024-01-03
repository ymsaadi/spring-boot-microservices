package com.ymsaadi;

import com.ymsaadi.service.NotificationService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@RequiredArgsConstructor
@Slf4j
public class NotificationServiceApplication {
    private final NotificationService notificationService;

    public static void main(String[] args) {
        SpringApplication.run(NotificationServiceApplication.class, args);
    }

    @KafkaListener(topics = "notificationTopic")
    public void handleNotification(OrderPlacedEvent orderPlacedEvent) {
        // todo send email
        notificationService.sendEmail("test@test.com",
                "Order placed!", "received notification for order - " + orderPlacedEvent.getOrderNumber());
        log.info("received notification for order - {}", orderPlacedEvent.getOrderNumber());
    }
}
