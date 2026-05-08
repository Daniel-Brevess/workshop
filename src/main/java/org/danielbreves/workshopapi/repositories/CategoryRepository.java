package org.danielbreves.workshopapi.repositories;

import org.danielbreves.workshopapi.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    
}
