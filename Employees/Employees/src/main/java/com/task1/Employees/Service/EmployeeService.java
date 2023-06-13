package com.task1.Employees.Service;

import com.task1.Employees.Model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    private List<EmployeeModel> employeeModels = new ArrayList<>();
    public EmployeeModel createEmployee(EmployeeModel employeeModel){
        employeeModels.add(employeeModel);
        return employeeModel;
    }
    public List<EmployeeModel> employeeInIndia(String locationCountry){
        employeeModels.stream().filter(employee -> employee.getLocation().getLocationCountry().equals(locationCountry)).forEach(employee-> System.out.println("id: " + employee.getEmpId()+
                " name: "+ employee.getEmpName()+
                "salary: "+ employee.getSalary()+
                "locationID: "+ employee.getLocation().getLocationId()+
                "deptId: "+ employee.getDept().deptId+
                "benefitId: "+ employee.getBenefits()));
        return employeeModels;
    }
    public List<EmployeeModel> employeeFromChennaiOrHyderabad(int location1,int location2){
        List<EmployeeModel> newEmp1 = employeeModels.stream()
                .filter(employee -> employee.location.getLocationId() == location1 || employee.location.getLocationId() == location2)
                .collect(Collectors.toList());
        return newEmp1;
    }
    public List<EmployeeModel> getEmployee(){
        employeeModels.stream().forEach(employee-> System.out.println("id: " + employee.getEmpId()+
                " name: "+ employee.getEmpName()+
                "salary: "+ employee.getSalary()+
                "deptName: "+ employee.getDept().getDeptName()+
                "locationName: "+ employee.getLocation().getLocationName()+
                "locationCountry: "+ employee.getLocation().getLocationCountry()));
        return employeeModels;
    }
    public List<EmployeeModel> employeeFromChennaiAndIndia(int locationId){
        List<EmployeeModel> emp2 = employeeModels.stream()
                .filter(employee -> employee.getLocation().getLocationId() == locationId && employee.location.getLocationCountry().equals("India")).collect(Collectors.toList());
        return emp2;
    }
    public List<EmployeeModel> employeeWithBenefits(){
        employeeModels.stream().filter(employee -> employee.getBenefits() != null).forEach(employee -> {
            System.out.println("Employee ID : "+employee.getEmpId()+
                    "Employee Name : "+ employee.getEmpName()
                    +"Benfits : "+ employee.getBenefits());
        });
        return employeeModels;
    }
    public String deleteEmployee(int empId){
        employeeModels.stream().filter(dept->dept.getEmpId() == empId).forEach(dept->employeeModels.remove(dept));
        return "employee deleted";
    }
}
