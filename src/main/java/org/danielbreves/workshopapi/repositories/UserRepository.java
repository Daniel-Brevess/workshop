package org.danielbreves.workshopapi.repositories;

import org.danielbreves.workshopapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
