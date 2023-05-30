package com.example.demo.Services;

import com.example.demo.Models.Agency;
import com.example.demo.Repositories.AgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

    @Service

    public class AgencyServiceimp implements AgencyService {
        @Autowired
        AgencyRepository agencyRepository;

        @Override
        public Agency Saveagency(Agency Agency) {
            return agencyRepository.save(Agency);
        }


        @Override
        public Agency Updateagency(Agency Agency) {
            return agencyRepository.save(Agency);
        }

        @Override
        public Agency getagency(Long id) {return agencyRepository.findById(id).get();
        }

        @Override
        public List<Agency> getAllagency() {
            return agencyRepository.findAll();
        }

        @Override
        public void Deleteagency(Long id) {

        }

        @Override
        public void DeleteAllagency() {

        }
    }
