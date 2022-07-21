package com.web.aulaweb.domain.resource;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.aulaweb.domain.model.Aluno;
import com.web.aulaweb.domain.repository.AlunoRepository;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping(value = "aluno")


public class AlunoResource{
	
	@Autowired
	private AlunoRepository repository;

@PutMapping(path = "{id}")
public String atualizarDados(@PathVariable Long id, @RequestBody AlunoRequest aluno) {
	return aluno.toString();
	
}


	
}