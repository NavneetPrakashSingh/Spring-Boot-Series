package com.example.demo;

import java.util.Hashtable;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringcloudM5Dataservice1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudM5Dataservice1Application.class, args);
	}
	
	@RequestMapping(value="/customer/{cid}/contactdetails", method=RequestMethod.GET)
	public @ResponseBody String getCustomerContactDetails(@PathVariable Integer cid) throws InterruptedException{
		
		//add random latency
		Random r = new Random();
		int multiplier = r.nextInt(5)*1000;
		System.out.println(multiplier);
		Thread.sleep(multiplier);
		
		Hashtable<Integer, String> customer = new Hashtable<Integer,String>();
		customer.put(100, "Person1");
		customer.put(101, "Person2");
		customer.put(102,"Person3");
		
		String result = customer.get(cid);
		return result;
		
	}

}
