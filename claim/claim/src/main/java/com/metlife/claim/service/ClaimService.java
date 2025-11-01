package com.metlife.claim.service;

import com.metlife.claim.entity.Claim;

import java.util.List;
import java.util.Optional;

public interface ClaimService {
    Claim submitClaim(Claim claim);
    Optional<Claim> getClaim(Long id);
    List<Claim> getAllClaims();
}
