package com.youcode.springsecuritylab.repositories;

import com.youcode.springsecuritylab.models.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByUsernameAndPassword(String username, String password);

    User findByUsername(String username);
}
