package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entitites.tshirtBrand;
import com.service.TshirtService;

@Controller
public class OutPutController {

	@Autowired
	TshirtService ts;
	
	@RequestMapping(path = "/output",method = RequestMethod.POST)
	public String result(HttpServletRequest req,Model model) {
		String color = req.getParameter("COLOUR");
		String gender = req.getParameter("GENDER_RECOMMENDATION");
		String size = req.getParameter("SIZE");
		String output = req.getParameter("OUTPUT");
		
		
		System.out.println(color + gender + size + output);
		List<tshirtBrand> tshirt = ts.searchTshirt(color, gender, size, output);
		
		model.addAttribute("out", "Your Desired output is\n" + tshirt);
		
		return "result";
	}
	
}
