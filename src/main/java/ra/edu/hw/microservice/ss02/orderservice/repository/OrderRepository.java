package ra.edu.hw.microservice.ss02.orderservice.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ra.edu.hw.microservice.ss02.orderservice.entity.Order;

import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {
    Optional<Order> findByOrderCode(String orderCode);
}
