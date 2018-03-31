package com.brunolima.desafiorest.resources;

import java.net.URI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.brunolima.desafiorest.domain.Medico;
import com.brunolima.desafiorest.services.MedicoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin
@RequestMapping(value="/medicos")
@RestController
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class MedicoResource {
	
	@Autowired
	private MedicoService service;
	
	
	@ApiOperation(value="Busca um medico especifico")
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> buscar(@PathVariable Integer id) {
		
		Medico lista = service.find(id);
		return ResponseEntity.ok().body(lista);
	}
	
	@ApiOperation(value="Cadastra um novo registro")
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> inserir(@RequestBody Medico obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();	
	}
	
	@ApiOperation(value="Altera um registro desejado")
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@PathVariable Integer id, @RequestBody Medico obj){
		obj.setId(id);
		service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
	@ApiOperation(value="Exclui um registro desejado")
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@ApiOperation(value="Busca todas as listas")
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Medico>> findAll() {
		List<Medico> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}

}
