package com.emprea.app.controllers;



import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emprea.app.models.entity.Usuarios;
import com.emprea.app.service.Usuarios.IUsuariosService;

@CrossOrigin
@RestController
@RequestMapping("/Usuarios")

public class UsuarioController {
    
    @Autowired
    private IUsuariosService iUsuariosService;

    @GetMapping("/listar")
    public List<Usuarios> getAlquiler() {

        return iUsuariosService.findAll();
    }

}
