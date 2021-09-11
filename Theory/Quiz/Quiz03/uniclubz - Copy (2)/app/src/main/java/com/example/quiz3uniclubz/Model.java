package com.example.quiz3uniclubz;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student_table")
public class Model {
    @PrimaryKey(autoGenerate = true)
    int id;
    @NonNull

    @ColumnInfo(name = "name")
    public String name;
    @ColumnInfo(name = "nid")
    public String nid;
    @ColumnInfo(name = "priority")
    public String priority;


    public Model(@NonNull String name, @NonNull String nid, @NonNull String priority) {
        this.name = name;
        this.nid = nid;
        this.priority = priority;
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

    public String getPriority() {
        return priority;
    }

    public int priority() {
        return 0;
    }

    public void setId(int id) {
        this.id = id;
    }

}


