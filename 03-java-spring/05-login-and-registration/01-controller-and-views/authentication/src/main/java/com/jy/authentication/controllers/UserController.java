package com.jy.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.jy.authentication.models.User;
import com.jy.authentication.services.UserService;

@Controller
public class UserController {
    
	@Autowired
	private UserService userService;
    
  
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registrationPage.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "loginPage.jsp";
    }
    
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        // if result has errors, return the registration page (don't worry about validations just now)
    	// else, save the user in the database, save the user id in session, and redirect them to the /home route
		if (result.hasErrors()) {
            return "registrationPage.jsp";
        } else {
        	User newUser = userService.registerUser(user);
        	session.setAttribute("loggedInUser", newUser.getId());
        	return "redirect:/home";
        }
        
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session, RedirectAttributes redirectAttributes) {
        // if the user is authenticated, save their user id in session
        // else, add error messages and return the login page
    	if (userService.authenticateUser(email, password)) {
    		User loggedUser = userService.findByEmail(email);
    		session.setAttribute("loggedInUser", loggedUser.getId());
    		return "redirect:/home";
    	}else {
    		redirectAttributes.addFlashAttribute("loginError", "Invalid E-mail or Password");
    		return "redirect:/login";
    	}
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        // get user from session, save them in the model and return the home page
    	if (session.getAttribute("loggedInUser") != null) {
    		Long userId = (Long) session.getAttribute("loggedInUser");
    		User loggedUser = userService.findUserById(userId);
    		model.addAttribute("user", loggedUser);
    		return "homePage.jsp";
    	} else {
    		
    		return "redirect:/login";
    	}
    	
    	
    }
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
        // invalidate session
    	session.invalidate();
        // redirect to login page
    	return "redirect:/login";
    }
}