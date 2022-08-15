package com.example.banksystemdg.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


// @ResponseBody means the returned String is the response, not a view name
// @RequestParam means it is a parameter from the GET or POST request

@RestController
@RequestMapping(path = "/customer")
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class CustomerController {

    @Autowired
    private CustomerServices CustomerServices ;


    @GetMapping(path = "/all")
    public List<Customer> getallcutomer(){
        return CustomerServices.getall();
    }

    @GetMapping(  "/{cust_id}")
    public Customer getcutomerbyid(@PathVariable Integer cust_id){
        return CustomerServices.getcutomerbyid(cust_id);
    }


    @DeleteMapping(path="/delete/{cust_id}")
    public @ResponseBody void deletecutomer(@PathVariable Integer cust_id) {
        CustomerServices.deletecutomer(cust_id);
    }

    @PostMapping(path="/add") // Map ONLY POST Requests
    public String addNewcustomer (@RequestBody Customer customerx)   {

        CustomerServices.addNewcustomer(customerx);
        return "add success";
    }

    @PostMapping(path="/update") // Map ONLY POST Requests
    public String updatecustomer (@RequestBody Customer customerx)   {

        CustomerServices.updatecustomer(customerx);
        return "add success";
    }

}
