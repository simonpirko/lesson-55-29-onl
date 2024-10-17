package by.tms.lesson5529onl.controller;

import by.tms.lesson5529onl.entity.Note;
import by.tms.lesson5529onl.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author simonpirko
 * Created on 17.10.24
 */

@Controller
@RequestMapping("/note")
public class NoteController {

    @Autowired
    private NoteRepository noteRepository;

    @GetMapping
    public String note(Model model) {
        List<Note> all = noteRepository.findAll();
        model.addAttribute("notes", all);
        return "note";
    }

    @PostMapping("/add")
    public String add(Note note) {
        noteRepository.save(note);
        return "redirect:/note";
    }

    @PostMapping("/remove")
    public String add(@RequestParam Long id) {
        noteRepository.deleteById(id);
        return "redirect:/note";
    }
}
