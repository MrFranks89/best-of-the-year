package it.lessons.best_of_the_year;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import it.lessons.best_of_the_year.users.Utenti;


@Controller
@RequestMapping("/awards")

public class BestYearController {

	@GetMapping("/bestoftheyear")
	public String bestoftheyear(@RequestParam(name = "nome", required = false) String nome, 
			Model model) {
		
		model.addAttribute("name", nome);
		
		Utenti u1 = new Utenti();
		u1.setNome("Federico");
		model.addAttribute("utente", u1);
		
		
		return "bestoftheyear";
	}
}
