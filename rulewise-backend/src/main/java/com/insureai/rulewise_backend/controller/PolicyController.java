package com.insureai.rulewise_backend.controller;




import com.insureai.rulewise_backend.dto.ApiResponse;
import com.insureai.rulewise_backend.entity.Policy;
import com.insureai.rulewise_backend.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/policies")
@CrossOrigin(origins = "*")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @GetMapping("/{cusID}")
    public ResponseEntity<List<Policy>> getAllPolicies(@PathVariable String cusID) {
        return ResponseEntity.ok(policyService.getAllPolicies(cusID));
    }
//    @GetMapping("/{id}")
//    public ResponseEntity<Policy> getPolicyById(@PathVariable Long id) {
//        return ResponseEntity.ok(policyService.getPolicyById(id));
//    }

//    @PostMapping
//    public ResponseEntity<ApiResponse> createPolicy(@RequestBody Policy policy) {
//        Policy created = policyService.createPolicy(policy);
//        return ResponseEntity.ok(new ApiResponse("Policy created successfully", created));
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<ApiResponse> updatePolicy(@PathVariable Long id, @RequestBody Policy policy) {
//        Policy updated = policyService.updatePolicy(id, policy);
//        return ResponseEntity.ok(new ApiResponse("Policy updated successfully", updated));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<ApiResponse> deletePolicy(@PathVariable Long id) {
//        policyService.deletePolicy(id);
//        return ResponseEntity.ok(new ApiResponse("Policy deleted successfully", null));
//    }
}

