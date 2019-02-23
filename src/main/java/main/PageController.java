package main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class PageController {
	
	
	@RequestMapping(value= {"/home","/"}, method = RequestMethod.GET)
	public ModelAndView Category(){
		ModelAndView modelAndView = new ModelAndView();
	//	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	//	User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("userName ", "Hello!");
		modelAndView.setViewName("home");
		return modelAndView;
	}

	@RequestMapping(value="/contact", method = RequestMethod.GET)
	public ModelAndView contact(){
		ModelAndView modelAndView = new ModelAndView();
	//	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	//	User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("userName ", "Hello!");
		modelAndView.setViewName("Contact");
		return modelAndView;
	}
	@RequestMapping(value="/about", method = RequestMethod.GET)
	public ModelAndView about(){
		ModelAndView modelAndView = new ModelAndView();
	//	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	//	User user = userService.findUserByEmail(auth.getName());
		modelAndView.addObject("userName ", "Hello!");
		modelAndView.setViewName("About");
		return modelAndView;
	}

}
