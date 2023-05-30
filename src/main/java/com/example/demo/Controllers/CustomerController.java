package com.example.demo.Controllers;

import com.example.demo.Models.Category;
import com.example.demo.Models.Customer;
import com.example.demo.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @RequestMapping("/create-customer")
    public String createcustomer() {
        System.out.println("-------------");
        return "CustomerInformation";

    }
    @RequestMapping("/Savecustomer")
    public String saveCustomer (@ModelAttribute("customer")Customer customer, ModelMap modelMap){


        Customer memo = customerService.SaveCustomer(customer);
        String messageController ="you'r informations is sent successfully";
        modelMap.addAttribute("messageJsp",messageController);


        return"CustomerInformation";
    }
}
