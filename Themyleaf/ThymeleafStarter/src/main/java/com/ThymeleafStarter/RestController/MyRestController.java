package com.ThymeleafStarter.RestController;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class MyRestController {
	
	
	@GetMapping({ "/home", "/" })
	public ModelAndView home() {
		return new ModelAndView("homepage.html");
	}
	
	@GetMapping("/auth")
	public ModelAndView viewPage() {
		return new ModelAndView("index.html");
	}

	@GetMapping("/mobile")
	public ModelAndView mobile() {
		return new ModelAndView("mobile.html");
	}

	@GetMapping("/ac")
	public ModelAndView ac() {
		return new ModelAndView("ac.html");
	}

	@GetMapping("/laptop")
	public ModelAndView laptop() {
		return new ModelAndView("laptop.html");
	}

	@GetMapping("/cart")
	public ModelAndView cart() {
		return new ModelAndView("cart.html");
	}

	@GetMapping("/checkout")
	public ModelAndView checkout() {
		return new ModelAndView("checkout.html");
	}

	@GetMapping("/success")
	public ModelAndView success() {
		return new ModelAndView("success.html");
	}

}
