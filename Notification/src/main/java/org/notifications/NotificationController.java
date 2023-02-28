package org.notifications;

import org.notification.Yom.notificationRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/notification")
@AllArgsConstructor
@Slf4j
public class NotificationController {
    private final NotificationSrvice notificationSrvice;
    @PostMapping
    public  void sendNotification(@RequestBody notificationRequest NotificationRequest)
    {
        log.info("New notification... {}", NotificationRequest);
        notificationSrvice.send(NotificationRequest);
    }
}
