package com.task1.Employees.Controller;

import com.task1.Employees.Model.DepartmentModel;
import com.task1.Employees.Model.LocationModel;
import com.task1.Employees.Service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/locations")
public class LocationController {
    @Autowired
    private LocationService locationService;
    @PostMapping("/createLoc")
    public LocationModel createLocation(@RequestBody final LocationModel locationModel){
        return locationService.createLocation(locationModel);
    }
}
