package br.fiap.appfilmes.filmes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CadastroController {

	
	@GetMapping("/cadastro")
	public ModelAndView cadastro() {
		
		ModelAndView model = new ModelAndView("cadastro/cadastro");
		
		return model;
		
	}
}
