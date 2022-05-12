package com.keep.googlekeepspringboot.notes.Controller;
import com.keep.googlekeepspringboot.notes.Dto.CreateNoteRequest;
import com.keep.googlekeepspringboot.notes.Entity.Note;
import com.keep.googlekeepspringboot.notes.Service.impl.NoteService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class NoteController {

    NoteService noteService = new NoteService();

    @GetMapping("/getNotes")
    public @ResponseBody List<Note> getNotes(){
        return noteService.getAllNotes();
    }

    @PostMapping("/addNote")
    public @ResponseBody String addNote(@RequestBody CreateNoteRequest createNoteRequest){
        Note note = noteService.getNote(createNoteRequest);
        String noteId = noteService.addNote(note);
        return noteId;
    }
}
