package com.task1.Employees.Controller;

import com.task1.Employees.Model.DepartmentModel;
import com.task1.Employees.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/createDept")
    public DepartmentModel createDepartment(@RequestBody final DepartmentModel departmentModel){
        return departmentService.createDepartment(departmentModel);
    }
    @DeleteMapping("/{id}")
    public String deleteDepartment(@PathVariable(value = "{id}") final int deptId){
        return departmentService.deleteDepartment(deptId);
    }
}
