package org.notifications;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(
        scanBasePackages = {
                            "com.admq.*","com.notification.*"}

)
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.notifications.*")
public class notification {
    public static  void main(String[] args)
    {
        SpringApplication.run(notification.class,args);
    }
//    @Bean
//    CommandLineRunner commandLineRunner(RabbitMqMassageProducer producer , NotificationConfig notificationConfig){
//        return  args -> {
//            producer.publish(new Customer(1,"lasi"),notificationConfig.getInternalExchange(),notificationConfig.getInternalNotificationRoutingKey());
//        };
//    }
//    record Customer(int id , String name  )
//    {}
}
