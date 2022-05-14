package com.keep.googlekeepspringboot.label.Service;

import java.util.*;

import com.keep.googlekeepspringboot.label.Entity.Label;
import com.keep.googlekeepspringboot.label.Repository.LabelRepository;
import com.keep.googlekeepspringboot.label.Dto.CreateLabelRequest;
import com.keep.googlekeepspringboot.notes.Entity.Note;
import com.keep.googlekeepspringboot.notes.Repository.NoteRepository;

public class LabelServiceImpl implements ILabelService {
	
	private final LabelRepository labelRepository;

    public LabelServiceImpl() {
        this.labelRepository = new LabelRepository();
    }
	@Override
	public List<Label> getAllLabel() {
		return new ArrayList<>(labelRepository.getLabels().values());
	}
	@Override
	public String addLabel(Label label) {
		labelRepository.addLabel(label.getLabelId(),label);
	        return label.getLabelId();
	}
	
	public Label getLabel(CreateLabelRequest createLabelRequest){
		Label l1=new Label();
		return l1;
        
    }


}
