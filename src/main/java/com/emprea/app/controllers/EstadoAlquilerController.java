package com.emprea.app.controllers;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emprea.app.models.entity.EstadoAlquiler;
import com.emprea.app.service.EstadoAlquiler.IEstadoAquilerService;


@CrossOrigin
@RestController
@RequestMapping("/EstadoAlquiler")
public class EstadoAlquilerController {
    
    
    @Autowired
    private IEstadoAquilerService aquilerService;

    @GetMapping("/listar")
    public List<EstadoAlquiler> getAlquiler() {

        return aquilerService.findAll();
    }

}
