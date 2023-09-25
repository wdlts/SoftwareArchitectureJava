package DZ6.src.main.java.ru.geekbrains.lesson6.database;

import java.util.Date;

public class NotesRecord {

    private static int counter = 1000;

    {
        id = ++counter;
    }

    public NotesRecord(String title, String details) {
        this.title = title;
        this.details = details;
        creationDate = new Date();
        this.entity = Entity.UNCHANGED;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setEditDate(Date editDate) {
        this.editDate = editDate;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getDetails() {
        return details;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getEditDate() {
        return editDate;
    }

    public Entity getEntity() {
        return entity;
    }

    private int id;
    private int userId;

    private String title;

    private String details;

    private Date creationDate;
    private Date editDate;
    private Entity entity;


}
