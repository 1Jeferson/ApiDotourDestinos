package com.apidotour.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apidotour.model.Destino;
import com.apidotour.repository.DestinoRepository;
import com.apidotour.service.DestinoService;

@Service
public class DestinoServiceImpl implements DestinoService {

	
	@Autowired
	private DestinoRepository destinoRepository;
	
	
	@Override
	public List<Destino> getAllDestinos() {
		return destinoRepository.findAll();
	}
	
	
	@Override
	public Destino getDestinoById(Long id) {
		return destinoRepository.findById(id).orElse(null);
	}
	
	  @Override
	    public List<Destino> getDestinosByDestino(String destino) {
	        return destinoRepository.findByDestino(destino);
	    }
	
	
	@Override
	public Destino saveDestino(Destino destino) {
		return destinoRepository.save(destino);
	}
}
