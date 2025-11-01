package com.metlife.claim.controller;

import com.metlife.claim.entity.Claim;
import com.metlife.claim.service.ClaimService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/claims")
@CrossOrigin(origins = "*")
public class ClaimController {

    private final ClaimService claimService;

    public ClaimController(ClaimService claimService) {
        this.claimService = claimService;
    }

    @PostMapping
    public ResponseEntity<Claim> submitClaim(@RequestBody Claim claim) {

        Claim savedClaim = claimService.submitClaim(claim);
        return ResponseEntity.ok(savedClaim);
//        return ResponseEntity.ok(claimService.submitClaim(claim));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Claim> getClaim(@PathVariable Long id) {
        Optional<Claim> claim = claimService.getClaim(id);
        return claim.map(ResponseEntity::ok).orElse(null);
    }

    @GetMapping
    public ResponseEntity<List<Claim>> getAllClaims() {
        return ResponseEntity.ok(claimService.getAllClaims());
    }
}