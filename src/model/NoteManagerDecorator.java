package model;

import java.util.List;

public class NoteManagerDecorator implements NoteOperable, Logable{
    private NoteOperable noteOperable;
    private  Logable logable;

    public NoteManagerDecorator(NoteOperable noteOperable, Logable logable) {
        this.noteOperable = noteOperable;
        this.logable = logable;
    }

    @Override
    public void writeLog(String message) {
        logable.writeLog(message);
    }

    @Override
    public void createNote(String title, String content) {
        logable.writeLog("Создать запись: " + title);
        noteOperable.createNote(title, content);
    }

    @Override
    public void updateNote(String id, String newTitle, String newContent) {
        logable.writeLog("Обновление записи с ID: " + id);
        noteOperable.updateNote(id, newTitle, newContent);
    }

    @Override
    public void deleteNote(String id) {
        logable.writeLog("Удаление записи с ID: " + id);
        noteOperable.deleteNote(id);
    }

    @Override
    public Note findById(String id) {
        logable.writeLog("Попытка найти запись с идентификатором ID: " + id);
        return noteOperable.findById(id);
    }

    @Override
    public List<String> readAllNotes() {
        logable.writeLog("Чтение записей");
        return noteOperable.readAllNotes();
    }
}