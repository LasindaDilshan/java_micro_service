package org.notification.Yom;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;
public record notificationRequest (
          Integer toCustomerId,
          String CustomerEmail,

          String message,
          String sender
){


}
