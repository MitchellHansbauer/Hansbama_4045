package com.PlantPlaces.hansbama;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HansbamaController
{
		
	@GetMapping("/index")
	public String index() 
	{
		return "index";
	}

}
