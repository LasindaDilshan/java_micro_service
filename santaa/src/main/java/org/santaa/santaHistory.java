package org.santaa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class santaHistory {
    @Id
    @SequenceGenerator(
            name = "santaHistory_sequence",
            sequenceName = "santaHistory_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "santaHistory_sequence"
    )
    private Integer id;
    private  Integer customerId;
    private  Boolean isSanta;
    private LocalDateTime createdAt;

}
