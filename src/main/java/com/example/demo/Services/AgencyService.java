package com.example.demo.Services;
import com.example.demo.Models.Agency;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface AgencyService {
    Agency Saveagency(Agency Agency);
    Agency Updateagency(Agency Agency);
    Agency getagency(Long id);
   List<Agency> getAllagency();
    void Deleteagency(Long id);
    void DeleteAllagency();
}
