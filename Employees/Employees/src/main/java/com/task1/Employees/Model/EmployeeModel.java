package com.task1.Employees.Model;

import java.util.List;

public class EmployeeModel {
    public int empId;
    public String empName;
    public int salary;
    public DepartmentModel dept;
    public LocationModel location;
    public List<BenefitModel> benefits;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public DepartmentModel getDept() {
        return dept;
    }

    public void setDept(DepartmentModel dept) {
        this.dept = dept;
    }

    public LocationModel getLocation() {
        return location;
    }

    public void setLocation(LocationModel location) {
        this.location = location;
    }

    public List<BenefitModel> getBenefits() {
        return benefits;
    }

    public void setBenefits(List<BenefitModel> benefits) {
        this.benefits = benefits;
    }
}
