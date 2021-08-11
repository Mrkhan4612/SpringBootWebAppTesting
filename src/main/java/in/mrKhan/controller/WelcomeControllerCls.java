package in.mrKhan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeControllerCls {
	
	@RequestMapping("/")
	public String welcomeMsg(Model model)
	{
		model.addAttribute("msg", "welcome to mr.khan !");
		return "success";
	}

}
