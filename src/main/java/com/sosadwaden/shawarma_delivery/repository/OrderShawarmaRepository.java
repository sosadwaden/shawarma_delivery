package com.sosadwaden.shawarma_delivery.repository;

import com.sosadwaden.shawarma_delivery.entity.ShawarmaOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderShawarmaRepository extends JpaRepository<ShawarmaOrder, Long> {
}
