package org.danielbreves.workshopapi.repositories;

import org.danielbreves.workshopapi.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
