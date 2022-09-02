package com.digitalrepublic.backend.domain.entity;

import com.digitalrepublic.backend.domain.entity.enums.TransactionMethod;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "transaction")
public class Transaction implements Serializable {
    private static final long serialVersionUID = 7509346248645075433L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "destiny_id")
    private Account destiny;

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "origin_id")
    private Account origin;

    @NotNull(message = "value is mandatory")
    private BigDecimal value;

    @Enumerated(EnumType.STRING)
    private TransactionMethod transactionMethod;

    public UUID getId() {
        return id;
    }

}