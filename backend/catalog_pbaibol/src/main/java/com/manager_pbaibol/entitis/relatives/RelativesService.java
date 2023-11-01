package com.manager_pbaibol.entitis.relatives;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelativesService {

    @Autowired private IRelativesRepository iRelativesRepository;

    public Relatives createRelatives(Relatives relatives){
       Relatives relativesSave = iRelativesRepository.save(relatives);
       return relativesSave;
    }

    public List<Relatives> relativesList(){
        List<Relatives> relativesList = iRelativesRepository.findAll();
        return relativesList;
    }

    public Relatives getSingleRelatives(Long id){
        //  Customer singleCustomer = iCustomerRepository.getReferenceById(id);
        if (iRelativesRepository.existsById(id)){
            Relatives singleRelatives = iRelativesRepository.getReferenceById(id);
            return singleRelatives;
        }else {
            System.out.println("non esiste");
        }
        return null;
    }

    public String delateRelatives(Long id){
        HttpServletResponse response = null;
        if (iRelativesRepository.existsById(id)) {
            iRelativesRepository.deleteById(id);
            response.setStatus(HttpServletResponse.SC_OK);
            return id + ": delate" ;
        }else {
            response.setStatus(HttpServletResponse.SC_CONFLICT);
            return ""; // Restituisci una stringa vuota in caso di conflitto
        }
    }



}
