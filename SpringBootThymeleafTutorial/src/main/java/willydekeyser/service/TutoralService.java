package willydekeyser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import willydekeyser.model.Tutorial;

@Service
public class TutoralService {
	
	public List<String> getAllBooks() {
		List<String> books = new ArrayList<>();
		books.add("Book 01");
		books.add("Book 02");
		books.add("Book 03");
		books.add("Book 04");
		return books;
	}
	
	public Tutorial getTutorial() {
		Tutorial tutorial = new Tutorial(1, "String Boot", "Willy De Keyser");
		return tutorial;
	}
	
	public List<Tutorial> getAllTutorials() {
		List<Tutorial> tutorials = new ArrayList<>();
		tutorials.add(new Tutorial(1, "String Boot", "Willy De Keyser"));
		tutorials.add(new Tutorial(2, "String Security", "Willy De Keyser"));
		tutorials.add(new Tutorial(3, "String OAuth2", "Willy De Keyser"));
		return tutorials;
	}

}
