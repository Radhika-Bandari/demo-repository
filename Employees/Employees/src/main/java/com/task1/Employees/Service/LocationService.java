package com.task1.Employees.Service;

import com.task1.Employees.Model.DepartmentModel;
import com.task1.Employees.Model.LocationModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LocationService {
    private List<LocationModel> locationModels = new ArrayList<>();
    public LocationModel createLocation(LocationModel locationModel){
        locationModels.add(locationModel);
        return locationModel;
    }
}
