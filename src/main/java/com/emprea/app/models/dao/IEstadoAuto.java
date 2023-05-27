package com.emprea.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.emprea.app.models.entity.EstadoAuto; 


public interface IEstadoAuto extends CrudRepository<EstadoAuto,Integer> {
    
    
}
