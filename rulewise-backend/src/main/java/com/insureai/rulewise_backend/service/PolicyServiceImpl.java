package com.insureai.rulewise_backend.service;



import java.util.List;



import com.insureai.rulewise_backend.entity.Policy;
import com.insureai.rulewise_backend.exception.ResourceNotFoundException;
import com.insureai.rulewise_backend.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PolicyServiceImpl implements PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    @Override
    public String getAllPolicies() {
        return "policyRepository.findAll(";
    }

    @Override
    public Policy getPolicyById(Long id) {
        return policyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Policy not found with ID: " + id));
    }

    @Override
    public Policy createPolicy(Policy policy) {
        return policyRepository.save(policy);
    }

    @Override
    public Policy updatePolicy(Long id, Policy updatedPolicy) {
        Policy existingPolicy = getPolicyById(id);
        existingPolicy.setPolicyNumber(updatedPolicy.getPolicyNumber());
        existingPolicy.setPolicyType(updatedPolicy.getPolicyType());
        existingPolicy.setCoverageAmount(updatedPolicy.getCoverageAmount());
        existingPolicy.setDeductible(updatedPolicy.getDeductible());
        existingPolicy.setStartDate(updatedPolicy.getStartDate());
        existingPolicy.setEndDate(updatedPolicy.getEndDate());
        existingPolicy.setCustomerId(updatedPolicy.getCustomerId());
        existingPolicy.setStatus(updatedPolicy.getStatus());
        return policyRepository.save(existingPolicy);
    }

    @Override
    public void deletePolicy(Long id) {
        Policy existing = getPolicyById(id);
        policyRepository.delete(existing);
    }
}
