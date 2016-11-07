package com.demo.controller;

import com.demo.exception.ExceptionController;
import com.demo.exception.ExceptionForm;
import com.demo.model.Customer;
import com.demo.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by NTXHue on 10/13/2016.
 */
@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerServices customerSevices;

    public CustomerController() {
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Customer> save(@Valid @RequestBody CustomerForm form, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ExceptionForm(bindingResult);
        }
        Customer customer = customerSevices.save(form.getFirstName(), form.getLastName(), form.getAddress(), form.getNumberPhone(), form.getEmail());
        return ResponseEntity.ok(customer);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Customer findOne(Long id) {
        return customerSevices.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Customer> findAll() {
        return customerSevices.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public ResponseEntity<Customer> update(@PathVariable(value = "id") Long id, @Valid @RequestBody CustomerForm form, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new ExceptionForm(bindingResult);
        }
        Customer customer = customerSevices.update(id, form.getFirstName(), form.getLastName(), form.getAddress(), form.getNumberPhone(), form.getEmail());
        return ResponseEntity.ok(customer);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public ResponseEntity delete(@PathVariable(value = "id") Long id) {
        return customerSevices.delete(id);
    }

}
