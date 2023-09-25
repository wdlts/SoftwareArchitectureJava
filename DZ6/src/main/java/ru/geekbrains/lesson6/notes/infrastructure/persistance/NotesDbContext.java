package DZ6.src.main.java.ru.geekbrains.lesson6.notes.infrastructure.persistance;

import DZ6.src.main.java.ru.geekbrains.lesson6.database.NotesDatabase;
import DZ6.src.main.java.ru.geekbrains.lesson6.database.NotesRecord;
import DZ6.src.main.java.ru.geekbrains.lesson6.notes.core.application.interfaces.NotesDatabaseContext;
import DZ6.src.main.java.ru.geekbrains.lesson6.notes.core.domain.Note;
import DZ6.src.main.java.ru.geekbrains.lesson6.notes.infrastructure.persistance.configurations.NoteConfiguration;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

public class NotesDbContext extends DbContext implements NotesDatabaseContext {


    @Override
    public Collection<Note> getAll() {
        Collection<NotesRecord> records = ((NotesDatabase) database).getNotesTable().getRecords();
        return records.stream()
                .map(record -> new Note(
                        record.getId(),
                        record.getUserId(),
                        record.getTitle(),
                        record.getDetails(),
                        record.getCreationDate()))
                .collect(Collectors.toList());
    }


    @Override
    public boolean saveChanges() {
        return true;
    }

    public Database getDatabase() {
        return this.database;
    }


    public NotesDbContext(Database database) {
        super(database);
    }

    @Override
    protected void onModelCreating(ModelBuilder builder) {
        builder.applyConfiguration(new NoteConfiguration());
    }


}
