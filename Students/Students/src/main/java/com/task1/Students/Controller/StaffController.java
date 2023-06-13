package com.task1.Students.Controller;

import com.task1.Students.Model.StaffModel;
import com.task1.Students.Service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/staff")
public class StaffController {
    @Autowired
    private StaffService staffService;
    @PostMapping("/createStaff")
    public StaffModel createStaff(@RequestBody final StaffModel staffModel){
        return staffService.createStaff(staffModel);
    }
    @GetMapping("year/{year}")
    public List<StaffModel> getStaff(@PathVariable(value = "year") final int year){
        return staffService.getStaff(year);
    }
    @GetMapping("subject/{subject}")
    public List<StaffModel> getStaffBySubject(@PathVariable(value = "subject") final int subjectCode){
        return staffService.getStaffBySubject(subjectCode);
    }
    @GetMapping("/{branch}/{year}")
    public List<StaffModel> getStaffBySubjects(@PathVariable(value = "branch") final int branchCode,@PathVariable(value = "year") final int year){
        return staffService.getStaffBySubject(branchCode);
    }
    @GetMapping("/multiSubjects/{year}")
    public List<StaffModel> getStaffForMultipleSubjects(@PathVariable(value = "year") int year){
        return staffService.getStaffForMultipleSubjects(year);
    }
    @DeleteMapping("{id}")
    public String deleteStaff(@PathVariable(value = "id") final int staffId){
        return staffService.deleteStaff(staffId);
    }
}
