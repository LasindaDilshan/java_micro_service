package org.lasi.newcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients({"org.santa.clients"})
public class NewCustomer  {
    public static  void main(String[] args)
    {
        SpringApplication.run(NewCustomer.class,args);
    }

}
