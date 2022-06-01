package com.keep.googlekeepspringboot.notes.Repository;

import com.keep.googlekeepspringboot.label.Entity.Label;
import com.keep.googlekeepspringboot.notes.Entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

@Repository
public class NoteRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String addNote(Note note){
        String sql = "Insert into tbl_note values(?,?,?,?,?,?,?,?,?,?)";
        System.out.println(note);
        jdbcTemplate.update(sql,note.getNoteId(),note.getTitle(),
                note.getMessage(),note.getStatus(),note.getReminder(),note.getCollabrator(),null,null,null,null);
        return note.getNoteId();
    }
    public List<Note>getAllNotes(){
    	  String sql = "SELECT * FROM tbl_note";
	        return jdbcTemplate.query(
	                sql,
	                (rs, rowNum) ->
	                        new Note(
	                                rs.getString("noted_id"),
	                                rs.getString("title"),
	                                rs.getString("message"),
	                                rs.getString("reminder_id"),
	                                rs.getString("collabrators_id"),
	                                rs.getInt("status"),
	                                rs.getString("label_ids"),
	                                rs.getString("user_id")
	                        )
	        );
    }
    
    public String updateNote(Note note){

    	System.out.println("note.getNoteId() inside update Note"+" "+note.getNoteId());
    	if(note.getNoteId()!=null) {
    		String updateQuery = "update tbl_note set title = ? , message = ? where noted_id = ?";
    		jdbcTemplate.update(updateQuery, note.getTitle(), note.getMessage(),note.getNoteId());
    	}
       
        return note.getNoteId();
    }
}



