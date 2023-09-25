package DZ6.src.main.java.ru.geekbrains.lesson6.notes.core.application.interfaces;

import DZ6.src.main.java.ru.geekbrains.lesson6.notes.core.domain.Note;

import java.util.Collection;

public interface NotesDatabaseContext {

    Collection<Note> getAll();

    boolean saveChanges();

}
