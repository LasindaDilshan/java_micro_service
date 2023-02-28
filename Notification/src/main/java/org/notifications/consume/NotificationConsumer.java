package org.notifications.consume;


import org.notifications.NotificationSrvice;
import org.notification.Yom.notificationRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class NotificationConsumer {
    private final NotificationSrvice notificationSrvice;

    @RabbitListener(queues = "${rabbitmq.queue.notification}")
    public void consumer(notificationRequest NotificationRequest)
    {
        log.info("Consumed {} from queue",NotificationRequest);
        notificationSrvice.send(NotificationRequest);
    }
}
