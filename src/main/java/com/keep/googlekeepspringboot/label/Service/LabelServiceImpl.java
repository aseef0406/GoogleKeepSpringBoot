package com.keep.googlekeepspringboot.label.Service;

import java.util.*;

import com.keep.googlekeepspringboot.label.Entity.Label;
import com.keep.googlekeepspringboot.notes.Entity.Note;

public class LabelServiceImpl implements LabelService {
      Note note=new Note();
      UUID noteId=note.getNoteId();
	@Override
	public List<Label> getAllLabel() {
		List<Label> labels = new ArrayList<>();
		Iterator<Label> iter= labels.iterator();
            while(iter.hasNext()) {
            	
            }
		return labels;
	}

	@Override
	public void addLabel(Label label) {
		HashMap<UUID,Label> labelData = new HashMap<>();
		labelData.put(noteId, label);
		
	}

}
