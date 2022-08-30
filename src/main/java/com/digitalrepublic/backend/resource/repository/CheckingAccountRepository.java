package com.digitalrepublic.backend.resource.repository;

import com.digitalrepublic.backend.domain.entity.CheckingAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CheckingAccountRepository extends JpaRepository<CheckingAccount, UUID> {
}