package com.StyleSmartPro.StyleSmartPro.controllers;

import com.StyleSmartPro.StyleSmartPro.dao.TerminRepository;
import com.StyleSmartPro.StyleSmartPro.models.Frizer;
import com.StyleSmartPro.StyleSmartPro.models.Storitev;
import com.StyleSmartPro.StyleSmartPro.models.Termin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;

@RestController
public class controllerTermin {
    @Autowired
    private TerminRepository terminDao;

    @GetMapping("/getAllTermin")
    public Iterable<Termin> vrniTermin() { return terminDao.findAll(); }

    @GetMapping("/getTermin/{id}")
    public Optional<Termin> getTerminById(@PathVariable(value = "id") Long id) {
        return terminDao.findById(id);
    }

    @PostMapping("/postTermin")
    public Termin dodajTermin(@RequestBody Termin t) {
        return terminDao.save(t);
    }

    @DeleteMapping("/deleteTermin/{id}")
    public void deleteTermin(@PathVariable(value = "id") Long id) {
        ArrayList<Termin> termini = (ArrayList<Termin>) terminDao.findAll();
        for (int i = 0; i < termini.size(); i++) {
            Termin f = termini.get(i);
            if (termini.get(i).getId().equals(id)) {
                terminDao.delete(f);
            }
        }
    }

    @PutMapping("/putTermin/{id}")
    public Termin updateTermin(@PathVariable(value = "id") Long id, @RequestBody Termin tp) {
        ArrayList<Termin> s = (ArrayList<Termin>) terminDao.findAll();
        for (int i = 0; i < s.size(); i++) {
            Termin t = s.get(i);
            System.out.println(t);
            if (Objects.equals(t.getId(), id)) {
                t.setDatum(tp.getDatum());
                t.setDolzinaIzvajanja(tp.getDolzinaIzvajanja());
                t.setStoritve(tp.getStoritve());
                t.setTerminFrizerja(tp.getTerminFrizerja());
                t.setTerminStranke(tp.getTerminStranke());
                terminDao.save(t);
                return t;
            }
        }
        return null;
    }
}
