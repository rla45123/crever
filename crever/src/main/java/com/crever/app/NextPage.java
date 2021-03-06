package com.crever.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NextPage {
	@RequestMapping(value = "/nextUrl", method = RequestMethod.GET)
	public String nextUrl(Model model, @ModelAttribute("url") String url, @ModelAttribute("message") String message,
			@ModelAttribute(value = "obj") HashMap<String, Object> obj) {
		List keys = new ArrayList(obj.keySet());
		for (int i = 0; i < keys.size(); i++) {
			model.addAttribute((String) keys.get(i), obj.get(keys.get(i)));
		}
		
		System.out.println("device check");
		
		model.addAttribute("message", message);
		return   "result/success";
	}
}
