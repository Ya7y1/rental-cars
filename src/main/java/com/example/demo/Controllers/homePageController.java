package com.example.demo.Controllers;

import com.example.demo.Models.Vehicle;
import com.example.demo.Services.VehicleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class homePageController {

    private final VehicleService vehicleService;

    @RequestMapping("/homePage")
    public String vehicleList(ModelMap modelMap){
        List<Vehicle> vehicleController=vehicleService.getAllVehicle();
        modelMap.addAttribute("vehicleJsp",vehicleController);
        return "HomePage";
    }
}