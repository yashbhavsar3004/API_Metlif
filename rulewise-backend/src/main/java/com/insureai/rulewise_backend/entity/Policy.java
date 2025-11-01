package com.insureai.rulewise_backend.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Policies")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Policy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "PolicyNumber", unique = true, nullable = false, length = 50)
    private String policyNumber;

    @Column(name = "PolicyHolderName", nullable = false, length = 100)
    private String policyHolderName;

    @Column(name = "PolicyType", nullable = false, length = 50)
    private String policyType;  // Health, Life, Auto, etc.

    @Column(name = "PremiumAmount", precision = 10, scale = 2, nullable = false)
    private BigDecimal premiumAmount;

    @Column(name = "CoverageAmount", precision = 12, scale = 2, nullable = false)
    private BigDecimal coverageAmount;

    @Column(name = "StartDate", nullable = false)
    private LocalDate startDate;

    @Column(name = "EndDate", nullable = false)
    private LocalDate endDate;

    @Column(name="CustomerId")
    String customerId;

    @Column(name = "Status", length = 20)
    private String status = "ACTIVE"; // default value

    @Column(name = "CreatedAt")
    private LocalDateTime createdAt;

    @Column(name = "UpdatedAt")
    private LocalDateTime updatedAt;



}
