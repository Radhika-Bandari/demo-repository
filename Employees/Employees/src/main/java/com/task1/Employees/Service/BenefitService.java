package com.task1.Employees.Service;

import com.task1.Employees.Model.BenefitModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BenefitService {
   private List<BenefitModel> benefitModels = new ArrayList<>();
   public BenefitModel createBenefit(BenefitModel benefitModel){
       benefitModels.add(benefitModel);
       return benefitModel;
   }
}
