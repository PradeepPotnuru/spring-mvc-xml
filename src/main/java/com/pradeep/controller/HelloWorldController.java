package com.pradeep.controller;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class HelloWorldController extends AbstractController{

	@Override
	 protected ModelAndView handleRequestInternal(HttpServletRequest
	  request, HttpServletResponse response) throws Exception {
	  
	  ModelAndView model = new ModelAndView("HelloWorldPage");
	  String quotes[] = { "Hello World", "Hello MVC", "Hello Pradeep", "Hello Sandeep" };
	  
	  int random = new Random().nextInt(quotes.length);
 
	  model.addObject("msg", quotes[random]);
	  
	  return model;
	  }
	 

}
