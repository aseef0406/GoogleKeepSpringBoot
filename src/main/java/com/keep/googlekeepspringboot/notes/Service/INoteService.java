package com.keep.googlekeepspringboot.notes.Service;

import com.keep.googlekeepspringboot.notes.Entity.Note;

import java.util.List;

public interface INoteService {

    List<Note> getAllNotes();
    String addNote(Note note);
}
