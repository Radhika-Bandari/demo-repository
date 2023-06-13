package com.task1.Students.Service;

import com.task1.Students.Model.StaffModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StaffService {
    private List<StaffModel> staffModels = new ArrayList<>();

    public StaffModel createStaff(StaffModel staffModel) {
        staffModels.add(staffModel);
        return staffModel;
    }
    public List<StaffModel> getStaff (int year){
        List<StaffModel> staffList = staffModels.stream().filter(staf->staf.getSubjects().stream()
                .anyMatch(sub->sub.getYear() == year)).collect(Collectors.toList());
        return staffList;
    }
    public List<StaffModel> getStaffBySubject(int subjectCode){
        List<StaffModel> staffList = staffModels.stream().filter(staffs->staffs.getSubjects().stream().anyMatch(sub->sub.getSubId() == (subjectCode)) && staffs.attendance.get(LocalDate.now())).collect(Collectors.toList());
        return staffList;
    }
    public List<StaffModel> getStaffForMultipleSubjects(int year){
        List<StaffModel> staffList = staffModels.stream().filter(staf->staf.getSubjects().stream().filter(sub->sub.getYear() == year).count()>2).collect(Collectors.toList());
        return staffList;
    }
    public String deleteStaff(int staffId){
        staffModels.stream().filter(staff->staff.getStaffId() == staffId).forEach(staff->staffModels.remove(staff));
        return "staff removed";
    }
}
