package com.example.demo.Controllers;

import com.example.demo.Models.Agency;
import com.example.demo.Models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.Services.AgencyService;
import java.util.List;

@Controller
public class AgancyController {
    @Autowired
    AgencyService AgencyService;

    @RequestMapping("/AgencyCreation")
    public String Createagency() {
        return "CreateAgency";
    }

    @RequestMapping("/Saveagency")
    public String saveOffice(@ModelAttribute("agency") Agency Agency,
    ModelMap modelMap){

            Agency memo = AgencyService.Saveagency(Agency);
            String messageController = "The agency whose Id:" +
                    memo.getId() + "is saved";
            modelMap.addAttribute("messageJsp", messageController);
        return "CreateAgency";

        }
    @RequestMapping("/agencyList")
    public String agencyList(ModelMap modelMap){
        List<Agency> agencyController = AgencyService.getAllagency();
        modelMap.addAttribute("agencyJsp",agencyController);
        return "AgencyList";
    }
    @RequestMapping("/deleteAgency")
    public String deleteAgency(@RequestParam("id") Long id , ModelMap modelMap){
       AgencyService.Deleteagency(id);
        List<Agency> agencyController = AgencyService.getAllagency();
        modelMap.addAttribute("agencyJsp",agencyController);
        return "AgencyList";
    }
    @RequestMapping("/showAgency")
    public String showCategory(@RequestParam("id") Long id , ModelMap modelMap){
        Agency agencycontroller = AgencyService.getagency(id);
        modelMap.addAttribute("categoryJsp",agencycontroller);
        return "EditAgency";
    }
    @RequestMapping("/updateagency")
    public String updateAgency(@ModelAttribute("agency") Agency agency  , ModelMap modelMap){


        Agency memo =AgencyService.Saveagency(agency) ;


        return"CreateAgency";
    }

}






