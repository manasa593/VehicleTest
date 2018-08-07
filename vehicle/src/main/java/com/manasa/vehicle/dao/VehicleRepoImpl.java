package com.manasa.vehicle.dao;

import com.manasa.vehicle.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class VehicleRepoImpl{

    @Autowired
    VehicleRepository vehicleRepository;

    public Vehicle createVehicle(Vehicle vehicle){
        return vehicleRepository.save(vehicle);
    }
    public void deleteVehicle(int id){
        vehicleRepository.deleteById(id);

    }

    public List<Vehicle> getAllVehicles(){
        List<Vehicle> list = new ArrayList<>();
        vehicleRepository.findAll().forEach(new Consumer<Vehicle>() {
            @Override
            public void accept(Vehicle vehicle) {
                list.add(vehicle);
            }
        });
        return list;
    }
    public List<Vehicle> findByID(Integer id){
        List<Vehicle> list=new ArrayList<>();
        vehicleRepository.findById(id).ifPresent(new Consumer<Vehicle>() {
            @Override
            public void accept(Vehicle vehicle) {
                list.add(vehicle);
            }
        });
        return list;
    }
}
