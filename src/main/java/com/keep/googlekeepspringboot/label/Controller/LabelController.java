package com.keep.googlekeepspringboot.label.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.keep.googlekeepspringboot.label.Entity.Label;
import com.keep.googlekeepspringboot.label.Service.LabelServiceImpl;




@RestController
public class LabelController {
	
	LabelServiceImpl labelService=new LabelServiceImpl();

	@RequestMapping(value="/getAllLabels",method=RequestMethod.GET)
	public List<Label> getLabel(){
		return labelService.getAllLabel();
	 }
	
	 @RequestMapping(value="/addLabel",method=RequestMethod.POST)
		public String addLabel(@RequestBody Label label) {
		 String labelId = labelService.addLabel(label);
	        return labelId;
			
		}

}
