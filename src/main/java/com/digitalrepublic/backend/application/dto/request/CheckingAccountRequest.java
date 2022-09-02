package com.digitalrepublic.backend.application.dto.request;

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
public class CheckingAccountRequest {

    @NotBlank
    private String fullName;
    @CPF
    private String cpf;
    @NotBlank
    private String userId;

    private LocalDate birthDate;
    private BigInteger balance;
    private String cellphone;
    private Boolean specialCreditActive;

}
