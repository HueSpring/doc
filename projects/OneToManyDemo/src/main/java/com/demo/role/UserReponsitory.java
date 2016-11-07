package com.demo.role;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * Created by Hue on 11/3/2016.
 */
public interface UserReponsitory extends JpaRepository<User, Long>{

    Optional<User> findOneByEmail(String email);
}
