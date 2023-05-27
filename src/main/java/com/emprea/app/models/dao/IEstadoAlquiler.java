package com.emprea.app.models.dao;


import org.springframework.data.repository.CrudRepository;

import com.emprea.app.models.entity.EstadoAlquiler; 



public interface IEstadoAlquiler  extends CrudRepository<EstadoAlquiler  ,Integer > {
   
    
}
