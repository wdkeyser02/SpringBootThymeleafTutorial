package willydekeyser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ScriptCssController {

	
	@GetMapping("/css")
	public String home(Model model) {
		String color = "green";
		model.addAttribute("pageTitle", "Spring Boot Tutorial.");
		model.addAttribute("color", color);
		model.addAttribute("link", "/");
		model.addAttribute("linktext", "Home");
		return "css";
	}
	
	@GetMapping("/script")
	public String script(Model model) {
		model.addAttribute("pageTitle", "Spring Boot Tutorial.");
		model.addAttribute("text", "The button was clicked!............");
		model.addAttribute("link", "/");
		model.addAttribute("linktext", "Home");
		return "script";
	}
}
