package com.keep.googlekeepspringboot.label.Service;

import java.util.List;

import com.keep.googlekeepspringboot.label.Entity.Label;

public interface ILabelService {
	public List<Label> getAllLabel();
	public String addLabel(Label label);
}
