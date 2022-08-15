package com.example.banksystemdg.branch;

import com.example.banksystemdg.transactions.Transactions;
import com.example.banksystemdg.transactions.transctionRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "branch")
public class BranchController {

    @Autowired
    private BranchRepositry BranchRepositry;

    @GetMapping(path = "/all")
    public List<Branch> getallBranch(){
        return BranchRepositry.findAll();
    }

    @GetMapping(  "/{branch_id}")
    public Branch getBranchbyid(@PathVariable Integer branch_id)
    {
        Optional<Branch> result = BranchRepositry.findById(branch_id) ;
        Branch branch = new Branch();
        branch = null;
        if (result.isPresent()){branch = result.get();}
        return branch ;
    }


    @DeleteMapping(path="/delete/{branch_id}")
    public @ResponseBody
    void deletBranch(@PathVariable Integer branch_id) {
        BranchRepositry.deleteById(branch_id);
    }

    @PostMapping(path="/add") // Map ONLY POST Requests
    public String addNewbranch (@RequestBody Branch branch)   {

        BranchRepositry.save(branch);
        return "add success";
    }
}
