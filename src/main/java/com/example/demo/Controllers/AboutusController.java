package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutusController {
    @RequestMapping("/aboutus")
    public String abtus(){
        return "Aboutus";
    }
}
