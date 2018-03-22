package com.brunolima.desafiorest.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Medico implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String ultimNome;
	private String email;
	private String especialidade;
	private Boolean status;
	private Boolean situacao;
	private String estado;
	private String brasilia;
	
	public Medico() {
		
	}
	
	public Medico(Integer id, String nome, String ultimNome, String email, String especialidade, Boolean status,
			Boolean situacao, String estado, String brasilia) {
		super();
		this.id = id;
		this.nome = nome;
		this.ultimNome = ultimNome;
		this.email = email;
		this.especialidade = especialidade;
		this.status = status;
		this.situacao = situacao;
		this.estado = estado;
		this.brasilia = brasilia;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUltimNome() {
		return ultimNome;
	}

	public void setUltimNome(String ultimNome) {
		this.ultimNome = ultimNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Boolean getSituacao() {
		return situacao;
	}

	public void setSituacao(Boolean situacao) {
		this.situacao = situacao;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBrasilia() {
		return brasilia;
	}

	public void setBrasilia(String brasilia) {
		this.brasilia = brasilia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	
	
	
	
	
}
