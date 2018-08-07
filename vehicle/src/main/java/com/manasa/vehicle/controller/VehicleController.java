package com.manasa.vehicle.controller;

import com.manasa.vehicle.dao.VehicleRepoImpl;
import com.manasa.vehicle.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    VehicleRepoImpl vehicleService;

    @RequestMapping(value = "/vehicle", method= RequestMethod.GET)
    public List<Vehicle> getVehicle(){
        return vehicleService.getAllVehicles();

    }
    @RequestMapping(value="/vehicle", method=RequestMethod.POST)
    public void addVehicle (@RequestBody Vehicle v){
        vehicleService.createVehicle(v);
    }

    @RequestMapping(value="/vehicle/{id}", method=RequestMethod.DELETE)
    public void deleteVehicle(@PathVariable int id) {
        vehicleService.deleteVehicle(id);
    }

    @RequestMapping(value="/vehicle", method=RequestMethod.PUT)
    public void updateVehicle (@RequestBody Vehicle v){
        vehicleService.createVehicle(v);
    }

    @RequestMapping(value = "/vehicle/{id}", method= RequestMethod.GET)
    public List<Vehicle> getVehicle(@PathVariable int id){
        return vehicleService.findByID(id);

    }

}
