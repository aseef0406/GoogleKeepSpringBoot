package com.keep.googlekeepspringboot.notes.Dto;

import com.keep.googlekeepspringboot.notes.Entity.*;

import java.util.List;

public class CreateNoteRequest {
    public String title;
    public String message;
	public Reminder reminder;
    public String collabrators;
    public String status;
    public Label label;
    public User user;
    public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Reminder getReminder() {
		return reminder;
	}
	public void setReminder(Reminder reminder) {
		this.reminder = reminder;
	}
	public String getCollabrators() {
		return collabrators;
	}
	public void setCollabrators(String collabrators) {
		this.collabrators = collabrators;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Label getLabel() {
		return label;
	}
	public void setLabel(Label label) {
		this.label = label;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public CreateNoteRequest(String title, String message, Reminder reminder, String collabrators, String status,
			Label label, User user) {
		super();
		this.title = title;
		this.message = message;
		this.reminder = reminder;
		this.collabrators = collabrators;
		this.status = status;
		this.label = label;
		this.user = user;
	}
	public CreateNoteRequest() {
		
	}
	
	



}
