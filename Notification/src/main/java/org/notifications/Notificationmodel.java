package org.notifications;

import lombok.*;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlID;
import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Notificationmodel {
    @Id
    @SequenceGenerator(
            name="Notification_id_sequence" ,
              sequenceName = "Notification_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Notification_id_sequence"
    )
    private  Integer notificationId;
    private  Integer toCustomerId;
    private String toCustomerEmail;
    private String sender;
    private String message;
    private LocalDateTime sentAt;


}
