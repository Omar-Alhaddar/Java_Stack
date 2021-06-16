package com.example.TheCode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class TheCodeController {
	@RequestMapping("/")
	public String bushido1() {
		
		return "home.jsp";
		
	}
	
	@RequestMapping(value= "/mm", method=RequestMethod.POST)
	public String home(@RequestParam(value="code") String code) {
		
		if (code.equals("bushido")) {
			
			return "redirect:/code";
		}
		else {
			
			return "redirect:/createError";
		}
	}
	
	@RequestMapping("/code")
	public String bushido() {
		
		return "code.jsp";
		
	}
	
    @RequestMapping("/createError")
    public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "you must train harder");
        return "redirect:/";
    }

}
