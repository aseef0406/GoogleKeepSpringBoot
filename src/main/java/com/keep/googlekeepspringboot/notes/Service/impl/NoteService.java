package com.keep.googlekeepspringboot.notes.Service.impl;

import com.keep.googlekeepspringboot.notes.Entity.Note;
import com.keep.googlekeepspringboot.notes.Repository.NoteRepository;
import com.keep.googlekeepspringboot.notes.Service.INoteService;

import java.util.ArrayList;
import java.util.List;

public class NoteService implements INoteService {

    private final NoteRepository noteRepository;

    public NoteService() {
        this.noteRepository = new NoteRepository();
    }

    @Override
    public List<Note> getAllNotes() {
        return new ArrayList<>(noteRepository.getNotes().values());
    }

    @Override
    public String addNote(Note note) {
        noteRepository.addNote(note.getNoteId(),note);
        return note.getNoteId();
    }
}
