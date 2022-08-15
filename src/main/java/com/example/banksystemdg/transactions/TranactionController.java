package com.example.banksystemdg.transactions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "transaction")
public class TranactionController {

    @Autowired
    private transctionRepositry  transctionRepositry;

    @GetMapping(path = "/all")
    public List<Transactions> getallTransactions(){
        return transctionRepositry.findAll();
    }

    @GetMapping(  "/{id}")
    public Transactions getTransactionsbyid(@PathVariable Integer id)
    {
        Optional<Transactions> result = transctionRepositry.findById(id) ;
        Transactions transactions = new Transactions();
        transactions = null;
        if (result.isPresent()){transactions = result.get();}
        return transactions ;
    }


    @DeleteMapping(path="/delete/{id}")
    public @ResponseBody
    void deletemployee(@PathVariable Integer id) {
        transctionRepositry.deleteById(id);
    }

    @PostMapping(path="/add") // Map ONLY POST Requests
    public String addNewtransaction (@RequestBody Transactions transactions)   {

        transctionRepositry.save(transactions);
        return "add success";
    }
}
