package com.keep.googlekeepspringboot.notes.Controller;
import com.keep.googlekeepspringboot.notes.Dto.CreateNoteRequest;
import com.keep.googlekeepspringboot.notes.Dto.UpdateNoteRequest;
import com.keep.googlekeepspringboot.notes.Entity.Note;
import com.keep.googlekeepspringboot.notes.Service.impl.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class NoteController {

    @Autowired
    private NoteService noteService;

    @GetMapping("/getNotes")
    public @ResponseBody List<Note> getNotes(){
        return noteService.getAllNotes();
    }

    @PostMapping("/addNote")
    public @ResponseBody String addNote(@RequestBody CreateNoteRequest createNoteRequest){
        Note note = noteService.getNote(createNoteRequest);
        System.out.println(note);
        String noteId = noteService.addNote(note);
        System.out.println(note);
        return noteId;
    }
    
    @PutMapping("/updateNote")
    public @ResponseBody String updateNote(@RequestBody UpdateNoteRequest updateNoteRequest){
    	 System.out.println(updateNoteRequest);
    	Note note = noteService.updateNoteField(updateNoteRequest);
        System.out.println(note);
        String noteId = noteService.updateNote(note);
        System.out.println(note);
        return noteId;
    }
}
