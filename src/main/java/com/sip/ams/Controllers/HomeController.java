package com.sip.ams.Controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/info") //ce que je tape dans l'url	
	public String info(Model model)
	{
		String formation = "Fullstack";
		
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("OCP");
	    names.add("OCP");
	    names.add("Spring");
	    names.add("Angular");
	    model.addAttribute("names", names);
		
		System.out.println("Methode info");
		model.addAttribute("workshop", formation);
		
		return "home/info"; //le nom de la vue sous le dossier template
	}
	
	@RequestMapping("/affichage")	
	public String affichage()
	{
		return "home/affichage";
	}

}
