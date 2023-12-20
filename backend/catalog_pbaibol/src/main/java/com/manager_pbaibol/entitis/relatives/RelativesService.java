package com.manager_pbaibol.entitis.relatives;

import com.manager_pbaibol.entitis.person.Person;
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

    public Relatives patchRelatives(Long id, Relatives relatives){
        Relatives existingRelatives = iRelativesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Relatives not found with id: " + id));

        if (relatives.getIdRelative() != null){
            existingRelatives.setIdRelative(relatives.getIdRelative());
        }

        if (relatives.getRelativeName() != null){
            existingRelatives.setRelativeName(relatives.getRelativeName());
        }

        if (relatives.getRelationship() != null){
            existingRelatives.setRelationship(relatives.getRelationship());
        }

        if (relatives.getPersonId() != 0){
            existingRelatives.setPersonId(relatives.getPersonId());
        }

        if (relatives.getNamePerson() != null){
            existingRelatives.setNamePerson(relatives.getNamePerson());
        }

        return iRelativesRepository.save(existingRelatives);

    }

    public Relatives putRelatives(Long id, Relatives relatives){
        relatives.setIdRelative(id);
        Relatives newRelatives = iRelativesRepository.save(relatives);
        return  newRelatives;
    }

    public List<Relatives> relativesList(){
        List<Relatives> relativesList = iRelativesRepository.findAll();
        return relativesList;
    }

    //TODO agiungere piu modi di ricerca.
    public Relatives getSingleRelatives(Long id){
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
