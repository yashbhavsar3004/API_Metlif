package com.metlife.claim.entity;


import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "claims")
@Data
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String claimNo;
    private String customerId;
    private String claimType;
    private Date date;
    private String bankAccNo;
    private Double amount;
}

