package com.example.demo.Services;

import com.example.demo.Models.Reservation;

import java.util.List;

public interface ReservationService{

    Reservation saveReservation(Reservation reservation) ;
    Reservation updateReservation(Reservation reservation);
    Reservation getReservation(Long id);
    List<Reservation> getAllReservations();
    void deleteReservation (Long id);


}
