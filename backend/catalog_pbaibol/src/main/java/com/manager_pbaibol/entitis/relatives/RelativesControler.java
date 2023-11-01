package com.manager_pbaibol.entitis.relatives;

import com.manager_pbaibol.entitis.relatives.Relatives;
import com.manager_pbaibol.entitis.relatives.RelativesService;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/relatives")
public class RelativesControler {

    @Autowired private RelativesService relativesService;

    @PostMapping("/create")
    protected Relatives creteRelatives  (@RequestBody Relatives relatives){
        HttpServletResponse response = null;
        relativesService.createRelatives(relatives);
        response.setStatus(HttpServletResponse.SC_OK);
        return relatives;
    }

    @GetMapping("/list")
    protected List<Relatives> relativesList(){return relativesService.relativesList(); }

    @GetMapping("/{id}")
    protected Relatives getSinglrCity(@PathVariable Long id){
        return relativesService.getSingleRelatives(id);
    }

    @DeleteMapping("/{id}")
    protected void delateRelatives (@PathVariable Long id){
        relativesService.delateRelatives(id);
    }

}
