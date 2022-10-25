package com.portfoliogiorgis.Giorgis.repository;

import com.portfoliogiorgis.Giorgis.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
