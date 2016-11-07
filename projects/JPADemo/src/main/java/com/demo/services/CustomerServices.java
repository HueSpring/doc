package com.demo.services;

import com.demo.exception.ExceptionForm;
import com.demo.model.Customer;
import com.demo.reponsitory.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServices {

    @Autowired
    CustomerRepository customerRepository;

    public Customer save(String firstName, String lastName, String address, String numberPhone, String email) {
        if (customerRepository.findByEmail(email) != null) {
            ExceptionForm ef = new ExceptionForm("email", ExceptionForm.ERROR_CODE.EXIST, "is already exist");
            throw ef;
        }
        return customerRepository.save(new Customer(firstName, lastName, address, numberPhone, email));
    }

    public Customer findOne(Long id) {
        return customerRepository.findOne(id);
    }

    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer update(Long id, String firstName, String lastName, String address, String numberPhone, String email) {
        Customer customer = findOne(id);
        if (customer != null) {
            if (customerRepository.findByEmail(email) != null) {
                ExceptionForm ef = new ExceptionForm("email", ExceptionForm.ERROR_CODE.EXIST, "is already exist");
                throw ef;
            }
            customer.setFirstName(firstName);
            customer.setLastName(lastName);
            customer.setAddress(address);
            customer.setNumberPhone(numberPhone);
            customer.setEmail(email);
            return customerRepository.save(customer);
        } else {
            ExceptionForm ef = new ExceptionForm("customer_id", ExceptionForm.ERROR_CODE.EXIST, "is already exist");
            throw ef;
        }

    }

    public ResponseEntity delete(Long id) {
        if (!customerRepository.exists(id)) {
            ExceptionForm ef = new ExceptionForm("customer_id", ExceptionForm.ERROR_CODE.EXIST, "is no exist");
            throw ef;
        } else {
            customerRepository.delete(id);
            return new ResponseEntity(HttpStatus.OK);
        }
    }
}
