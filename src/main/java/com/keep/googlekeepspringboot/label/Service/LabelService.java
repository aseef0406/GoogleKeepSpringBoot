package com.keep.googlekeepspringboot.label.Service;

import java.util.List;

import com.keep.googlekeepspringboot.label.Entity.Label;

public interface LabelService {
	public List<Label> getAllLabel();
	public void addLabel(Label label);
}
