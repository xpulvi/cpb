package com.manager_pbaibol.entitis.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://127.0.0.1:5501")
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
    @PatchMapping("/update/{name}")
    protected City patchCity (@PathVariable String name, @RequestBody City city){
        return cityService.patchCity(name,city);
    }

    @PutMapping("/delite/{id}")
    protected City putCity (@PathVariable Long id, @RequestBody City city){
        return cityService.putCity(id,city);
    }

    @GetMapping("/list")
    protected List<City> cityList(){return cityService.cityList(); }

    @GetMapping("/view/{id}")
    protected City getSinglrCity(@PathVariable Long id){
        return cityService.getSingleCity(id);
    }

    @DeleteMapping("/{id}")
    protected void delateCity (@PathVariable Long id){
        cityService.delateCity(id);
    }

}
