package com.amirsubhani;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

	@RequestMapping(value="/student", method=RequestMethod.GET)
	public @ResponseBody Student getStudent() {
		return new Student("Girish", 10);
	}
}
