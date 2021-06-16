package com.example.DisplayDate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {

		return "index.jsp";
	}

	@RequestMapping("/date")
	public String date(Model model) {
		
		String datePattern = "EEEEE, 'the' dd 'of' MMMMM, yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
		String x = dateFormat.format(new Date());	
		
        model.addAttribute("date",x);

		return "Date.jsp";
	}

	@RequestMapping("/time")
	public String time(Model model) {
		
		String timePattern = "hh:mm a";
		SimpleDateFormat timeFormat = new SimpleDateFormat(timePattern);
		String x = timeFormat.format(new Date());	
		
        model.addAttribute("time",x);

		return "Time.jsp";
	}

}
