package com.task1.Employees.Service;

import com.task1.Employees.Model.BenefitModel;
import com.task1.Employees.Model.DepartmentModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartmentService {
    private List<DepartmentModel> departmentModels = new ArrayList<>();
    public DepartmentModel createDepartment(DepartmentModel departmentModel){
        departmentModels.add(departmentModel);
        return departmentModel;
    }
    public String deleteDepartment(int deptId){
        departmentModels.stream().filter(dept->dept.getDeptId() == deptId).forEach(dept->departmentModels.remove(dept));
        return "department deleted";
    }
}
