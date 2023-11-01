package com.manager_pbaibol.entitis.city.service;

import com.manager_pbaibol.entitis.city.City;
import com.manager_pbaibol.entitis.city.repository.ICityRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityService {

    @Autowired
    private ICityRepository iCityRepository;

    public City createCity(City city){
        City citySave = iCityRepository.save(city);
        return citySave;
    }

    public List<City> cityList(){
        List<City> nameCityList = iCityRepository.findAll();
        return nameCityList;
    }

    public City getSingleCity(Long id){
        //  Customer singleCustomer = iCustomerRepository.getReferenceById(id);
        if (iCityRepository.existsById(id)){
            City singleCity = iCityRepository.getReferenceById(id);
            return singleCity;
        }else {
            System.out.println("non esiste");
        }
        return null;
    }

    public String delateCity(Long id){
        HttpServletResponse response = null;
        if (iCityRepository.existsById(id)) {
            iCityRepository.deleteById(id);
            response.setStatus(HttpServletResponse.SC_OK);
            return id + ": delate" ;
        }else {
            response.setStatus(HttpServletResponse.SC_CONFLICT);
            return ""; // Restituisci una stringa vuota in caso di conflitto
        }
    }

}
