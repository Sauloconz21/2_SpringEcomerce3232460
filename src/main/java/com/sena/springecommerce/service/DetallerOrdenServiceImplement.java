package com.sena.springecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.springecommerce.model.DetalleOrden;
import com.sena.springecommerce.repositorio.IDetalleOrdenRepository;

@Service
public class DetallerOrdenServiceImplement implements IDetalleOrdenService {

	@Autowired
	private IDetalleOrdenRepository detalleOrdenRepository;

	@Override
	public DetalleOrden save(DetalleOrden detalleorden) {
		// TODO Auto-generated method stub
		return detalleOrdenRepository.saveAndFlush(detalleorden);
	}

}
