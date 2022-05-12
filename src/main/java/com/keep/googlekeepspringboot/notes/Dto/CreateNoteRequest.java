package com.keep.googlekeepspringboot.notes.Dto;

import com.keep.googlekeepspringboot.notes.Entity.*;

import java.util.List;

public class CreateNoteRequest {
    public String title;
    public String message;
    public Reminder reminder;
    public List<Collabrator> collabrator;
    public Status status;
    public Label label;
    public User user;


}
