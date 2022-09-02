package com.digitalrepublic.backend.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgencyRequest {

    private String name;
    private String localization;
    private String bankId;
}
