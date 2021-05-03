package com.log.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



import com.log.pojo.LoginPojo;
import com.log.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	LoginService ls;
	
	@GetMapping({"/","/register"})
	public String FirstPage() {
		return "register.jsp";
	}
	
	@PostMapping("/success")
	public String SaveNewDetails (@ModelAttribute("entry") LoginPojo data, Model m) {
		if(ls.Existence(data)) {
			m.addAttribute("message", "USER NAME ALREADY EXISTS");
			return "register.jsp";
		}
		else {
			ls.SaveDetails(data);
			return "login.jsp";
		}
	}
	
	@GetMapping("/login")
	public String Check() {
		return "login.jsp";
	}
	
	@PostMapping("/login")
	public String LoginData(@ModelAttribute("login") LoginPojo data, Model m, @RequestParam("name") String Name ) {
		if(ls.Login_check(data))
		{
			String name = ls.DisplayName(Name);
			System.out.println(name);
			m.addAttribute("greet", "WELCOME " + name.toUpperCase());
			return "page.jsp";	
		}
		else {
			m.addAttribute("error","INVALID USERNAME OR PASSWORD");
			return "login.jsp";
		}
	}
	
	@PostMapping("/endpage")
	public String LogOut(){
		return "endpage.jsp";
	}
	
}
