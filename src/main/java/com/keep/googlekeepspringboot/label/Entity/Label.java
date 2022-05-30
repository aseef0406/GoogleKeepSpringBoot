package com.keep.googlekeepspringboot.label.Entity;

public class Label {
	private String labelId;
	private String label;
	private long userId;
	public String noteId;


	public Label() {
		
	}

	public Label(String labelId, String label, long userId, String noteId) {
		super();
		this.labelId = labelId;
		this.label = label;
		this.userId = userId;
		this.noteId = noteId;
	}

	public String getLabelId() {
		return labelId;
	}

	public void setLabelId(String labelId) {
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

	public String getNoteId() {
		return noteId;
	}

	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}

	@Override
	public String toString() {
		return "label [labelId=" + labelId + ", label=" + label + ", userId=" + userId + ", noteId=" + noteId + "]";
	}

}
