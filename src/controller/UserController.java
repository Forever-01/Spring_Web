package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	@RequestMapping(value="/t1")
	public ModelAndView hello(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("welcome");
		mv.addObject("msg","success");
		return mv;
	}
}
