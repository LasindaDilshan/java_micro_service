package org.lasi.newcustomer;


import org.notification.Yom.notificationRequest;
import org.santa.clients.SantaRequest;
import org.santa.clients.santaClientI;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService {
    @Autowired
    private final  CustomerRepository customerRepository;
    @Autowired
    private  final santaClientI santaclient;
//    @Autowired
   // private final RabbitMqMassageProducer rabbitMqMassageProducer;


    public void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        Customer customer = Customer.builder()
                .firstName(customerRegistrationRequest.firstName())
                .lastName(customerRegistrationRequest.lastName())
                .email(customerRegistrationRequest.email())
                .build();

        customerRepository.saveAndFlush(customer);

//        SantaRequest santaRequest = restTemplate.getForObject(
//                "http://SANTA/api/v1/santa/{customerId}",
//                SantaRequest.class,
//                customer.getId()
//        );
        SantaRequest abv = santaclient.isSanta(customer.getId());
        if(abv.isSanta())
        {
            throw new IllegalStateException("Not Santa");
        }

    //    notificationRequest NoReq =
   //             new notificationRequest(customer.getId(), customer.getEmail(),String.format("Hi lasicode"),customer.getFirstName());
//
    //    rabbitMqMassageProducer.publish(NoReq , "internal.exchange","internal.notification.routing.key");

    }
}
