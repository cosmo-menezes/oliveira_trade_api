package com.oliveiratrade.mind.cadastro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.oliveiratrade.mind.model.Cadastro;
import com.oliveiratrade.mind.repository.CadastroRepository;

@RestController
@RequestMapping("/cadastros")
public class CadastroUsuarios {
	
	@Autowired
	private CadastroRepository cadastroRepository;
	
	@GetMapping
	public List<Cadastro> listar(){
		return cadastroRepository.findAll();
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cadastro adicionar(@RequestBody Cadastro cadastro) {
		return cadastroRepository.save(cadastro);
	}

}
