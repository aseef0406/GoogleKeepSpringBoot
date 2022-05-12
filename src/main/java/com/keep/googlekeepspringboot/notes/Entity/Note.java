package com.keep.googlekeepspringboot.notes.Entity;

import java.util.List;
import java.util.UUID;


public class Note {

    private String noteId;
    private String title;
    private String message;
    private Reminder reminder;
    private List<Collabrator> collabrator;
    private Status status;
    private Label label;
    private User user;


//    Notes
//	/getNotes
//    no parameter
//    createNote
//            noteRequest
//    parameter =>Note { id/autoincreement, title,message,
//            reminder,collabarator,status,label,userId }
//    noteId=>UUID
//    title=>string
//    message=>string
//    Reminder=> Class
//    List<Collabarator> collabList =>Class <sand1,sand2,aseef>.
//            Notes
//    collabrator=“1123,1111,1234”
//																		  <username,noteid> 																			<sand1,1>
//																			<sand2,1>
//																			<aseef,1>
//																			<aseef,2>
//    Status => Enum{Active,Trash,Removed,Archived}
//    List<Label>=> List<Class>
//    userId => UUID
//            createdDate
//    updateDate
//            createdBy



//    public Note(){
//        this.noteId = UUID.randomUUID();
//    }


    public Note() {
        this.noteId = "Note_"+UUID.randomUUID().toString().substring(0,5);
    }

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

    public Reminder getReminder() {
        return reminder;
    }

    public void setReminder(Reminder reminder) {
        this.reminder = reminder;
    }

    public List<Collabrator> getCollabrator() {
        return collabrator;
    }

    public void setCollabrator(List<Collabrator> collabrator) {
        this.collabrator = collabrator;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
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

    @Override
    public String toString() {
        return "Note{" +
                "noteId='" + noteId + '\'' +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", reminder=" + reminder +
                ", collabrator=" + collabrator +
                ", status=" + status +
                ", label=" + label +
                ", user=" + user +
                '}';
    }
}
