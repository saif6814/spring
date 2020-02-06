package bhavna;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/hello")
	 String hello() {
		 return "hello";
		 
	 }
	@RequestMapping("/abcd")
	 String abcde() {
		 return "Amir";
		 
	 }
	@RequestMapping("/add")
	 String abc() {
		 return "add";
	}
}

