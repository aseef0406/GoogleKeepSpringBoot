package com.keep.googlekeepspringboot.notes.Service.impl;

import com.keep.googlekeepspringboot.notes.Dto.CreateNoteRequest;
import com.keep.googlekeepspringboot.notes.Dto.UpdateNoteRequest;
import com.keep.googlekeepspringboot.notes.Entity.Label;
import com.keep.googlekeepspringboot.notes.Entity.Note;
import com.keep.googlekeepspringboot.notes.Repository.NoteRepository;
import com.keep.googlekeepspringboot.notes.Service.INoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NoteService implements INoteService {

    @Autowired
    private NoteRepository noteRepository;
    public NoteService() {
        this.noteRepository = new NoteRepository();
    }

    @Override
    public List<Note> getAllNotes() {
    	return new ArrayList<>(noteRepository.getAllNotes());
    }

    @Override
    public String addNote(Note note) {
        String noteId = noteRepository.addNote(note);
        return noteId;
    }

    @Override
    public String updateNote(Note note) {
        String noteId = noteRepository.updateNote(note);
        return noteId;
    }
    

    public Note getNote(CreateNoteRequest createNoteRequest){
        Note note = new Note();
        note.setTitle(createNoteRequest.title);
        note.setMessage(createNoteRequest.message);
       return note;
    }
    public Note updateNoteField(UpdateNoteRequest updateNoteRequest){
        Note note = new Note();
        note.setNoteId(updateNoteRequest.noteId);
        note.setTitle(updateNoteRequest.title);
        note.setMessage(updateNoteRequest.message);
       return note;
    }
}
