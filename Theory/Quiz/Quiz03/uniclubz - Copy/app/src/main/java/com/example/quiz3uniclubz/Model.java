package com.example.quiz3uniclubz;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student_table")
public class Model {

    @PrimaryKey(autoGenerate = true)

    String name,nid;
    private int priority;



    public Model(String name, String nid, int priority) {
        this.name = name;
        this.nid = nid;
        this.priority = priority;
    }
    public int getPriority() {
        return priority;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }


}


