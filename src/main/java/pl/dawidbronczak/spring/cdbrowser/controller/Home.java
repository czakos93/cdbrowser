package pl.dawidbronczak.spring.cdbrowser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
	@RequestMapping("/")
	public String start(){
		return "index";
	}
}
