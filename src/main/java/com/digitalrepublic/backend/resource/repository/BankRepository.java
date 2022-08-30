package com.digitalrepublic.backend.resource.repository;

import com.digitalrepublic.backend.domain.entity.Bank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BankRepository extends JpaRepository<Bank, UUID> {
}