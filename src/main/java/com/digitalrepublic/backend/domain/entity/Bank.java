package com.digitalrepublic.backend.domain.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "bank")
public class Bank implements Serializable {
    private static final long serialVersionUID = -4263894828054388408L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(unique = true, updatable = false, nullable = false)
    private Integer centralBankIdentification;
    @Column(unique = true, nullable = false)
    private String name;

    @OneToMany
    private Set<Agency> agencies;


    public UUID getId() {
        return id;
    }

}