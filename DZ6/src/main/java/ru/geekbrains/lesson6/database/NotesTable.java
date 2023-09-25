package DZ6.src.main.java.ru.geekbrains.lesson6.database;

import DZ6.src.main.java.ru.geekbrains.lesson6.notes.core.domain.Note;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class NotesTable {

    private Random random = new Random();

    private Collection<NotesRecord> records;

    public Collection<NotesRecord> getRecords() {
        if (records == null)
        {
            records = new ArrayList<>();
            int recordsCount =  5  + random.nextInt(10);
            for (int i = 0; i < recordsCount; i++){
                records.add(new NotesRecord("title #" + i, "details #" + i));
            }
        }
        return records;
    }

    public boolean addRecord(NotesRecord record) {
        if (records == null) {
            records = new ArrayList<>();
        }
        return records.add(record);
    }

    public boolean updateRecord(NotesRecord record) {
        for (NotesRecord rec : records) {
            if (rec.getId() == record.getId()) {
                rec.setTitle(record.getTitle());
                rec.setDetails(record.getDetails());
                return true;
            }
        }
        return false;
    }

    public boolean removeRecord(NotesRecord record) {
        return records.removeIf(rec -> rec.getId() == record.getId());
    }

    public NotesRecord getRecordById(int id) {
        for (NotesRecord rec : records) {
            if (rec.getId() == id) {
                return rec;
            }
        }
        return null;
    }


}
