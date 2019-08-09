package com.thiago.cursomc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.thiago.cursomc.entity.Categoria;
import com.thiago.cursomc.repositories.CategoriaRepository;

@SpringBootApplication
public class CursomctesteApplication implements CommandLineRunner {

	@Autowired
	CategoriaRepository catR;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomctesteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Escritorio");
		Categoria cat2 = new Categoria(null, "Informatica");
		
		catR.saveAll(Arrays.asList(cat1,cat2));
		
	}

}
