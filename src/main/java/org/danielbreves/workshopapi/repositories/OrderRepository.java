package org.danielbreves.workshopapi.repositories;

import org.aspectj.apache.bcel.Repository;
import org.danielbreves.workshopapi.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
