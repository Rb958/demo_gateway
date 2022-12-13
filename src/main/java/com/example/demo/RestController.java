package com.example.demo;

import com.rbstartup.abstractgateway.restcontroller.AmountRestController;
import org.springframework.http.ResponseEntity;

@org.springframework.web.bind.annotation.RestController
public class RestController implements AmountRestController {
    @Override
    public ResponseEntity<?> getAmount(String reference) {
        return ResponseEntity.ok("Hello");
    }
}
