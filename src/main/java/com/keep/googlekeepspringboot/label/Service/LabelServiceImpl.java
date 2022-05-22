package com.keep.googlekeepspringboot.label.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keep.googlekeepspringboot.label.Entity.Label;
import com.keep.googlekeepspringboot.label.Repository.LabelRepository;
import com.keep.googlekeepspringboot.label.Dto.CreateLabelRequest;

@Service
public class LabelServiceImpl implements ILabelService {
	@Autowired
    LabelRepository labelRepository;

	@Override
	public List<Label> getAllLabel() {
		return new ArrayList<>(labelRepository.findAllLabel());
	}
	@Override
	public String addLabel(Label label) {
		labelRepository.saveLabel(label);
	        return label.getLabelId();
	}
	
	public Label getLabel(CreateLabelRequest createLabelRequest){
		Label l1=new Label();
		return l1;
        
    }


}
