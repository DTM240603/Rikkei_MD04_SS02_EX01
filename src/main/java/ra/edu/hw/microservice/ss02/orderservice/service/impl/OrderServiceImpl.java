package ra.edu.hw.microservice.ss02.orderservice.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ra.edu.hw.microservice.ss02.orderservice.repository.OrderRepository;
import ra.edu.hw.microservice.ss02.orderservice.service.OrderService;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public String checkHealth() {
        return "Order Service is Up";
    }
}