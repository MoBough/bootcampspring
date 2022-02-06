package com.sip.ams.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/info") //ce que je tape dans l'url	
	public String info()
	{
		//System.out.println();
		return "home/info"; //le nom de la vue sous le dossier template
	}
	
	@RequestMapping("/affichage")	
	public String affichage()
	{
		return "home/affichage";
	}

}
