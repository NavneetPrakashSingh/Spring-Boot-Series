package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RefreshScope
@Controller
public class RateController {
	
	@Value("${rate}")
	String rate;
	
	@Value("${quantity}")
	String quantity;
	
	@Value("${connstring}")
	String connstring;
	
	@RequestMapping("/rate")
	public String getRate(Model m) {
		
		System.out.println(this.connstring);
		m.addAttribute("rateamount",this.rate);
		m.addAttribute("quantity",this.quantity);
		m.addAttribute("connstring",this.connstring);
		return "rateview";
	}
	
}
