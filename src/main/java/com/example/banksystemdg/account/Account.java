package com.example.banksystemdg.account;

//import com.example.banksystemdg.customer.Customer;
import com.example.banksystemdg.customer.Customer;
import com.example.banksystemdg.transactions.Transactions;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


@Entity
@Table(name="account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "acc_id")
    private int id ;

    @Column(name = "acc_number")
    private String acc_number ;

    @Column(name = "acc_balance")
    private String acc_balance ;

    @Column(name = "acc_type")
    private String acc_type ;

    @Column(name = "is_active")
    private String is_active ;

//    @Column(name = "custID"  )
//    String custID ;

    //one to many relation ,(customer - account ), account as many
    @ManyToOne(targetEntity = Customer.class  , fetch = FetchType.EAGER)
  @JoinColumn(name = "custID",nullable = true )
   private Customer customer;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    //one to many relation ,(transaction - account ), account as one
//    @OneToMany(mappedBy = "account",cascade= {CascadeType.PERSIST, CascadeType.MERGE,
//            CascadeType.DETACH, CascadeType.REFRESH})
//    private List<Transactions> transactions;
//
    public Account() {
    }

//    public Account(Integer acc_id, String acc_number, String acc_balance, String acc_type, String is_active, Customer customer, Set<com.example.banksystemdg.transactions.Transactions> transactions) {
//        this.acc_id = acc_id;
//        this.acc_number = acc_number;
//        this.acc_balance = acc_balance;
//        this.acc_type = acc_type;
//        this.is_active = is_active;
//     //   this.custID = custID;
//        this.customer = customer;
//
//    }

//    public void addTransaction(Transactions temp) {
//        if(transactions== null)
//            transactions = new ArrayList<>();
//
//        transactions.add(temp);
//        temp.setAccount(this);
//    }

//    public List<Transactions> getTransactions() {
//        return transactions;
//    }
//
//    public void setTransactions(List<Transactions> transactions) {
//        this.transactions = transactions;
//    }




    public Integer getAcc_id() {
        return id;
    }

    public void setAcc_id(Integer acc_id) {
        this.id = acc_id;
    }

    public String getAcc_number() {
        return acc_number;
    }

    public void setAcc_number(String acc_number) {
        this.acc_number = acc_number;
    }

    public String getAcc_balance() {
        return acc_balance;
    }

    public void setAcc_balance(String acc_balance) {
        this.acc_balance = acc_balance;
    }

    public String getAcc_type() {
        return acc_type;
    }

    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }

    public String getIs_active() {
        return is_active;
    }

    public void setIs_active(String is_active) {
        this.is_active = is_active;
    }

//    public String getCustID() {
//        return custID;
//    }
//
//    public void setCustID(String custID) {
//        this.custID = custID;
//    }
//    public Customer getcustomer() {
//    return customer;
//}

//    public void setcustomer(Customer customer) {
//        this.customer = customer;
//    }
    @Override
    public String toString() {
        return "Customer{" +
                "acc_id='" + id + '\'' +
                ", acc_number='" + acc_number + '\'' +
                ", acc_balance='" + acc_balance + '\'' +
                ", acc_type='" + acc_type + '\'' +
                ", is_active='" + is_active + '\'' +
//                ", custID='" + custID + '\'' +
                '}';
    }
}
