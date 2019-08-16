package com.Lab22.Lab22;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoffeeController {
	@Autowired // i need the autowire antonation  to inject the getters and setters or create the object for me 
	Profile pro; // this is a alternative to the method i did first everything is commented ou

	@RequestMapping("/")
	public ModelAndView coffeePage() {
		ModelAndView mv = new ModelAndView("index");
		return mv;
		
	}
	
	@RequestMapping("register")
	public ModelAndView register() {
		ModelAndView reg = new ModelAndView("registration");
		return reg;
		
	}
	//if its one thing then you can use the @RequestParam antonation inside of the string as showed in the commented out line in line 29
	// if its more than one then create a pojo and follow the autowire and component antonation to bring them together. 
	@RequestMapping("info")
	//public ModelAndView information(@RequestParam("firstname") String firstname, @RequestParam("lastname")String Lastname,@RequestParam("email") String email, @RequestParam("phonenumber")String phonenumber, @RequestParam("password")String password) {
		public ModelAndView information(Profile pro ) {// ths calls the getters and setters automatically
		//System.out.println(firstname + Lastname);
		//Profile pro = new Profile(firstname, Lastname, email, phonenumber, password);
		ModelAndView info = new ModelAndView("info", "data", pro); // this tells you what view and what data you see
		return info;
	}
}
