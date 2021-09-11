package com.example.quiz3uniclubz;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student_table")
public class Model  implements Parcelable{
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

    protected Model(Parcel in) {
        id = in.readInt();
        name = in.readString();
        nid = in.readString();
        priority = in.readString();
    }

    public static final Creator<Model> CREATOR = new Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel in) {
            return new Model(in);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(name);
        dest.writeString(nid);
        dest.writeString(priority);
    }
}


