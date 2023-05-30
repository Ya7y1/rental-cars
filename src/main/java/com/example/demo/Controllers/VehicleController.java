package com.example.demo.Controllers;

import com.example.demo.Models.Vehicle;

import com.example.demo.Services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
public class VehicleController {
    @Autowired
  VehicleService vehicleService;
    @RequestMapping("/createVehicle")
    public String createVehicle(){
        System.out.println("-------------");
        return "CreateVehicle";
    }
    @RequestMapping("/Savevehicle")
    public String saveVehicle(
            @ModelAttribute("vehicle") Vehicle vehicle,
            ModelMap modelMap,
            @RequestParam("file")   MultipartFile file) throws IOException {


        Vehicle memo=vehicleService.saveVehicle(vehicle,file);
        String messageController ="the vehicle whose Id:"+
              memo.getIdVehicle()+ "is saved";
        modelMap.addAttribute("messageJsp",messageController);
        return"CreateVehicle";
    }
    @RequestMapping("/vehicleList")
    public String vehicleList(ModelMap modelMap){
   List<Vehicle> vehicleController=vehicleService.getAllVehicle();
        modelMap.addAttribute("vehicleJsp",vehicleController);
        return "VehicleList";
    }
    @RequestMapping("/deleteVehicle")
    public String deleteEmployee(@RequestParam("idVehicle") Long idVehicle , ModelMap modelMap){
   vehicleService.DeleteVehicle(idVehicle);
        List<Vehicle> vehicleController =vehicleService.getAllVehicle();
        modelMap.addAttribute("vehicleJsp",vehicleController);
        return "VehicleList";
    }
    @RequestMapping("/showVehicle")
    public String showemployee(@RequestParam("idVehicle") Long idVehicle , ModelMap modelMap){
        Vehicle vehiclecontroller = vehicleService.getVehicle(idVehicle);
        modelMap.addAttribute("vehicleJsp",vehiclecontroller);
        return "EditVehicle";
    }
    @RequestMapping("/updatevehicle")
    public String updatvehicle(@ModelAttribute("vehicle")Vehicle vehicle, ModelMap modelMap){

//       Vehicle memo = vehicleService.saveVehicle(vehicle);


        return"VehicleList";
    }
    @RequestMapping("/reserve")
    public String vehicleDetails(@RequestParam("idVehicle") long idVehicle, ModelMap model) {
        // Retrieve the vehicle details from the database based on the id
        Vehicle vehicle = vehicleService.getVehicle(idVehicle);

        // Add the retrieved vehicle details to the model to be displayed in the view
        model.addAttribute("vehicle", vehicle);

        // Return the vehicle details view
        return "Reserve";
    }
    @PostMapping("/upload/{vehicleId}") public String uploadImage(
            Model model,
            @PathVariable Long vehicleId,
            @RequestParam("file")   MultipartFile file) throws IOException {


      vehicleService.addImage(vehicleId,file);
        return "vehicleList";
    }
}










