package com.brunolima.desafiorest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brunolima.desafiorest.domain.Medico;
import com.brunolima.desafiorest.repositories.MedicoRepository;

@Service
public class MedicoService {

	@Autowired
	private MedicoRepository repo;
	
	public Medico find(Integer id) {
		Optional<Medico> obj = repo.findById(id);
		return obj.orElse(null);
	}

	public Medico insert(Medico obj) {
		obj.setId(null);
		return repo.save(obj);
	}

	public Medico update(Medico obj) {
		return repo.save(obj);		
	}

	public void delete(Integer id) {
		repo.deleteById(id);
	}

	public List<Medico> findAll() {
		return repo.findAll();
	}
}
