package DZ6.src.main.java.ru.geekbrains.lesson6.notes.core.application.interfaces;

import DZ6.src.main.java.ru.geekbrains.lesson6.notes.core.domain.Note;

import java.util.Collection;
import java.util.Optional;

public interface NoteEditor extends Editor<Note, Integer> {

    boolean add(Note item);
    boolean edit(Note item);
    boolean remove(Note item);
    Optional<Note> getById(Integer id);
    Collection<Note> getAll();
    void printAll();
    void saveChanges();
}
