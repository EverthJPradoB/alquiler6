package com.emprea.app.controllers;



import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emprea.app.models.entity.EstadoAuto;
import com.emprea.app.service.EstadoAuto.IEstadoAutoService;


@CrossOrigin
@RestController
@RequestMapping("/EstadoAuto")
public class EstadoAutoController {
    
    @Autowired
    private IEstadoAutoService autoService;

    @GetMapping("/listar")
    public List<EstadoAuto> getAlquiler() {

        return autoService.findAll();
    }
}
