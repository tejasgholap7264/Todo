package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		model.put("name", getLoggedinUsername());
		return "welcome";
	}
	
	private String getLoggedinUsername() {
		Authentication authentication = 
				SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
    /*   Before adding Spring Security
    
    private AuthenticationServive authenticationService;
	
	public LoginController(AuthenticationServive authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}
     
	@RequestMapping(value="login",method = RequestMethod.GET)
    public String gotoLoginPage() {
    	return "login";
    }
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	//login?name=Ranga    RequestParam
	//captured the name and password put them into the ModelMap and show them into JSP
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password,ModelMap model) {
		
		if(authenticationService.authenticate(name, password)) {
			model.put("name", name);

			
			//Authentication
			//valid name-in28minutes
			//password - dummy
			
			return "welcome";
		}
		
		model.put("errorMessage", "Invalid Credentials! Please try again");
		return "login";
		
		*/
}
