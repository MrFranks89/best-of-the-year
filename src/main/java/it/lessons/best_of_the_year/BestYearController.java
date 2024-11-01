package it.lessons.best_of_the_year;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import best_of_the_year.categories.Movie;
import best_of_the_year.categories.Song;
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
		
		model.addAttribute("movies", getBestMovies());
		model.addAttribute("songs", getBestSongs());
		
		return "bestoftheyear";
	}
	
	private List<Movie> getBestMovies(){
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie(1, "The Shawshank Redemption"));
		movies.add(new Movie(2, "Inception"));
	    movies.add(new Movie(3, "Interstellar"));
		return movies;
		
	}
	
	private List<Song> getBestSongs(){
		List<Song> songs = new ArrayList<>();
		songs.add(new Song(1, "Bohemian Rhapsody"));
        songs.add(new Song(2, "Imagine"));
        songs.add(new Song(3, "Hotel California"));
        return songs;
	}
	
}
