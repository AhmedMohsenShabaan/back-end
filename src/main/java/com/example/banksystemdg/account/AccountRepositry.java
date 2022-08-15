package com.example.banksystemdg.account;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountRepositry extends JpaRepository<Account ,Integer> {

//    List<Account> getAccountByCustomer_Id(int cust_id);
}
