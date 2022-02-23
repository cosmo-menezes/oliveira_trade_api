package com.oliveiratrade.mind.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oliveiratrade.mind.model.Cadastro;

@Repository
public interface CadastroRepository extends JpaRepository<Cadastro, Long>{
	
	
}
