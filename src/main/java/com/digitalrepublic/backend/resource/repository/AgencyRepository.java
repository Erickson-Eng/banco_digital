package com.digitalrepublic.backend.resource.repository;

import com.digitalrepublic.backend.domain.entity.Agency;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AgencyRepository extends JpaRepository<Agency, UUID> {
}