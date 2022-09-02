package com.digitalrepublic.backend.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import java.math.BigInteger;
import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckingAccountResponse {

    private String fullName;
    private String cpf;

    private LocalDate birthDate;
    private BigInteger balance;
    private String cellphone;
    private Boolean specialCreditActive;

    private String userId;
    private String agencyId;

}
