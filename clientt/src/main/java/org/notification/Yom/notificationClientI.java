package org.notification.Yom;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient("notification")
public interface notificationClientI {

    @PostMapping("api/v1/notification")
    void sendNotification(notificationRequest NotificationRequest);

}
