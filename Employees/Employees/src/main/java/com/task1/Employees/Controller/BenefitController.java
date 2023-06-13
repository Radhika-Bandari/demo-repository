package com.task1.Employees.Controller;

import com.task1.Employees.Model.BenefitModel;
import com.task1.Employees.Model.DepartmentModel;
import com.task1.Employees.Service.BenefitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/benefits")
public class BenefitController {
    @Autowired
    private BenefitService benefitService;
    @PostMapping("/createBenefit")
    public BenefitModel createBenefit(@RequestBody final BenefitModel benefitModel){
        return benefitService.createBenefit(benefitModel);
    }
}
