package com.emprea.app.service.Autos;


import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emprea.app.models.dao.IAuto;
import com.emprea.app.models.entity.Autos;



@Service
public class AutoImplt implements IAutosService {

    @Autowired
    private IAuto autosService ;

    @Override
    public List<Autos> findAll() {
 
        return (List<Autos>) autosService.findAll();

    }
    
}
