package com.example.banksystemdg.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerServices {

    @Autowired
    private CustomerRepositry CustomerRepositry ;


    public  List<Customer> getall(){
     return CustomerRepositry.findAll();
    }

    public  Customer getcutomerbyid(Integer cust_id){
        Optional<Customer> resulte =  CustomerRepositry.findById(cust_id);
        Customer customer = new Customer() ;
        customer = null ;
        if (resulte.isPresent()){customer = resulte.get();}

        return customer;
    }

    public  void deletecutomer(Integer cust_id) {
        CustomerRepositry.deleteById(cust_id);;
    }
    public  void addNewcustomer(Customer customerx) {
        CustomerRepositry.save(customerx) ;
    }

    public  void updatecustomer(Customer customerx) {
        CustomerRepositry.save(customerx) ;
    }

    @SpringBootApplication
    public static class BanksystemdgApplication {

        public static void main(String[] args) {
            SpringApplication.run(BanksystemdgApplication.class, args);
        }

    }
}
