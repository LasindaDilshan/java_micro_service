package org.santaa;

import org.santa.clients.SantaRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/santa")
@AllArgsConstructor
@Slf4j
public class santaConroller {
    private  final santaService santaService;

    @GetMapping(path= {"customerId"})
    public SantaRequest isSanta(@PathVariable("customerId") Integer customerId){

        boolean isSanta = santaService.isSana(customerId);
        log.info("Santa check for customer {}",customerId);
        return  new SantaRequest(isSanta);

    }
}
