package com.StyleSmartPro.StyleSmartPro.controllers;

import com.StyleSmartPro.StyleSmartPro.dao.ZalogaRepository;
import com.StyleSmartPro.StyleSmartPro.models.Zaloga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class controllerZaloga {

    @Autowired
    private ZalogaRepository zalogaDao;


    @GetMapping("/getAllZaloga")
        public Iterable<Zaloga> vrniZalogo(){
            return zalogaDao.findAll();
    }

    @GetMapping("/getZaloga/{GetId}")
        public Optional<Zaloga> getZalogaById(@PathVariable(value = "GetId") Long id) {
            return zalogaDao.findById(id);
        }

    @PutMapping("/putZaloga/{id}")
        public Zaloga updateZaloga(@PathVariable(value = "id") Long id, @RequestBody Zaloga zalogaPodatki){
        ArrayList<Zaloga> zaloge = (ArrayList<Zaloga>) zalogaDao.findAll();
        for (int i = 0; i < zaloge.size(); i++) {
            Zaloga zaloga = zaloge.get(i);
            if (zaloga.getId() == id) {
                zaloga.setIme(zalogaPodatki.getIme());
                zaloga.setKolicina(zalogaPodatki.getKolicina());

               zalogaDao.save(zaloga);

                return zaloga;
            }
        }


        return null;

    }


    @PostMapping("/postZaloga")
    public Zaloga dodajZalogo(@RequestBody Zaloga zaloga){
        return zalogaDao.save(zaloga);
    }

    @DeleteMapping("/deleteZaloga/{id}")
    public Zaloga deleteZaloga(@PathVariable(value = "id") Long id){
        ArrayList<Zaloga> zaloge = (ArrayList<Zaloga>) zalogaDao.findAll();
        for (int i = 0; i < zaloge.size(); i++) {
            Zaloga zaloga = zaloge.get(i);
            if (zaloga.getId() == id) {
                zaloga.setIme("");
                zaloga.setKolicina(0);

                zalogaDao.save(zaloga);

                return zaloga;
            }
        }


        return null;
    }
}



