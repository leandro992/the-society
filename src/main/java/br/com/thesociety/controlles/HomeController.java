package br.com.thesociety.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping
public class HomeController {

	@GetMapping("/")
	public String home() {
		System.out.println("Entrando na home no casa de código");
		return "home";
	}


	@GetMapping("/entrar")
	public String formulario() {
		System.out.println("Tela de login");
		return "entrar";
	}

}
