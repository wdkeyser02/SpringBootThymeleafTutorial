package willydekeyser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import willydekeyser.service.TutoralService;

@Controller
@RequiredArgsConstructor
public class MainController {

	private final TutoralService tutoralService;
	
	@GetMapping("/")
	public String home(Model model) {
		
		model.addAttribute("pageTitle", "Spring Boot Tutorial.");
		model.addAttribute("text", "Standard Expression");
		model.addAttribute("books", tutoralService.getAllBooks());
		model.addAttribute("tutorial", tutoralService.getTutorial());
		model.addAttribute("tutorials", tutoralService.getAllTutorials());
		
		return "index";
	}
}
