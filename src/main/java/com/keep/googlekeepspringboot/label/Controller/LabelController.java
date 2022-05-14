package com.keep.googlekeepspringboot.label.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.keep.googlekeepspringboot.label.Entity.Label;
import com.keep.googlekeepspringboot.label.Service.LabelServiceImpl;
import com.keep.googlekeepspringboot.label.Dto.CreateLabelRequest;
import com.keep.googlekeepspringboot.notes.Entity.Note;




@RestController
public class LabelController {
	
	LabelServiceImpl labelService=new LabelServiceImpl();

	@RequestMapping(value="/getAllLabels",method=RequestMethod.GET)
	public List<Label> getLabel(){
		return labelService.getAllLabel();
	 }
	
	 @RequestMapping(value="/addLabel",method=RequestMethod.POST)
		public String addLabel(@RequestBody Label label) {
		 System.out.println(label);
		 String labelId = labelService.addLabel(label);
		 System.out.println("labelId"+" "+labelId);
	        return labelId;
		}
	
//	 @PostMapping("/addLabel")
//	    public @ResponseBody String addLabel(@RequestBody CreateLabelRequest createLabelRequest){
//	        Label label = labelService.getLabel(createLabelRequest);
//	        String labelId = labelService.addLabel(label);
//	        return labelId;
//	    }

}
