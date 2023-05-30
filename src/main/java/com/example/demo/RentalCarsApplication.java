package com.example.demo;

import com.example.demo.Models.Customer;
import com.example.demo.Models.Reservation;
import com.example.demo.Models.Vehicle;
import com.example.demo.Repositories.CustomerRepository;
import com.example.demo.Repositories.ReservationRepository;
import com.example.demo.Repositories.VehicleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;
import java.util.Optional;

@SpringBootApplication

public class RentalCarsApplication  {
    public static void main(String[] args) {

        SpringApplication.run(RentalCarsApplication.class);
    }
//    @Bean
//    PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }


    @Bean
    CommandLineRunner commandLineRunner(
            ReservationRepository rp, CustomerRepository cr, VehicleRepository vr){
        return args -> {
//            Customer c1 = new Customer();
//            Customer c2 = new Customer();
//            Customer c3 = new Customer();
//
//            c1.setName( "yahy1");
//            c1.setEmail("ya1@gmail.com");
//
//            c2.setEmail("y2@gmail.com");
//            c2.setName( "yahy2");
//
//            c3.setEmail("ya3@gmail.com");
//            c3.setName( "yahya3");
//
//            cr.saveAll(List.of(c1,c2,c3));

            List<Customer> customers=cr.findAll();
            for (Customer c: customers) {
                System.out.println(c.toString());
            }
            Optional<Vehicle> vehicle = vr.findById(1L);
            if (vehicle==null){
                throw new Exception("vehicle not found zith id:"+1);
            }


            Reservation r1 = new Reservation();
            Reservation r2 = new Reservation();
            Reservation r3 = new Reservation();

            Customer nwCustomer = new Customer();

            r1.setCustomer(customers.get(0));
            r1.setVehicle(vehicle.get());
            r2.setCustomer(customers.get(0));
            r2.setVehicle(vehicle.get());
            r3.setCustomer(customers.get(0));
            r3.setVehicle(vehicle.get());

          //  rp.saveAll(List.of(r1,r2,r3));
        };





    }

}
