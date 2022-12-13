package com.example.demo;

import com.rbstartup.abstractgateway.dto.payment.PaymentRequestDTO;
import com.rbstartup.abstractgateway.restcontroller.PaymentRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CPaymentRestController implements PaymentRestController {
    @Override
    public ResponseEntity<?> pay(PaymentRequestDTO requestDTO) {
        return ResponseEntity.ok(requestDTO);
    }
}
