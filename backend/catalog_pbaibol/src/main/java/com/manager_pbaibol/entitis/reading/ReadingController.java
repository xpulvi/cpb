package com.manager_pbaibol.entitis.reading;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reading")
public class ReadingController {

    @Autowired private ReadingService readingService;
    @PostMapping("/insert")
    protected Reading createReading(@RequestBody Reading reading){
        readingService.creteReading(reading);
        return reading;
    }
    @PatchMapping("/update/{id}")
    protected Reading patchReading(@PathVariable Long id, @RequestBody Reading reading){
        return readingService.patchReading(id, reading);
    }

    @PutMapping("/put/{id}")
    protected Reading putPerson(@PathVariable Long id, @RequestBody Reading reading){
        readingService.putRelatives(id, reading);
        return reading;
    }

    @GetMapping("/list")
    protected List<Reading> readingList(){return readingService.readingList(); }

    @GetMapping("/view/{id}")
    protected Reading getSinglrReading(@PathVariable Long id){
        return readingService.getSingleReading(id);
    }



}
