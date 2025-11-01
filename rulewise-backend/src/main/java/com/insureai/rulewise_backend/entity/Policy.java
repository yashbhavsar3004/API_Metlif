package com.insureai.rulewise_backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "policy_master")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "policy_number", unique = true, nullable = false)
    private String policyNumber;

    @Column(name = "policy_type", nullable = false)
    private String policyType;  // Health, Life, Auto, etc.

    @Column(name = "coverage_amount")
    private BigDecimal coverageAmount;

    @Column(name = "deductible")
    private BigDecimal deductible;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "status")
    private String status; // ACTIVE / INACTIVE
}
