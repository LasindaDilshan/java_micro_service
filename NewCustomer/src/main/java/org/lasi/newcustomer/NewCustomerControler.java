package org.lasi.newcustomer;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
    @Slf4j
    @RestController
    @RequestMapping("api/v1/customers")
    @AllArgsConstructor
    public class NewCustomerControler {
        @Autowired
        private final CustomerService customerService;
        @PostMapping
        public  void  registerCustomer (@RequestBody CustomerRegistrationRequest customerRequest) {
            log.info("new customer registration {}", customerRequest);
            customerService.registerCustomer(customerRequest);
        }
    }
