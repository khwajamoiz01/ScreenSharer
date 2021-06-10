package com.screen.cast.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/health/check")
    public ResponseEntity<String> healthCheck() {
        return ResponseEntity.ok("success");
    }

}
