package com.StyleSmartPro.StyleSmartPro.controllers;

import com.StyleSmartPro.StyleSmartPro.dao.FrizerRepository;
import com.StyleSmartPro.StyleSmartPro.models.Frizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class controllerFrizer {

    @Autowired
    private FrizerRepository frizerDao;

    @GetMapping("/getAllFrizer")
    public Iterable<Frizer> vrniFrizerje(){return frizerDao.findAll();}

    @GetMapping("/getFrizer/{GetId}")
    public Optional<Frizer> getFrizerById(@PathVariable(value = "GetId") Long id) {return frizerDao.findById(id);}


    @PostMapping("/postFrizer")
    public Frizer dodajFrizerja(@RequestBody Frizer frizer){return frizerDao.save(frizer);}







}
