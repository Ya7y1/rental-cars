package com.example.demo.Models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity


@AllArgsConstructor
@NoArgsConstructor
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    LocalDate  dateS;
    LocalDate dateE;
    Date  reservationDate;
    double price;

    // required
    @ManyToOne()
    Customer customer;
    @ManyToOne
    Vehicle vehicle;


}
