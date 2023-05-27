package com.emprea.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.emprea.app.models.entity.Usuarios;  


public interface IUsuario extends CrudRepository<Usuarios,Integer>{
    
}
