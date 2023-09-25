package DZ6.src.main.java.ru.geekbrains.lesson6.notes.presentation.queries.controllers;

import DZ6.src.main.java.ru.geekbrains.lesson6.notes.core.application.interfaces.NoteEditor;
import DZ6.src.main.java.ru.geekbrains.lesson6.notes.core.domain.Note;

import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Optional;

public class NotesController extends Controller{

    private final NoteEditor notesEditor;

    public NotesController(NoteEditor notesEditor){
        this.notesEditor = notesEditor;
    }

    public void routeAddNote(Note note){
        this.notesEditor.add(note);
    }

    public void routeRemoveNote(Note note){
        this.notesEditor.remove(note);
    }
    public void routeEditNote(Note note) {
        Note existingNote = notesEditor.getById(note.getId()).orElse(null);
        if (existingNote != null) {
            existingNote.setTitle(note.getTitle());
            existingNote.setDetails(note.getDetails());
            existingNote.setEditDate(new Date());
            if (notesEditor.edit(existingNote)) {
                System.out.println("Note with ID " + note.getId() + " updated.");
            } else {
                System.out.println("Unable to update note with ID " + note.getId() + ".");
            }
        } else {
            System.out.println("Note with ID " + note.getId() + " not found.");
        }
    }

    public void routeRemoveNoteById(Integer noteId) {
        Note note = notesEditor.getById(noteId).orElse(null);
        if (note != null) {
            if (notesEditor.remove(note)) {
                System.out.println("Note with ID " + noteId + " deleted.");
            } else {
                System.out.println("Unable to delete note with ID " + noteId + ".");
            }
        } else {
            System.out.println("Note with ID " + noteId + " not found.");
        }
    }

    public void routeGetAll(){
        this.notesEditor.printAll();
    }

    public void routeEditLastNote(String newTitle, String newDetails) {
        Collection<Note> allNotes = notesEditor.getAll();

        Note lastNote = allNotes.stream()
                .max(Comparator.comparingInt(Note::getId))
                .orElse(null);

        if (lastNote != null) {
            lastNote.setTitle(newTitle);
            lastNote.setDetails(newDetails);
            lastNote.setEditDate(new Date());

            if (notesEditor.edit(lastNote)) {
                System.out.println("Last note updated successfully.");
            } else {
                System.out.println("Unable to update last note.");
            }
        } else {
            System.out.println("Editable notes not found.");
        }
    }

    public Optional<Note> getNoteById(int noteId) {
        return notesEditor.getById(noteId);
    }

    public Optional<Note> getLastNote() {
        return notesEditor.getAll().stream()
                .max(Comparator.comparingInt(Note::getId));
    }

    public void saveChanges() {
        notesEditor.saveChanges();
    }






}
