package com.digitalrepublic.backend.domain.entity;

import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "checking_account")
public class CheckingAccount extends Account {

    private static final long serialVersionUID = -7463709277145325908L;
    private Boolean specialCreditActive;
}