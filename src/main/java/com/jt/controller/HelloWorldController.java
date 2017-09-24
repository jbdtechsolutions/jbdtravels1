package com.jt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HelloWorldController {
 
   @RequestMapping("/hello2")
   public String hello(Model model) {
        
       model.addAttribute("greeting", "Hello Spring MVC, Hoe are you?");
        
       return "helloworld2";
        
   }
 
}