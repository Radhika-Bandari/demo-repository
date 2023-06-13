package com.task1.Students.Controller;

import com.task1.Students.Model.StudentModel;
import com.task1.Students.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/createStudent")
    public StudentModel createStudent(@RequestBody final StudentModel studentModel){
        return studentService.createStudent(studentModel);
    }
    @GetMapping("year/{year}")
    public List<StudentModel> getStudents(@PathVariable(value = "year") final int year) {
        return studentService.getStudents(year);
    }
    @GetMapping("present/{year}/{branch}")
    public List<StudentModel> getPresentStudents(@PathVariable(value = "branch") final String branchCode, @PathVariable(value = "year") int year){
        return studentService.getPresentStudents(branchCode,year);
    }
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable(value = "id") final int studentId){
        return studentService.deleteStudent(studentId);
    }
    @GetMapping({"{year}/failed"})
    public List<StudentModel> getFailedStudents(@PathVariable(value = "year") final int year){
        return studentService.getFailedStudents(year);
    }
    @GetMapping("present/{localDate}")
    public String presentStudent(@PathVariable(value = "LocalDate") final LocalDate localDate){
        return studentService.presentStudent(localDate);
    }
}
