package com.keep.googlekeepspringboot.notes.Controller;

import com.keep.googlekeepspringboot.notes.Entity.Note;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class NoteController {

    @GetMapping("/getNotes")
    public @ResponseBody List<Note> getNotes(){
        Note note1 = new Note();
        return new ArrayList<>(
                Arrays.asList(note1)
        );
    }
}
