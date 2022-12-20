package com.StyleSmartPro.StyleSmartPro.controllers;

import com.StyleSmartPro.StyleSmartPro.dao.FrizerRepository;
import com.StyleSmartPro.StyleSmartPro.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class controllerFrizer {
    @Autowired
    private FrizerRepository frizerDao;

    @GetMapping("/getAllFrizer")
    public Iterable<Frizer> vrniFrizerje() { return frizerDao.findAll(); }

    @GetMapping("/getFrizer/{id}")
    public Optional<Frizer> getFrizerById(@PathVariable(value = "id") Long id) {
        return frizerDao.findById(id);
    }

    @PostMapping("/postFrizer")
    public Frizer dodajFrizerja(@RequestBody Frizer f) {
        return frizerDao.save(f);
    }

   @DeleteMapping("/deleteFrizer/{id}")
    public void deleteFrizer(@PathVariable(value = "id") Long id) {
        ArrayList<Frizer> frizerji = (ArrayList<Frizer>) frizerDao.findAll();
        for (int i = 0; i < frizerji.size(); i++) {
            Frizer f = frizerji.get(i);
            if (frizerji.get(i).getId().equals(id)) {
                frizerDao.delete(f);
            }
        }
    }

    @PutMapping("/putFrizer/{id}")
    public Frizer updateFrizer(@PathVariable(value = "id") Long id, @RequestBody Frizer frizerPodatki){
        ArrayList<Frizer> frizerji = (ArrayList<Frizer>) frizerDao.findAll();
        for (int i = 0; i < frizerji.size(); i++){
            Frizer frizer = frizerji.get(i);
            if(frizer.getId().equals(id)){
                frizer.setIme(frizerPodatki.getIme());
                frizer.setPriimek(frizerPodatki.getPriimek());
                frizer.setGeslo(frizerPodatki.getGeslo());
                frizer.setUserName(frizerPodatki.getUserName());
                frizer.setGmail(frizerPodatki.getGmail());
                frizer.setDelovnoMesto(frizerPodatki.getDelovnoMesto());
                frizer.setDelovniCas(frizerPodatki.getDelovniCas());

                frizerDao.save(frizer);

                return frizer;
            }
        }
        return null;
    }

    @GetMapping("/frizerjiVSalonu/{ime}/{id}")
    public List<Frizer> frizerjiVSalonu(@PathVariable(value =  "ime") String ime, @PathVariable(value = "id")  Long id){
        return frizerDao.frizerjiVSalonu(ime,id);
    }

    @GetMapping("/frizerjiVImenuSalona/{naziv}")
    public List<Frizer> frizerjiVImenuSalona(@PathVariable(value = "naziv") String naziv){
        return frizerDao.frizerjiVImenuSalona(naziv);

    }

    @GetMapping("/frizerKiImaNaZalogi/{id}")
    public List<Frizer> frizerKiImaNaZalogi(@PathVariable(value = "id") Long id){
        return frizerDao.frizerKiImaNaZalogi(id);
    }

    @GetMapping("/frizerKiImaNaZalogiIme/{ime}")
    public List<Frizer> frizerKiImaNaZalogiIme(@PathVariable(value = "ime") String ime){
        return frizerDao.frizerKiImaNaZalogiIme(ime);
    }

    @GetMapping("/frizerKiDelaVXSalonu8h/{ime}")
    public List<Frizer> frizerKiDelaVXSalonu8h(@PathVariable(value = "ime") String ime){
        return frizerDao.frizerKiDelaVXSalonu8h(ime);
    }
}
