package org.santaa;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
@Service
@AllArgsConstructor
public class santaService {
    private  final santaHisoryrepository santaHisoryrepository;



    public  boolean isSana(Integer customerId){
        santaHisoryrepository.save(santaHistory.builder()
                        .customerId(customerId)
                        .isSanta(false)
                        .createdAt(LocalDateTime.now())
                        .build());
        return  false;
    }


}
