package com.digitalrepublic.backend.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankResponse {

    private String id;
    private Integer centralBankIdentification;
    private String name;

}
