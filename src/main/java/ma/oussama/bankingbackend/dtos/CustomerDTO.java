package ma.oussama.bankingbackend.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ma.oussama.bankingbackend.entities.BankAccount;

import java.util.List;

@Data
public class CustomerDTO {
    private Long id;
    private String name;
    private String email;
}