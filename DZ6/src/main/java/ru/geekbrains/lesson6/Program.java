package DZ6.src.main.java.ru.geekbrains.lesson6;


import DZ6.src.main.java.ru.geekbrains.lesson6.database.NotesDatabase;
import DZ6.src.main.java.ru.geekbrains.lesson6.database.NotesRecord;
import DZ6.src.main.java.ru.geekbrains.lesson6.notes.core.application.ConcreteNoteEditor;
import DZ6.src.main.java.ru.geekbrains.lesson6.notes.core.domain.Note;
import DZ6.src.main.java.ru.geekbrains.lesson6.notes.infrastructure.persistance.NotesDbContext;
import DZ6.src.main.java.ru.geekbrains.lesson6.notes.presentation.queries.controllers.NotesController;
import DZ6.src.main.java.ru.geekbrains.lesson6.notes.presentation.queries.views.NotesConsolePresenter;

import java.util.Date;
import java.util.Optional;

public class Program {

    public static void main(String[] args) {
        NotesController controller = new NotesController(
                new ConcreteNoteEditor(new NotesDbContext(new NotesDatabase()), new NotesConsolePresenter()));

        System.out.println("Existing notes:");
        controller.routeGetAll();
        System.out.println();

        Note newNote = new Note(5463345, 0, "New note!!!!", "New details!!!", new Date());
        System.out.println("Adding new note...");
        controller.routeAddNote(newNote);
        System.out.println(newNote);

        System.out.println();

        Note editNote = new Note(5463345, 0, "Updated note!!!", "Updated details!!!!", new Date());
        System.out.println("Note editing...");
        System.out.println("Before editing:");
        displayNoteDetails(controller, 5463345);
        System.out.println();
        controller.routeEditNote(editNote);

        System.out.println("Notes after editing:");
        controller.getNoteById(5463345);
        System.out.println();

        int removeNoteId = 5463345;
        System.out.println("Deleting note...");
        System.out.println("Before delete:");
        displayNoteDetails(controller, removeNoteId);
        System.out.println();
        controller.routeRemoveNoteById(removeNoteId);

        System.out.println("Note before delete:");
        controller.routeGetAll();
        System.out.println();

        System.out.println("Editing last note...");
        System.out.println("Before editing:");
        displayLastNoteDetails(controller);
        System.out.println();
        controller.routeEditLastNote("Last note updated", "Last details under update");

        System.out.println("Last note after editing:");
        controller.routeGetAll();
        System.out.println();
    }



    private static void displayNoteDetails(NotesController controller, int noteId) {
        Optional<Note> note = controller.getNoteById(noteId);
        note.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Note with ID " + noteId + " not found.")
        );
    }

    private static void displayLastNoteDetails(NotesController controller) {
        Optional<Note> note = controller.getLastNote();
        note.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Notes not found.")
        );
    }


}
