package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.Random;

@Entity
@Table(name = "notes")
public class Note {
    @Id
    private int id;
    private String title;
    private String content;
    private Date createdNote;

    public Note() {
    }

    public Note(String title, String content, Date createdNote) {
        this.id = new Random().nextInt(10000);
        this.title = title;
        this.content = content;
        this.createdNote = createdNote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatedNote() {
        return createdNote;
    }

    public void setCreatedNote(Date createdNote) {
        this.createdNote = createdNote;
    }
}
