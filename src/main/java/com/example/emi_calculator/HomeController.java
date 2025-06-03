package com.example.emi_calculator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
//@Controller – marks the class as a web controller.
public class HomeController {
	//Get route to intial page
	@GetMapping("/")
	//@GetMapping – tells Spring to handle GET requests for a specific URL.
	public String showForm() {
	    return "index";
	}
	
	@PostMapping("/cal")
	//@PostMapping("/cal") annotation in a Spring Boot controller to receive data from your HTML form 
	public String Home(
			@RequestParam(name="loanAmt",defaultValue="0") String price,
			Model model) {
		double loanAmt=Double.parseDouble(price);
		//System.out.print("loanAmount:"+loanAmt);
		model.addAttribute("loanamt",loanAmt);// Pass to Html
		return "index";
	}
}
