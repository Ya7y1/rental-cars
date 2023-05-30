package com.example.demo.Services;

import com.example.demo.Models.Vehicle;
import com.example.demo.Repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
@Service

public class VehicleServiceImp implements VehicleService {
    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public Vehicle saveVehicle(Vehicle vehicle, MultipartFile file
                               ) throws IOException {
        System.out.println(vehicle);
        Vehicle savedVehicle =  vehicleRepository.save(vehicle);
        return  this.addImage(savedVehicle.getIdVehicle(),file);
    }

    @Override
    public Vehicle UpdateVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle getVehicle(Long id) {
        return vehicleRepository.findById(id).get();
    }

    @Override
    public List<Vehicle> getAllVehicle() {
        return vehicleRepository.findAll();
    }

    @Override
    public void  DeleteVehicle(Long id) {
        vehicleRepository.deleteById(id);
    }

    @Override
    public void  DeleteAllVehicle() {
        vehicleRepository.deleteAll();


    }

    @Override
    public Vehicle addImage(Long vehicleId, MultipartFile file) throws IOException {

        Vehicle vehicle = vehicleRepository.findById(vehicleId).get();

        String imagesLocation = "src/main/resources/static/images/";
        String imageName = vehicleId + ".jpg";// while users mail is unique so we will stored their images by their mails
        String imageSrc =  imagesLocation + imageName;

        vehicle.setUrl(imageSrc);// add src
        Files.write(Paths.get(imageSrc), file.getBytes());// add image in server


        return  vehicleRepository.save(vehicle);
    }
}