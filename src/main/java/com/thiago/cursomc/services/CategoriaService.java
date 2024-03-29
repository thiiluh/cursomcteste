package com.thiago.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thiago.cursomc.entity.Categoria;
import com.thiago.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> cat = repo.findById(id);
		
		return cat.orElse(null);
	}
	
	public List<Categoria> buscasTodos(){
		
		List<Categoria> cat = repo.findAll();
		
		return cat;
	}
}
