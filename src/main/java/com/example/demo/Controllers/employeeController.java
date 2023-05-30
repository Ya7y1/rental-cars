package com.example.demo.Controllers;

import com.example.demo.Models.Category;
import com.example.demo.Models.employee;
import com.example.demo.Services.employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public  class employeeController {
    @Autowired
employeeservice employeeservice;


    @RequestMapping("/createEmployee")
    public String createemployee() {
//        System.out.println("-------------");
        return "CreateEmployee";

    }  @RequestMapping("/Saveemployee")
    public String saveProduct(@ModelAttribute("employee") employee employee , ModelMap modelMap){


      employee memo=  employeeservice.Saveemployee(employee);
        String messageController ="the employee whose Id:"+
                memo.getId()+ "is saved";
        modelMap.addAttribute("messageJsp",messageController);
        return"CreateEmployee";
    }
    @RequestMapping("/employeeList")
    public String employeeList(ModelMap modelMap){
        List<employee> employeeController = employeeservice.getAllemployee();
        modelMap.addAttribute("employeeJsp",employeeController);
        return "EmployeeList";
    }
    @RequestMapping("/deleteemployee")
    public String deleteEmployee(@RequestParam("id") Long id , ModelMap modelMap){
       employeeservice.Deleteemployee(id);
        List<employee> employeeController = employeeservice.getAllemployee();
        modelMap.addAttribute("employeeJsp",employeeController);
        return "EmployeeList";
    }
    @RequestMapping("/showemployee")
    public String showemployee(@RequestParam("id") Long id , ModelMap modelMap){
      employee employeeController= employeeservice.getemployee(id);
        modelMap.addAttribute("employeeJsp",employeeController);
        return "EditEmployee";
    }
    @RequestMapping("/updateemployee")
    public String updateemployee(@ModelAttribute("employee")employee employee, ModelMap modelMap){

     employee memo=employeeservice.Saveemployee(employee);


        return"EmployeeList";
    }
    }
