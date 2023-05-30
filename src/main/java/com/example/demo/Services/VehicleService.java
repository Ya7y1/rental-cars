package com.example.demo.Services;

import com.example.demo.Models.Vehicle;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface VehicleService {
    Vehicle saveVehicle(Vehicle vehicle, MultipartFile file) throws IOException;

    Vehicle UpdateVehicle(Vehicle vehicle);

    Vehicle getVehicle(Long id);

    List<Vehicle> getAllVehicle();

    void DeleteVehicle(Long id);

    void DeleteAllVehicle();

    Vehicle addImage(Long vehicleId, MultipartFile file) throws IOException;


}
