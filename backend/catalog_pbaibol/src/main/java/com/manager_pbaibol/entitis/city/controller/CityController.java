package com.manager_pbaibol.entitis.city.controller;

import com.manager_pbaibol.entitis.city.City;
import com.manager_pbaibol.entitis.city.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;
    @PostMapping
    protected City cityCreate (@RequestBody City city){
        cityService.createCity(city);
        return city;
    }

    @GetMapping("/list")
    protected List<City> cityList(){return cityService.cityList(); }

    @GetMapping("/{id}")
    protected City getSinglrCity(@PathVariable Long id){
        return cityService.getSingleCity(id);
    }

    @DeleteMapping("/{id}")
    protected void delateCity (@PathVariable Long id){
        cityService.delateCity(id);
    }

}
