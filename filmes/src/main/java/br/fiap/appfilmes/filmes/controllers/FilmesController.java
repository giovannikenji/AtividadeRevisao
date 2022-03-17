package br.fiap.appfilmes.filmes.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.fiap.appfilmes.filmes.model.Filmes;

@Controller
public class FilmesController {

	@GetMapping("/filmes")
	public ModelAndView index() {
		
		ModelAndView model = new ModelAndView("filmes/index");
		
		Filmes f1 = new Filmes(1, "Corra!", "Terror", 2017, "Jordan Peele", "Amazon Prime Video", "+18");
		Filmes f2 = new Filmes(2, "Tenet", "Ação", 2020, "Christopher Nolan", "Amazon Prime Video", "+14");
		Filmes f3 = new Filmes(3, "Um Lugar Silencioso", "Terror", 2018, "John Krasinski", "Amazon Prime Video", "+13");
		Filmes f4 = new Filmes(4, "1917", "Drama", 2020, "Sam Mendes", "Amazon Prime Video", "+14");
		Filmes f5 = new Filmes(5, "Toy Story 2", "Família", 1999, "John Lasseter", "Disney +", "Free");
		Filmes f6 = new Filmes(6, "O Irlandês", "Drama Policial", 2019, "Martin Scorsese", "Netflix", "+16");
		
		List<Filmes> listaFilmes = Arrays.asList(f1, f2, f3, f4, f5 ,f6);
		
		model.addObject("listarFilmes", listaFilmes);
		
		return model;
	}
		
}
