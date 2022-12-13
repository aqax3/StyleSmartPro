package com.StyleSmartPro.StyleSmartPro.controllers;

import com.StyleSmartPro.StyleSmartPro.dao.StoritevRepository;
import com.StyleSmartPro.StyleSmartPro.models.Storitev;
import com.StyleSmartPro.StyleSmartPro.models.Zaloga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

@RestController
public class controllerStoritev {

    @Autowired
    private StoritevRepository storitveDao;

    @GetMapping("/getAllStoritve")
    public Iterable<Storitev> vrniStoritve() {
        return storitveDao.findAll();
    }

    @GetMapping("/getStoritev/{GetId}")
    public Optional<Storitev> getStoritevById(@PathVariable(value = "GetId") Long id) {
        return storitveDao.findById(id);
    }

    @PostMapping("/postStoritve")
    public Storitev dodajStoritev(@RequestBody Storitev s) {return storitveDao.save(s);}

    @PutMapping("/putStoritev/{id}")
    public Storitev updateStoritev(@PathVariable(value = "id") Long id, @RequestBody Storitev sPodatki) {
        ArrayList<Storitev> s = (ArrayList<Storitev>) storitveDao.findAll();
        for (int i = 0; i < s.size(); i++) {
            Storitev storitev = s.get(i);
            if (Objects.equals(storitev.getId(), id)) {
                storitev.setIme(sPodatki.getIme());
                storitev.setSpol(sPodatki.getSpol());
                storitev.setPriblizenCasTrajanja(sPodatki.getPriblizenCasTrajanja());
                storitev.setStoritevTermina(sPodatki.getStoritevTermina());
                storitveDao.save(storitev);
                return storitev;
            }
        }
        return null;
    }

    @DeleteMapping("/deleteStoritev/{id}")
    public Storitev deleteStoritev(@PathVariable(value="id") Long id) {
        ArrayList<Storitev> s = (ArrayList<Storitev>) storitveDao.findAll();
        if (s.size() != 0) {
            for (int i = 0; i < s.size(); i++) {
                Storitev storitev = s.get(i);
                if (Objects.equals(storitev.getId(), id)) {
                    storitveDao.delete(storitev);
                }
            }
        }
        return null;
    }

    @GetMapping("/vrniStoritvePoSpoluInCasu/{spol}/{cas}")
    public Iterable<Storitev> vrniStoritveZaZenske(@PathVariable(value="spol") String spol, @PathVariable(value="cas") int cas) {
        return storitveDao.vrniStoritveZaZenske(spol, cas);
    }
}
