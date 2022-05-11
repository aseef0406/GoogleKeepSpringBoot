package com.keep.googlekeepspringboot.label.Controller;

import java.awt.Label;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.keep.googlekeepspringboot.label.Service.LableService;


@RestController
public class Controller {
	
	private LableService labelService;

	@RequestMapping(value="/getAllLabel",method=RequestMethod.GET)
	 List<Label> getLabel(){
		List<Label> labels = labelService.getAllLabel();
		
 		
		 return null;
	 }
	 
	 @RequestMapping(value="/saveLabel",method=RequestMethod.POST)
	    
		public Label addLabel(@RequestBody Label label) {
			return user;
			
		}

}
