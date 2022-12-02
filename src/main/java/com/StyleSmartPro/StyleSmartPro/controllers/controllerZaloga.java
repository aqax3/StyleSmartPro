package com.StyleSmartPro.StyleSmartPro.controllers;

import com.StyleSmartPro.StyleSmartPro.dao.ZalogaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerZaloga {

    @Autowired
    private ZalogaRepository zalogaDao;

    @GetMapping("/getZaloga")
    public String getZaloga(){
        return "Hello world";
    }
}
