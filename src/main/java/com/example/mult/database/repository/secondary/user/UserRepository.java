package com.example.mult.database.repository.secondary.user;

import com.example.mult.database.entity.secondary.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}