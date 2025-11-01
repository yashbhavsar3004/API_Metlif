package com.metlife.claim.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "claims")
@Getter
@Setter
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String claimNo;
    private String customerId;
    private String claimType;
    private LocalDateTime date;
    private String bankAccNo;
    private Double amount;
    private String nominee;
    private String nameOfClaimant;
}

