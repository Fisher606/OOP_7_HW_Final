package controller;

import model.Note;
import model.NoteOperable;

import java.util.List;

public class NoteController implements NoteControllable{
    private NoteOperable noteOperable;

    public NoteController(NoteOperable noteOperable) {
        this.noteOperable = noteOperable;
    }

    public void createNote(String title, String content) {
        noteOperable.createNote(title, content);
    }

    public void updateNote(String id, String newTitle, String newContent) {
        noteOperable.updateNote(id, newTitle, newContent);
    }

    public void deleteNote(String id) {
        noteOperable.deleteNote(id);
    }

    public Note findById(String id) {
        return noteOperable.findById(id);
    }

    public List<String> readAllNotes() {
        return noteOperable.readAllNotes();
    }
}