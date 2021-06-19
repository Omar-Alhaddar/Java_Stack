package com.example.NinjaGold;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NinjaController {
	
	@RequestMapping("/")
	public String home(HttpSession session) {
		
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 0);
			session.setAttribute("activities", new ArrayList<String>());
			
		}
		
		return "home.jsp";
	}
	@SuppressWarnings("unchecked")
	@RequestMapping("/process_money")
	public String process_money(@RequestParam(value="which_form") String which_form , HttpSession session) {
		String timeStamp = new SimpleDateFormat("MMMMM dd yyyy HH:mm a").format(new Date());

	
		
		if (which_form.equals("farm")) {
			Integer gold =getRandomGold(20,10);
			
			
			Integer myGold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", myGold+gold);
			((ArrayList<String>) session.getAttribute("activities")).add("You entered a farm and earned "+gold+" gold. ("+timeStamp+")");
		}
		
		if (which_form.equals("cave")) {
			Integer gold =getRandomGold(10,5);
			
			Integer myGold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", myGold+gold);
			((ArrayList<String>) session.getAttribute("activities")).add("You entered a cave and earned "+gold+" gold. ("+timeStamp+")");
		}
		
		if (which_form.equals("house")) {
			Integer gold =getRandomGold(5,2);
			
			Integer myGold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", myGold+gold);
			((ArrayList<String>) session.getAttribute("activities")).add("You entered a house and earned "+gold+" gold. ("+timeStamp+")");
		}
		
		if (which_form.equals("casino")) {
			Integer gold1 =getRandomGold(50,-50);
		
			
			Integer myGold = (Integer) session.getAttribute("gold");
			session.setAttribute("gold", myGold+gold1);
			
			if (gold1<0) {
				((ArrayList<String>) session.getAttribute("activities")).add("Ouch ..You entered a Casino and lost "+gold1+" gold.  ("+timeStamp+")");

			}
			else {
				((ArrayList<String>) session.getAttribute("activities")).add("You entered a casino and earned "+gold1+" gold. ("+timeStamp+")");

			}
		}
		
		
		return "redirect:/";
	}
	
	public int getRandomGold(int max, int min) {
        Random rand = new Random();
        int value = rand.nextInt((max-min)+1)+min;
        return value;
    }
	

}
