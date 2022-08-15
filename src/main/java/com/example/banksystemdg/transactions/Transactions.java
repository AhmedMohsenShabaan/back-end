package com.example.banksystemdg.transactions;

import com.example.banksystemdg.account.Account;
import com.example.banksystemdg.branch.Branch;
//import com.example.banksystemdg.customer.Customer;

import javax.persistence.*;

@Entity
@Table(name="transactions")
public class Transactions {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        Integer id ;

        @Column(name = "amount")
        String amount ;

        @Column(name = "type")
        String type ;

        @Column(name = "date")
        String date ;

        @Column(name = "is_active")
        String is_active ;

        @Column(name = "acc_reciever")
        String acc_reciever ;

//        @Column(name = "account_id" )
//        String account_id ;


    //one to many relation ,(transcation - account ), transcation as many
    @ManyToOne(targetEntity = Account.class  , fetch = FetchType.EAGER)
    @JoinColumn(name = "account_id",nullable = true )
    private Account account;

        public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIs_active() {
        return is_active;
    }

    public void setIs_active(String is_active) {
        this.is_active = is_active;
    }

    public String getAcc_reciever() {
        return acc_reciever;
    }

    public void setAcc_reciever(String acc_reciever) {
        this.acc_reciever = acc_reciever;
    }

//    public String getaccount_id() {
//        return account_id;
//    }
//
//    public void setaccount_id(String account_id) {
//        this.account_id = account_id;
//    }
//


    @Override
    public String toString() {
        return "Transactions{" +
                "id=" + id +
                ", amount='" + amount + '\'' +
                ", type='" + type + '\'' +
                ", date='" + date + '\'' +
                ", is_active='" + is_active + '\'' +
                ", acc_reciever='" + acc_reciever + '\'' +
//                ", account_id='" + account_id + '\'' +
                '}';
    }
}
