package com.sathish.devtools.controller;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sathish.devtools.service.MessageService;
/**
*
* @author Sathish Kariyanna
*/

@Controller
public class MessageController {

	@PostConstruct
	public void slowRestart() throws InterruptedException {
		Thread.sleep(5000);
	}

	@GetMapping("/")
	public ModelAndView get(HttpSession session) {
		Object sessionVar = session.getAttribute("messgaeVar");
		if (sessionVar == null) {
			sessionVar = "This is Devtools demo project";
			session.setAttribute("messgaeVar", sessionVar);
		}
		ModelMap model = new ModelMap("message", MessageService.getMessageService())
				.addAttribute("sessionVar", sessionVar);
		return new ModelAndView("helloMessage", model);
	}

}
