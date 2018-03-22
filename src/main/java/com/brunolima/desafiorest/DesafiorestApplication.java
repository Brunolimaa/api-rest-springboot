package com.brunolima.desafiorest;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brunolima.desafiorest.domain.Medico;
import com.brunolima.desafiorest.repositories.MedicoRepository;

@SpringBootApplication
public class DesafiorestApplication implements CommandLineRunner {

	@Autowired
	private MedicoRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(DesafiorestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Medico m1 = new Medico();
		Medico m2 = new Medico();
		Medico m3 = new Medico();
		
		m1.setNome("Jesus");
		m2.setNome("Maria");
		m3.setNome("José");
		
		repo.saveAll(Arrays.asList(m1, m2, m3));
		
	}
}
