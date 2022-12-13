package com.StyleSmartPro.StyleSmartPro.controllers;

import com.StyleSmartPro.StyleSmartPro.dao.FrizerskiSalonRepository;
import com.StyleSmartPro.StyleSmartPro.models.Frizer;
import com.StyleSmartPro.StyleSmartPro.models.FrizerskiSalon;
import com.StyleSmartPro.StyleSmartPro.models.Storitev;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class controllerFrizerskiSalon {

    @Autowired
    private FrizerskiSalonRepository frizerskiSalonDao;

    @GetMapping("/getAllFrizerskiSalon")
    public Iterable<FrizerskiSalon> vrniFrizerskiSalon() { return frizerskiSalonDao.findAll(); }

    @GetMapping("/getFrizerskiSalon/{id}")
    public Optional<FrizerskiSalon> getFSById(@PathVariable(value = "id") long id) {
        return frizerskiSalonDao.findById(id);
    }

    @PostMapping("/postFrizerskiSalon")
    public FrizerskiSalon dodajFrizerskiSalon(@RequestBody FrizerskiSalon fs) {return frizerskiSalonDao.save(fs);}
}