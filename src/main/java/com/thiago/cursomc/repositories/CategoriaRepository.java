package com.thiago.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.cursomc.entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Integer>  {

}
