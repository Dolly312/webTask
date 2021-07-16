package com.fis.webapp;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyFirstController {

	public MyFirstController() {
	
		super();
		System.out.println("Inside Web Controller - default constructor called");
	}
	
	@RequestMapping("/")
	public String showHomePage()
	{
		return "homepage";
	}
	  ///  doProcessForm
	@RequestMapping(value = "/doEmailAction" ,method=RequestMethod.POST)
	public String doTask(HttpServletRequest req, Model model){
		String email =req.getParameter("email");
		String gender;
		System.out.println(req.getParameter("male"));
		if(req.getParameter("male").equals("Mr.")) {
			gender = "Mr.";
		}
		else {
			gender = "Ms.";
		}
		
		emailex.setName(email);
		
		
		String username = emailex.getUsername();
		String domainname = emailex.getDomain();
		
		System.out.println(username);
		System.out.println(domainname);
		
		model.addAttribute("gender" ,gender);
		model.addAttribute("username" ,username);
		model.addAttribute("domainname" ,domainname);
		
		return "clientData";
	}
}