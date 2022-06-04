package com.keep.googlekeepspringboot.notes.Dto;

public class UpdateNoteRequest extends CreateNoteRequest {
  public String noteId;

  public UpdateNoteRequest() {
	  
  }
  
public UpdateNoteRequest(String noteId) {
	super();
	this.noteId = noteId;
}

public String getNoteId() {
	return noteId;
}

public void setNoteId(String noteId) {
	this.noteId = noteId;
}
}
