package com.example.controlller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.service.Registrationservice;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class Registrationcontroller {
	   @Autowired
	   Registrationservice service;
	   @PostMapping("/register")
       public User registerUser(@RequestBody User user) throws Exception  {
    	   String tempemail=user.getEmail();
    	   if(tempemail!=null && !"".equals(tempemail)) {
    		   User userobj=service.fetchemail(tempemail);
    		   if(userobj!=null) {
    			   throw new Exception("user with "+tempemail+" already exits");
    		   }
    	   }
    	   User userobj=null;
    	   userobj=service.saveUser(user);
    	   return userobj;
       }
	   @PostMapping("/login")
	   public User login(@RequestBody User user) throws Exception {
		   String tempemail=user.getEmail();
		   String temppass=user.getPassword();
		   User userobj=null;
		   if(tempemail!=null &&temppass!=null) {
			   userobj=service.fetchuseremailandpassword(tempemail, temppass);
		   }
		   if(userobj==null) {
			   throw new Exception("Bad Credentials");
		   }
		   return userobj;
		   
	   }
}