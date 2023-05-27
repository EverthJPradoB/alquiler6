package com.emprea.app.controllers;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emprea.app.models.entity.Alquiler;
import com.emprea.app.service.Alquiler.IAlquilerService;

@CrossOrigin
@RestController
@RequestMapping("/Alquiler")
public class AlquilerController {
    @Autowired
    private IAlquilerService alquilerService;

    @GetMapping("/listar")
    public List<Alquiler> getAutos() {

        return alquilerService.findAll();
    }
}
