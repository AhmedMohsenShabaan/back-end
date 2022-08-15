package com.example.banksystemdg.employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(path = "/employee")
public class employeeContorller {



        @Autowired
        private employeeRepositry  employeeRepositry ;

        @GetMapping(path = "/all")
        public List<Employee> getallemployee(){
            return employeeRepositry.findAll();
        }

        @GetMapping(  "/{cust_id}")
        public Employee getemployeebyid(@PathVariable Integer emp_id)
        {
            Optional<Employee> result = employeeRepositry.findById(emp_id) ;
            Employee employee = new Employee();
            employee = null;
            if (result.isPresent()){employee = result.get();}
            return employee ;
        }


        @DeleteMapping(path="/delete/{acc_id}")
        public @ResponseBody void deletemployee(@PathVariable Integer emp_id) {
            employeeRepositry.deleteById(emp_id);
        }

        @PostMapping(path="/add") // Map ONLY POST Requests
        public String addNewemployee (@RequestBody Employee employee)   {

            employeeRepositry.save(employee);
            return "add success";
        }
}
