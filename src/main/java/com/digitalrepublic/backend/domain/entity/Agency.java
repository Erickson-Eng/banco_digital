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
@Table(name = "agency")
public class Agency implements Serializable {
    private static final long serialVersionUID = -1188826930014565161L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    private String name;
    private String localization;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH})
    private Bank bank;

    @OneToMany
    private Set<CheckingAccount> accountHolders;


    public UUID getId() {
        return id;
    }

}