package com.example.demo.Services;

import com.example.demo.Models.Reservation;
import com.example.demo.Repositories.CustomerRepository;
import com.example.demo.Repositories.ReservationRepository;
import com.example.demo.Repositories.VehicleRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;


import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.List;
@Service
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {
    private ReservationRepository reservationRepository;
    private VehicleRepository vehicleRepository;
    private CustomerRepository customerRepository;

    @Override
    public Reservation saveReservation(Reservation reservation) {


        long daysBetween = ChronoUnit.DAYS.between(
                reservation.getDateE(),
                reservation.getDateS()
                );
        reservation.setPrice(reservation.getVehicle().getPrice()*Math.abs(daysBetween));
        reservation.setReservationDate(new Date());

        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {

        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservation(Long id) {

        Reservation r=reservationRepository.findById(id).get();
        return r;
    }

    @Override
    public List<Reservation> getAllReservations() {

        return reservationRepository.findAll();
    }

    @Override
    public void deleteReservation(Long id) {
    Reservation r = reservationRepository.findById(id).get();
    reservationRepository.delete(r);
    }


}
