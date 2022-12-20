package com.StyleSmartPro.StyleSmartPro.controllers;

import com.StyleSmartPro.StyleSmartPro.dao.DelovniCasRepository;
import com.StyleSmartPro.StyleSmartPro.models.DelovniCas;
import com.StyleSmartPro.StyleSmartPro.models.Frizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class controllerDelovniCas {

    @Autowired
    private DelovniCasRepository delovniCasDao;

    @GetMapping("/getAllDelovniCas")
    public Iterable<DelovniCas> vrniDelovniCas() { return delovniCasDao.findAll(); }

    @GetMapping("/getDelovniCas/{id}")
    public Optional<DelovniCas> getDelovniCasById(@PathVariable(value = "id") Long id) {
        return delovniCasDao.findById(id);
    }

    @PostMapping("/postDelovniCas")
    public DelovniCas dodajDelovniCas(@RequestBody DelovniCas dc) {
        return delovniCasDao.save(dc);
    }

    @DeleteMapping("/deleteDelovniCas/{id}")
    public void deleteDelovniCas(@PathVariable(value = "id") Long id) {
        ArrayList<DelovniCas> delovniCasi = (ArrayList<DelovniCas>) delovniCasDao.findAll();
        for (int i = 0; i < delovniCasi.size(); i++) {
            DelovniCas dc = delovniCasi.get(i);
            if (delovniCasi.get(i).getId().equals(id)) {
                delovniCasDao.delete(dc);
            }
        }
    }

    @PutMapping("/putDelovniCas/{id}")
    public DelovniCas updateDelovniCas(@PathVariable(value = "id") Long id, @RequestBody DelovniCas delovniCasPodatki){
        ArrayList<DelovniCas> delovniCasi = (ArrayList<DelovniCas>) delovniCasDao.findAll();
        for (int i = 0; i < delovniCasi.size(); i++){
            DelovniCas delovniCas = delovniCasi.get(i);
            if(delovniCas.getId().equals(id)){
                delovniCas.setDatum(delovniCasPodatki.getDatum());
                delovniCas.setDolzinaIzvajanja(delovniCasPodatki.getDolzinaIzvajanja());
                delovniCas.setDelovniCasFrizerja(delovniCasPodatki.getDelovniCasFrizerja());
                delovniCas.setDelovnikFS(delovniCasPodatki.getDelovnikFS());

                delovniCasDao.save(delovniCas);

                return delovniCas;
            }
        }
        return null;
    }
}
