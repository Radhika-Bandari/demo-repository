package com.task1.Students.Controller;

import com.task1.Students.Model.BranchModel;
import com.task1.Students.Service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/branch")
public class BranchController {
    @Autowired
    private BranchService branchService;
        @PostMapping("/createBranch")
    public BranchModel createBranch(@RequestBody final BranchModel branchModel){
        return branchService.createBranch(branchModel);
    }
    @DeleteMapping("/{id}")
    public String deleteBranch(@PathVariable(value = "id") final int branchId) {
        return branchService.deleteBranch(branchId);
    }
}
