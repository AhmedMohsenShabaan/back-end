package com.example.banksystemdg.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface CustomerRepositry extends JpaRepository <Customer,Integer> {

//    @Override
//    Optional<Customer> findById(Integer cust_id);
}
