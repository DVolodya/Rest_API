package org.example.rest_api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.rest_api.Eat.User;


public interface UserRepository extends JpaRepository<User, Long> {
}
