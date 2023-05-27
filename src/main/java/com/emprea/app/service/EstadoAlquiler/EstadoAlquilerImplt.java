package com.emprea.app.service.EstadoAlquiler;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emprea.app.models.dao.IEstadoAlquiler;
import com.emprea.app.models.entity.EstadoAlquiler;



@Service
public class EstadoAlquilerImplt implements IEstadoAquilerService {

    @Autowired
    private IEstadoAlquiler alquiler;

    @Override
    public List<EstadoAlquiler> findAll() {
        return (List<EstadoAlquiler>) alquiler.findAll();
    }
}
