package com.demo.reponsitory;

/**
 * Created by NTXHue on 10/13/2016.
 */

import com.demo.model.Customer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @Transactional
    @Query("SELECT c.email FROM Customer c WHERE c.email = ?1")
    String findByEmail(String email);

    @Transactional
    @Modifying
    @Query("UPDATE Customer c SET c.lastName = ?1 WHERE c.id = ?2")
    void update(String lastName, Long id);


}
