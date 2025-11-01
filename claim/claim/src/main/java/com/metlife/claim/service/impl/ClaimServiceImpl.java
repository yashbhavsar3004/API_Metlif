package com.metlife.claim.service.impl;

import com.metlife.claim.entity.Claim;
import com.metlife.claim.repo.ClaimRepository;
import com.metlife.claim.service.ClaimService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClaimServiceImpl implements ClaimService {

    private final ClaimRepository repository;

    public ClaimServiceImpl(ClaimRepository repository) {
        this.repository = repository;
    }

    @Override
    public Claim submitClaim(Claim claim) {
       return this.repository.save(claim);
    }

    @Override
    public Optional<Claim> getClaim(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Claim> getAllClaims() {
        return repository.findAll();
    }
}
