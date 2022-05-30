package com.keep.googlekeepspringboot.notes.Entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class Note {

    private String noteId;
    private String title;
    private String message;
    private Reminder reminder;
    private List<Collabrator> collabrators;
    private Status status;
    private List<Label> labels;
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
        this.noteId = "Note_"+UUID.randomUUID().toString().substring(0,4);
    }

  

	public Note(String noteId, String title, String message, Reminder reminder, List<Collabrator> collabrator,
		Status status, List<Label> labels, User user) {
	super();
	this.noteId = noteId;
	this.title = title;
	this.message = message;
	this.reminder = reminder;
	this.collabrators = collabrator;
	this.status = status;
	this.labels = labels;
	this.user = user;
}

public List<Collabrator>getCollaborators(String collabrators_id){
	//collabrators_id="1,2,3"
	if(collabrators_id!=null) {
		String[] getting_all_collab_ids = collabrators_id.split(",");
		 ArrayList<Collabrator> l=new ArrayList<Collabrator>();
		 for(int i=0;i<getting_all_collab_ids.length;i++) {
			 Collabrator coll=new Collabrator(getting_all_collab_ids[i]) ;
			 l.add(coll);
		 }
		 return l;
	}
	return null;
	 
}

public List<Label> getLabels(String label_ids){
	if(label_ids!=null) {
		String[] getting_all_label_ids = label_ids.split(",");
		 ArrayList<Label> l=new ArrayList<Label>();
		 for(int i=0;i<getting_all_label_ids.length;i++) {
			 Label label=new Label(getting_all_label_ids[i]);
			 l.add(label);
		 }
		 return l;
	}
	return null;
}

public Status getStatus(int status) {
	if(status==-1) {
		return Status.REMOVED; 
	}else if(status==0) {
		return Status.ARCHIVED;
	}else {
		return Status.ACTIVE;
	}
}


	public Note(String noteId, String title, String message, String reminder_id, String collabrators_id, int status, String label_ids,
			String user_id) {
		this.noteId = noteId;
		this.title = title;
		this.message = message;
		this.reminder = new Reminder(reminder_id);
		this.collabrators = getCollaborators(collabrators_id);
		this.status = getStatus(status);
		this.labels = getLabels(label_ids);
		this.user = new User(user_id);
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
        return collabrators;
    }

    public void setCollabrator(List<Collabrator> collabrator) {
        this.collabrators = collabrator;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Label> getLabels() {
        return labels;
    }

    public void setLabels(List<Label> labels) {
        this.labels = labels;
    }

    @Override
    public String toString() {
        return "Note{" +
                "noteId='" + noteId + '\'' +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                ", reminder=" + reminder +
                ", collabrator=" + collabrators +
                ", status=" + status +
                ", label=" + labels +
                ", user=" + user +
                '}';
    }
}
