package com.lucasandrade.security.repository;

import com.lucasandrade.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByEmail(String email);
    /*
    @Query("SELECT u FROM User u WHERE u.email =:email")
    Optional<User> findUserByEmail(@Param("email") String email);
     */
}
