package DZ6.src.main.java.ru.geekbrains.lesson6.notes.infrastructure.persistance;

import DZ6.src.main.java.ru.geekbrains.lesson6.database.Entity;
import DZ6.src.main.java.ru.geekbrains.lesson6.database.NotesDatabase;
import DZ6.src.main.java.ru.geekbrains.lesson6.database.NotesRecord;

import java.util.Collection;

public abstract class DbContext {

    protected Database database;

    public DbContext(Database database) {
        this.database = database;
    }

    protected abstract void onModelCreating(ModelBuilder builder);

    public boolean saveChanges(){
        try {
            Collection<NotesRecord> records = ((NotesDatabase) database).getNotesTable().getRecords();
            for (NotesRecord record : records) {
                switch (record.getEntity()) {
                    case NEW:
                        break;
                    case MODIFIED:
                        break;
                    case DELETED:
                        break;
                    case UNCHANGED:
                        break;
                }
                record.setEntity(Entity.UNCHANGED);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}

class ModelBuilder {

    public ModelBuilder applyConfiguration(ModelConfiguration configuration){
        //TODO: добавление конфигурации маппинга объекта некоторого типа к структуре таблицы БД
        return this;
    }

}
