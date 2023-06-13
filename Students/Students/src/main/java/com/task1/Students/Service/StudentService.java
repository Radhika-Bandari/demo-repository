package com.task1.Students.Service;

import com.task1.Students.Model.StudentModel;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StudentService {
    private List<StudentModel> studentModels = new ArrayList<>();
    public StudentModel createStudent(StudentModel studentModel){
        studentModels.add(studentModel);
        return studentModel;
    }
    public List<StudentModel> getStudents(int year){
        List<StudentModel> students = studentModels.stream().filter(stud->stud.getYear() == year).collect(Collectors.toList());
        return students;
    }
    public List<StudentModel> getPresentStudents(String branchCode, int year){
        List<StudentModel> students = studentModels.stream().filter(stud->stud.year == year && stud.branch.equals(branchCode) && stud.attendance.get(LocalDate.now())).collect(Collectors.toList());
        return students;
    }
    public String deleteStudent(int studentId){
        studentModels.stream().filter(stud->stud.getStudId() == studentId).forEach(stud->studentModels.remove(stud));
        return "student deleted";
    }
    public List<StudentModel> getFailedStudents (int year){
        List<StudentModel> studentList = studentModels.stream().filter(student-> student.getYear() == year && student.getMarks().values().stream().anyMatch(mark -> mark < 35)).collect(Collectors.toList());
        return studentList;
    }
    public String presentStudent(LocalDate localDate){
        List<StudentModel> students = studentModels.stream().filter(stud->stud.getAttendance().equals(localDate)).collect(Collectors.toList());
        return students.toString();
    }
}
