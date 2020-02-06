package com.amirsubhani;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SaifControl {
	
	
	
	@RequestMapping(value="/path_variable/{empname}/{empage}")
	public String rqPathVariable(Model model, 
								 @PathVariable String empname, 
								 @PathVariable int empage) {
		model.addAttribute("empname", empname);
		model.addAttribute("empage", empage);
		return "variable_path";
	}

}
