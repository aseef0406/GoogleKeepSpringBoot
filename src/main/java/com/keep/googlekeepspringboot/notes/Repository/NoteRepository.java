package com.keep.googlekeepspringboot.notes.Repository;

import com.keep.googlekeepspringboot.notes.Entity.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.UUID;

@Repository
public class NoteRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public String addNote(Note note){
        String sql = "Insert into tbl_note values(?,?,?,?,?,?,?,?,?,?)";
        System.out.println(note);
        int count = jdbcTemplate.update(sql,note.getNoteId(),note.getTitle(),
                note.getMessage(),note.getStatus(),note.getReminder(),note.getCollabrator(),null,null,null,null);
        return note.getNoteId();
    }

}
