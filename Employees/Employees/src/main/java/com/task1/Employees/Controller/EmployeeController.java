package com.task1.Employees.Controller;

import com.task1.Employees.Model.EmployeeModel;
import com.task1.Employees.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/createEmp")
    public EmployeeModel createEmployee(@RequestBody final EmployeeModel employeeModel){
        return employeeService.createEmployee(employeeModel);
    }
    @GetMapping("/country/{locationCountry}")
    public List<EmployeeModel> employeesInIndia(@PathVariable(value = "locationCountry") final String locationCountry){
        return employeeService.employeeInIndia(locationCountry);
    }
    @GetMapping("/{location1}/{location2}")
    public List<EmployeeModel> employeeFromChennaiOrHyderabad(@PathVariable(value = "location1") final int location1,@PathVariable(value = "location2") final int location2){
        return employeeService.employeeFromChennaiOrHyderabad(location1,location2);
    }
    @GetMapping("/employee")
    public List<EmployeeModel> getEmployee(){
        return employeeService.getEmployee();
    }
    @GetMapping("/location/{locationId}")
    public List<EmployeeModel> employeeFromChennaiAndIndia(@PathVariable(value = "locationId") final int locationId){
        return employeeService.employeeFromChennaiAndIndia(locationId);
    }
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable(value = "{id}") final int empId){
        return employeeService.deleteEmployee(empId);
    }
    @GetMapping("/benefits")
    public List<EmployeeModel> employeeWithBenefits(){
        return employeeService.employeeWithBenefits();
    }
}
