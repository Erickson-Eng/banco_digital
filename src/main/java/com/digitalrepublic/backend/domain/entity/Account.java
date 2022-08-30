package com.digitalrepublic.backend.domain.entity;

import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Account implements Serializable {
    private static final long serialVersionUID = -5505930186832057423L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    @CPF
    private String cpf;

    private LocalDate birthDate;

    private BigInteger balance;

    private String cellphone;

    @OneToOne(cascade = {CascadeType.REFRESH})
    private User user;

}