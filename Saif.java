package com.amirsubhani;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Saif {

	

	@RequestMapping(value="/rqparam", method=RequestMethod.GET)
	public String rqParam1(Model model,
						   @RequestParam String username,
						   @RequestParam("password") String pw) {
		model.addAttribute("uname", username);
		model.addAttribute("pw", pw);
		return "rq_param";
	}

}
