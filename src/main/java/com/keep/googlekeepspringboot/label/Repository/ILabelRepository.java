package com.keep.googlekeepspringboot.label.Repository;

import java.util.List;

import com.keep.googlekeepspringboot.label.Entity.Label;

public interface ILabelRepository {

	    int saveLabel(Label label);

	    int updateLabel(Label label);

	    int deleteLabelById(Long id);

	    List<Label> findAllLabel();
}
