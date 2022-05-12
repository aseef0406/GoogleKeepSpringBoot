package com.keep.googlekeepspringboot.label.Repository;

import java.util.HashMap;

import com.keep.googlekeepspringboot.label.Entity.Label;
import com.keep.googlekeepspringboot.notes.Entity.Note;

public class LabelRepository {

	
	private HashMap<String, Label> labels = new HashMap<>();

    public HashMap<String, Label> getLabels() {
        return labels;
    }

    public void setLabels(HashMap<String, Label> labels) {
        this.labels = labels;
    }

    public String addLabel(String labelId, Label label) {
        labels.put(labelId,label);
		return labelId;
    }
}
