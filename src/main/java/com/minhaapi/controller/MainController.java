package com.minhaapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.minhaapi.domain.User;
import com.minhaapi.repository.UserRepository;

@Controller    // Indica para o Springboot que esta classe é um Controller
@RequestMapping(path="/demo") //Indica em que rota pertence a este controle
public class MainController {
	@Autowired // Indica que o repositório abaixo usará o contexto do JPA
	private UserRepository userRepository;
	
	@GetMapping(path="/add") //Indica sub-rota do tipo GET
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam String email) {
		// @ResponseBody indica que a String retornada é uma response (ideal para JSON)
		// @RequestParam indica que é um parametro recebido do GET ou POST request
		
		//Cria um usuário com os parametros que foram passados no GET
		User n = new User();
		n.setName(name);
		n.setEmail(email);
		//salva o usuário no banco de dados
		userRepository.save(n);
		return "Saved";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// Retorna um JSON ou XML com vários usuários
		return userRepository.findAll();
	}
}
