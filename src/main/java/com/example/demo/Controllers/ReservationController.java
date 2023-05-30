package com.example.demo.Controllers;

import com.example.demo.Models.Customer;
import com.example.demo.Models.Reservation;
import com.example.demo.Models.Vehicle;
import com.example.demo.Services.CustomerService;
import com.example.demo.Services.ReservationService;
import com.example.demo.Services.VehicleService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Controller
@AllArgsConstructor
public class ReservationController {
    ReservationService reservationService;
    CustomerService customerService;
    VehicleService vehicleService;
    @RequestMapping("/reservation")
    public String reservation(){
        return "Reservation";
    }



    @RequestMapping("/Savereservation")
    public String savereservation(@ModelAttribute("reservation") Reservation reservation,
                                  @RequestParam("idVehicle") long idVehicle,
                                  ModelMap modelMap)  {

        Vehicle vehicle = vehicleService.getVehicle(reservation.getVehicle().getIdVehicle());
        reservation.setVehicle(vehicle);
        Customer customer = customerService.SaveCustomer(reservation.getCustomer());
        reservation.setCustomer(customer);

        String messageController ="you'r informations is sent successfully";
        modelMap.addAttribute("messageJsp",messageController);

        System.out.println(reservation.toString());

        Reservation memo2 = reservationService.saveReservation(reservation) ;
        String messageController2="Reservation sent seccessfully";
        modelMap.addAttribute("messageJsp",messageController2);
        return "Reserve";
    }
    @RequestMapping("/deleteReservation")
    public String deleteEmployee(@RequestParam("id") Long id  , ModelMap modelMap) {
        reservationService.deleteReservation(id);
        List<Reservation> reservationController = reservationService.getAllReservations();
        modelMap.addAttribute("ReservationJsp", reservationController);
        return "ReservationList";
    }

        @RequestMapping("/reservationlist")
        public String reservationList (ModelMap modelMap){
            List<Reservation> reservations = reservationService.getAllReservations();
            reservations.stream().forEach(reservation -> System.out.println(reservation.toString()));
            modelMap.addAttribute("reservations", reservations);
            return "ReservationList";
        }
    }



