package com.manager_pbaibol.entitis.city;

import com.manager_pbaibol.entitis.city.City;
import com.manager_pbaibol.entitis.city.ICityRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {

    @Autowired
    private ICityRepository iCityRepository;
    private City city;
    public City createCity(City city){
        City citySave = iCityRepository.save(city);
        return citySave;
    }

    public City patchCity(String name, City city){

        City existingCity = iCityRepository.findByName(name);
        if (city.getName() != null){
            existingCity.setName(city.getName());
        }

        if (city.getCreate_date() != 0){
            existingCity.setCreate_date(city.getCreate_date());
        }

        if (city.getDestroi_date() != 0){
            existingCity.setDestroi_date(city.getDestroi_date());
        }

        if (city.getFondatore_city() != null){
            existingCity.setFondatore_city(city.getFondatore_city());
        }

        if (city.getNait() != null){
            existingCity.setNait(city.getNait());
        }

        if (city.getPawns_of_nait() != null){
            existingCity.setPawns_of_nait(city.getPawns_of_nait());
        }

        if (city.getName_now() != null){
            existingCity.setName_now(city.getName_now());
        }

        if (city.getImg() != null){
            existingCity.setImg(city.getImg());
        }

        return iCityRepository.save(existingCity);

    }

    public City putCity(Long id, City city){
        city.setId(id);
        City newCity = iCityRepository.save(city);
        return newCity;

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
