package ra.edu.hw.microservice.ss02.orderservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.edu.hw.microservice.ss02.orderservice.service.OrderService;

@RestController
@RequestMapping("/api/v1/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @GetMapping("/health-check")
    public ResponseEntity<String> healthCheck() {
        String statusMessage = orderService.checkHealth();
        return ResponseEntity.ok(statusMessage);
    }
}