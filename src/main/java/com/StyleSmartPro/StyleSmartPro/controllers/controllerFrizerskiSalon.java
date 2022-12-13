package com.StyleSmartPro.StyleSmartPro.controllers;

import com.StyleSmartPro.StyleSmartPro.dao.FrizerskiSalonRepository;
import com.StyleSmartPro.StyleSmartPro.models.Frizer;
import com.StyleSmartPro.StyleSmartPro.models.FrizerskiSalon;
import com.StyleSmartPro.StyleSmartPro.models.Storitev;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
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

    @PutMapping("/putFrizerskiSalon/{id}")
    public FrizerskiSalon updateFrizerskiSalon(@PathVariable(value = "id") Long id, @RequestBody FrizerskiSalon fsPodatki) {
        ArrayList<FrizerskiSalon> fs = (ArrayList<FrizerskiSalon>) frizerskiSalonDao.findAll();
        for (int i = 0; i < fs.size(); i++) {
            FrizerskiSalon poskus = fs.get(i);
            if (poskus.getId().equals(id)) {
                poskus.setDelovnik(fsPodatki.getDelovnik());
                poskus.setNaziv(fsPodatki.getNaziv());
                poskus.setZaloge(fsPodatki.getZaloge());
                poskus.setTelefon(fsPodatki.getTelefon());
                poskus.setLokacija(fsPodatki.getLokacija());
                frizerskiSalonDao.save(poskus);
                return poskus;
            }
        }
        return null;
    }

    @DeleteMapping("/deleteFrizerskiSalon/{id}")
    public void deleteFrizerskiSalon(@PathVariable(value="id") Long id) {
        ArrayList<FrizerskiSalon> fs = (ArrayList<FrizerskiSalon>) frizerskiSalonDao.findAll();
        if (fs.size() != 0) {
            for (int i = 0; i < fs.size(); i++) {
                FrizerskiSalon poskus = fs.get(i);
                if (poskus.getId().equals(id)) {
                    frizerskiSalonDao.delete(poskus);
                }
            }
        }
    }

    @GetMapping("/steviloZaposlenih/{id}")
    public Integer steviloZaposlenih(@PathVariable(value="id") Long id) {
        ArrayList<FrizerskiSalon> frizerskiSaloni = (ArrayList<FrizerskiSalon>) frizerskiSalonDao.findAll();
        FrizerskiSalon isci = new FrizerskiSalon();
        for (int i = 0; i < frizerskiSaloni.size(); i++) {
            FrizerskiSalon fs = frizerskiSaloni.get(i);
            if (fs.getId().equals(id)) {
                isci = fs;
            }
        }
        return frizerskiSalonDao.steviloZaposlenih(isci);
    }

    /*@GetMapping("/vrniZaposlene/{id}")
    public Iterable<Frizer> vrniZaposlene(@PathVariable(value="id") Long id) {
        ArrayList<FrizerskiSalon> frizerskiSaloni = (ArrayList<FrizerskiSalon>) frizerskiSalonDao.findAll();
        FrizerskiSalon isci = new FrizerskiSalon();
        for (int i = 0; i < frizerskiSaloni.size(); i++) {
            FrizerskiSalon fs = frizerskiSaloni.get(i);
            if (fs.getId().equals(id)) {
                isci = fs;
            }
        }
        return frizerskiSalonDao.vrniZaposlene(isci);
    }*/
}