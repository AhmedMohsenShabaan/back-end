package com.example.banksystemdg.account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/account")
public class AccountController {

    @Autowired
    private AccountRepositry AccountRepositry ;

    @GetMapping(path = "/all")
    public List<Account> getallaccount(){
        return AccountRepositry.findAll();
    }

    @GetMapping(  "/{id}")
    public Account getaccountbyid(@PathVariable Integer id)
    {
        Optional<Account> result = AccountRepositry.findById(id) ;
        Account account = new Account();
        account = null;
         if (result.isPresent()){account = result.get();}
        return account ;
    }

//    @GetMapping("/cust/{custid}")
//    public List<AccountDTO> getAccountsOfCustomer(@PathVariable int custid){
//        List<Account> accounts= AccountRepositry.getAccountByCustomer_Id(custid);
//        List<AccountDTO> accountDTOS=new ArrayList<>();
//        for (Account temp : accounts) {
//            accountDTOS.add(new AccountDTO(temp));
//        }
//        if(accounts==null)
//            return null;
//        return accountDTOS;
//    }
    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody void deletaccount(@PathVariable Integer id) {

        AccountRepositry.deleteById(id);
    }

    @PostMapping(path="/add") // Map ONLY POST Requests
    public String addNewaccount (@RequestBody Account account)   {

        AccountRepositry.save(account);
        return "add success";
    }
}
