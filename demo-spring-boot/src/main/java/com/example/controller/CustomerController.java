package com.example.controller;

import com.example.model.Customer;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping("/customers")
    public ResponseEntity<Iterable<Customer>> findAll() {
        Iterable<Customer> customers = customerService.findAll();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @PostMapping("/customers")
    public ResponseEntity<String> save(@RequestBody Customer customer) {
        customerService.save(customer);
        return new ResponseEntity<>("Create Success", HttpStatus.CREATED);
    }

    @PutMapping("/customers/{id}")
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody Customer customer) {
        Optional<Customer> houseOptional = customerService.findById(id);
        if (!houseOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customer.setId(houseOptional.get().getId());
        customerService.save(customer);
        return new ResponseEntity<>("Update Success", HttpStatus.OK);
    }

    @DeleteMapping("/customers/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        Optional<Customer> houseOptional = customerService.findById(id);
        if (!houseOptional.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        customerService.remove(id);
        return new ResponseEntity<>("Remove Success", HttpStatus.OK);
    }
}