package haagahelia.modelandview.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String greeting(@RequestParam(value="name", required=false, defaultValue="World")String name,@ RequestParam(value="age") int age, Model model) {
		model.addAttribute("Name", name);
		model.addAttribute("age", age);
		return "hello";
}
}
