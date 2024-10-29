package my.com.mbb.creditapplication.model;

import lombok.Data;
import jakarta.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class CreditApplication {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String applicantName;
    private BigDecimal income;
    private BigDecimal creditScore;
    private BigDecimal requestedAmount;
    private String status;
	
}

