package com.StyleSmartPro.StyleSmartPro.controllers;

import com.StyleSmartPro.StyleSmartPro.dao.FrizerRepository;
import com.StyleSmartPro.StyleSmartPro.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
        System.out.println(f.toString());
        return frizerDao.save(f);
    }

    @DeleteMapping("/deleteAllFrizer")
    public void deleteAllFrizer() {
        ArrayList<Frizer> f = (ArrayList<Frizer>) frizerDao.findAll();
        for (int i = 0; i < f.size(); i++) {
            Frizer fs = f.get(i);
            frizerDao.delete(fs);
        }
    }

   /* @DeleteMapping("/deleteFrizer/{id}")
    public void deleteFrizer(@PathVariable(value = "id") Long id) {
        ArrayList<Frizer> frizerji = (ArrayList<Frizer>) frizerDao.findAll();
        for (int i = 0; i < frizerji.size(); i++) {
            Frizer f = frizerji.get(i);
            if (frizerji.get(i).getId().equals(id)) {
                frizerDao.delete(f);
            }
        }
    }*/

}
