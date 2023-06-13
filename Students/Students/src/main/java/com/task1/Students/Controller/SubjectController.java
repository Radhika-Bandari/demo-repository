package com.task1.Students.Controller;

import com.task1.Students.Model.SubjectModel;
import com.task1.Students.Service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subjects")
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @PostMapping("/createSubject")
    public SubjectModel createSubject(@RequestBody final SubjectModel subjectModel){
        return subjectService.createSubject(subjectModel);
    }
}
