package com.emprea.app.service.TIpoUsuario;


import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emprea.app.models.dao.ITipoUsuario;
import com.emprea.app.models.entity.TipoUsuario;

@Service
public class TipoUsuarioImpl implements ITipoUsuarioService {

    @Autowired
    private ITipoUsuario iTipoUsuario;

    @Override
    public List<TipoUsuario> findAll() {
        
        return (List<TipoUsuario>) iTipoUsuario.findAll();
    
    }
       
}
