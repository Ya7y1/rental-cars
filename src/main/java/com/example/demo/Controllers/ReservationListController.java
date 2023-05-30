package com.example.demo.Controllers;

import com.example.demo.Models.Reservation;
import com.example.demo.Services.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class ReservationListController {
    ReservationService reservationService;


}
