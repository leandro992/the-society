package br.com.thesociety.controlles;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home() {
		System.out.println("Entrando na home no casa de código");
		return "home";
	}
}
