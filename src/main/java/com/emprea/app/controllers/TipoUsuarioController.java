package com.emprea.app.controllers;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emprea.app.models.entity.TipoUsuario;
import com.emprea.app.service.TIpoUsuario.ITipoUsuarioService;


@CrossOrigin
@RestController
@RequestMapping("/TipoUsuario")

public class TipoUsuarioController {
    
    @Autowired
    private ITipoUsuarioService iTipoUsuarioService;

    @GetMapping("/listar")
    public List<TipoUsuario> getAlquiler() {

        return iTipoUsuarioService.findAll();
    }

}
