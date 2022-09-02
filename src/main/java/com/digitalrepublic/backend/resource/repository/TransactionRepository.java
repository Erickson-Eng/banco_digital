package com.digitalrepublic.backend.resource.repository;

import com.digitalrepublic.backend.domain.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {

    Optional<List<Transaction>> findAllByDestinyId(UUID destiny_id);
}