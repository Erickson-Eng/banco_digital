package com.digitalrepublic.backend.application.dto.response;


import com.digitalrepublic.backend.domain.entity.CheckingAccount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgencyResponse {

    private String id;
    private String name;
    private String localization;

    private String bankId;
    private List<CheckingAccount> accountHolders;
}
