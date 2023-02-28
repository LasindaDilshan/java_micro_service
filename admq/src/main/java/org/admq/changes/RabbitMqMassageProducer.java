package org.admq.changes;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class RabbitMqMassageProducer {

    private final AmqpTemplate amqpTemplate;

    public void publish(Object payload , String exchange , String routingKey)
    {
        try {
            log.info("Publishing yo {} using routingKey{}. Payload:{}", exchange, routingKey, payload);
            amqpTemplate.convertAndSend(exchange, routingKey, payload);
            log.info("Published yo {} using routingKey{}. Payload:{}", exchange, routingKey, payload);
        }
        catch (Exception ex)
        {
            log.info("Error" , ex);

        }

    }
}
