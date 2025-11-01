package com.insureai.rulewise_backend.service;


import com.insureai.rulewise_backend.entity.Policy;

import java.util.List;

public interface PolicyService {
    String getAllPolicies();
    Policy getPolicyById(Long id);
    Policy createPolicy(Policy policy);
    Policy updatePolicy(Long id, Policy policy);
    void deletePolicy(Long id);
}
