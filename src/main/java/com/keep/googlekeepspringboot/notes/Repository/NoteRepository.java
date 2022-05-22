package com.keep.googlekeepspringboot.notes.Repository;

import com.keep.googlekeepspringboot.notes.Entity.Note;

import java.util.HashMap;
import java.util.UUID;

public class NoteRepository {

    private HashMap<String, Note> notes = new HashMap<>();

    public HashMap<String, Note> getNotes() {
        return notes;
    }

    public void setNotes(HashMap<String, Note> notes) {
        this.notes = notes;
    }

    public void addNote(String noteId, Note note) {
        notes.put(noteId,note);
    }
}
