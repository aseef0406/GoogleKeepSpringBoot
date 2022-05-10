package com.keep.googlekeepspringboot.notes.Entity;

import java.util.UUID;


public class Note {

    private String noteId;
    private String title;
    private String message;


//    public Note(){
//        this.noteId = UUID.randomUUID();
//    }


    public String getNoteId() {
        return noteId;
    }

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

    @Override
    public String toString() {
        return "Note{" +
                "noteId=" + noteId +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
