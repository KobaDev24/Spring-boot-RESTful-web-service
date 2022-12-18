package com.example.springbootrestfulwebservice.repositories;

import com.example.springbootrestfulwebservice.models.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepository extends JpaRepository<Cart , Long> {

    Optional<Cart> findByName(String name);

    void deleteByName(String name);
}
