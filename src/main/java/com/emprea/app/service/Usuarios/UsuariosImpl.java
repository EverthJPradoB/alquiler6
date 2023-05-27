package com.emprea.app.service.Usuarios;



import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emprea.app.models.dao.IUsuario;
import com.emprea.app.models.entity.Usuarios;



@Service
public class UsuariosImpl implements IUsuariosService {

    @Autowired
    private IUsuario iUsuario;

    @Override
    public List<Usuarios> findAll() {
        return (List<Usuarios>) iUsuario.findAll();
    }
}
