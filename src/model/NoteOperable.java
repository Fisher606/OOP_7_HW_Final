package model;

import java.util.List;

public interface NoteOperable {
    void createNote(String title, String content);

    void updateNote(String id, String newTitle, String newContent);

    void deleteNote(String id);

    Note findById(String id);

    List<String> readAllNotes();
}