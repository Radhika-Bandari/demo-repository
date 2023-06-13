package com.task1.Students.Service;

import com.task1.Students.Model.BranchModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BranchService {
    private List<BranchModel> branchModels = new ArrayList<>();
    public BranchModel createBranch(BranchModel branchModel){
        branchModels.add(branchModel);
        return branchModel;
    }
    public String deleteBranch(int branchId){
        branchModels.stream().filter(branch->branch.getBranchId() == branchId).forEach(branch-> branchModels.remove(branch));
        return "branch removed";
    }
}
