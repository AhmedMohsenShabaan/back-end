package com.example.banksystemdg.branch;

//import com.example.banksystemdg.customer.Customer;
import com.example.banksystemdg.customer.Customer;
import com.example.banksystemdg.employee.Employee;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="branch")
public class Branch {

        @Id
       private Integer branch_id ;

        @Column(name = "branch_name")
        private String branch_name ;

        @Column(name = "branch_address")
        private  String branch_address ;

//    @OneToMany(mappedBy = "Branch",cascade= {CascadeType.PERSIST, CascadeType.MERGE,
//            CascadeType.DETACH, CascadeType.REFRESH})
//    private List<Customer> Customer;

//    @OneToMany(mappedBy = "Branch",cascade= {CascadeType.PERSIST, CascadeType.MERGE,
//            CascadeType.DETACH, CascadeType.REFRESH})
//    private List<Employee> Employee;
//
//    public Branch() {
//    }
//    public void addCustomer(Customer temp){
//        if(Customer == null)
//            Customer = new ArrayList<>();
//        Customer.add(temp);
//        temp.setBranch(this);
//    }
//    public void addEmployee(Employee temp){
//        if(Employee == null)
//            Employee = new ArrayList<>();
//        Employee.add(temp);
//        temp.setBranch(this);
//
//    }
//    public Branch(Integer branch_id, String branch_name, String branch_address, com.example.banksystemdg.customer.Customer customer, com.example.banksystemdg.employee.Employee employee) {
//        this.branch_id = branch_id;
//        this.branch_name = branch_name;
//        this.branch_address = branch_address;
//
//    }

    public Integer getBranch_id() {
        return branch_id;
    }

    public void setBranch_id(Integer branch_id) {
        this.branch_id = branch_id;
    }

    public String getBranch_name() {
        return branch_name;
    }

    public void setBranch_name(String branch_name) {
        this.branch_name = branch_name;
    }

    public String getBranch_address() {
        return branch_address;
    }

    public void setBranch_address(String branch_address) {
        this.branch_address = branch_address;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "branch_id=" + branch_id +
                ", branch_name='" + branch_name + '\'' +
                ", branch_address='" + branch_address + '\'' +
                '}';
    }
}
