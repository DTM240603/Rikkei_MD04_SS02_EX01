package ra.edu.hw.microservice.ss02.orderservice.dto.request;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderRequest {
    private String orderCode;
    private Long customerId;
    private BigDecimal totalAmount;
    private String status;
    private LocalDateTime createdAt;
}
