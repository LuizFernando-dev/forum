package br.com.alura.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoTdo;
import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping("/topicos")
	public List<TopicoTdo> lista(){
		Topico topico = new Topico("duvida", "duvida com spring", new Curso("spring", "programção") );
		TopicoTdo topicoTdo = new TopicoTdo(topico);
		
		return Arrays.asList(topicoTdo, topicoTdo, topicoTdo);
	}

}
