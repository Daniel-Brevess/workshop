package org.danielbreves.workshopapi.repositories;

import org.danielbreves.workshopapi.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
