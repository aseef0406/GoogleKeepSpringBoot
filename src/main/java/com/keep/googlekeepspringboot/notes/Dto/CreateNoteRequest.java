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


}
