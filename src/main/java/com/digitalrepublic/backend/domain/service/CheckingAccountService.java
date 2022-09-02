package com.digitalrepublic.backend.domain.service;

import com.digitalrepublic.backend.application.dto.request.CheckingAccountRequest;

public interface CheckingAccountService {

    void registerCheckingAccount(CheckingAccountRequest checkingAccountRequest);

    void updateCheckingAccount(String cpf, CheckingAccountRequest checkingAccountRequest);

    void deleteAccount(String cpf);
}
