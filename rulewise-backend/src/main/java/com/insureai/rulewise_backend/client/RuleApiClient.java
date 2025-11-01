package com.insureai.rulewise_backend.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RuleApiClient {

    private final RestTemplate restTemplate;

    // Call through gateway
    @Value("${rule.api.url:http://localhost:8080/rule}")
    private String ruleBaseUrl;

    public RuleApiClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Object getAllRules() {
        String url = ruleBaseUrl + "/api/rules";
        return restTemplate.getForObject(url, Object.class);
    }

    public Object getRuleById(Long id) {
        String url = ruleBaseUrl + "/api/rules/" + id;
        return restTemplate.getForObject(url, Object.class);
    }

    public Object evaluateClaim(Object claimData) {
        String url = ruleBaseUrl + "/api/rules/evaluate";
        return restTemplate.postForObject(url, claimData, Object.class);
    }
}
