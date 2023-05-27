package com.emprea.app.service.Alquiler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emprea.app.models.dao.IAlquiler;
import com.emprea.app.models.entity.Alquiler;

@Service
public class AlquilerImplt implements IAlquilerService {

	@Autowired
	private IAlquiler alquiler;

	@Override
	public List<Alquiler> findAll() {
		// TODO Auto-generated method stub
		return (List<Alquiler>) alquiler.findAll();
	}

}
