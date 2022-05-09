package com.keep.googlekeepspringboot.label.Entity;

public class label {
	private int labelId;
	private String label;
	private long userId;
	public int noteId;

	label() {
	}

	label(String label) {
		this.label = label;

	}

	public int getLabelId() {
		return labelId;
	}

	public void setLabelId(int labelId) {
		this.labelId = labelId;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public int getNoteId() {
		return noteId;
	}

	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}

	@Override
	public String toString() {
		return "label [labelId=" + labelId + ", label=" + label + ", userId=" + userId + ", noteId=" + noteId + "]";
	}

}
