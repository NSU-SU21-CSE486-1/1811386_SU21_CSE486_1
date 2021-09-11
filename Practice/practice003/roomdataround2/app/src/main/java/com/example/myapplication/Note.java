package com.example.myapplication;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student_table")

public class Note {
    @PrimaryKey(autoGenerate = true)

    private int id;

    private String name;

    private String nid;

    private int priority;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNid() {
        return nid;
    }

    public int getPriority() {
        return priority;
    }

    public Note(String name, String nid, int priority) {

        this.name = name;
        this.nid = nid;
        this.priority = priority;
    }

    public void setId(int id) {
        this.id = id;
    }
}
