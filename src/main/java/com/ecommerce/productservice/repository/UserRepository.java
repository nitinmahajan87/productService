package com.ecommerce.productservice.repository;

import com.ecommerce.productservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, Long> {
//    Optional<User> findById(Long aLong);
    List<User> findByname(String name);
//    User save(User entity);
}
