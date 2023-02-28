package org.santa.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("SANTA")
public interface santaClientI {
    @GetMapping(path="api/v1/santa/{customerId}")
      SantaRequest isSanta(@PathVariable("customerId") Integer customerId);
}
