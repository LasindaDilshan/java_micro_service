package org.notifications;

import org.notification.Yom.notificationRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@AllArgsConstructor
@Slf4j
@Service
public class NotificationSrvice {
    @Autowired
    private final  NotificationRepository notificationRepository ;

    public void send(notificationRequest NotificationRequest){
                notificationRepository.save(
                        Notificationmodel.builder()
                                .toCustomerId(NotificationRequest.toCustomerId())
                                .toCustomerEmail(NotificationRequest.CustomerEmail())
                                .sender("Lasicode")
                                .message(NotificationRequest.message())
                                .sentAt(LocalDateTime.now())
                                .build()
                );
    }
}
