package com.task1.Students.Service;

import com.task1.Students.Model.SubjectModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {
  private List<SubjectModel> subjectModels = new ArrayList<>();
  public SubjectModel createSubject (SubjectModel subjectModel){
      subjectModels.add(subjectModel);
      return subjectModel;
  }

}
