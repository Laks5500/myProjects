package com.WalkingTree.Controller;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class WalkingTreeController {

	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
}
