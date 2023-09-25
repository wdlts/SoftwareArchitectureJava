package DZ6.src.main.java.ru.geekbrains.lesson6.database;

import DZ6.src.main.java.ru.geekbrains.lesson6.notes.infrastructure.persistance.Database;

public class NotesDatabase implements Database {

    private NotesTable notesTable;

    public NotesTable getNotesTable() {
        if (notesTable == null)
            notesTable = new NotesTable();
        return notesTable;
    }
}
